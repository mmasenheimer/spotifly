/*
 * Purpose: This file represents a User class, where each
 * user has a username and a password, as well as a list of 
 * their playlists. A few methods include logging into the user
 * accound and playing playlists, all of which is also
 * done through the user interface.
 */



import java.util.ArrayList;
import java.util.List;

public class User {

	public String name;
	public String password;
	public List<Playlist> playlists;

	/*
	 * User(name, password) -- This method initializes a new user into Spotify
	 * through a user name and password field. which the initialization method takes
	 * in the user's user name and password for the account. It initializes the
	 * playlists as an empty arraryList.
	 */
	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.playlists = new ArrayList<Playlist>();

	}

	// getName() -- returns the name of the user
	public String getName() {
		return this.name;
	}

	/*
	 * attemptLogin(inPassword) -- tries to "login" by checking if the inputted
	 * password matches the one associated with the account, and returns true or
	 * false depending on that.
	 */
	public Boolean attemptLogin(String inPassword) {
		if (inPassword.equals(password)) {
			return true;
		}
		return false;
	}

	/*
	 * addPlaylist(newPLaylist) -- takes in a playlist as an argument, and adds the
	 * playlist to the underlying list of playlists associated with a user.
	 */
	public void addPlaylist(Playlist newPlaylist) {
		this.playlists.add(newPlaylist);

	}

	// getPlaylists() -- returns a list of the playlists the user has
	public List<Playlist> getPlaylists() {
		return this.playlists;

	}

	/*
	 * selectPlaylist(name) -- takes in a string of the playlist's name and finds it
	 * in the arraylist of playlists, and plays it.
	 */
	public void selectPlaylist(String name) {
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).getName().equals(name)) {
				playlists.get(i).play();
				// call play method in the playlist class
			}
		}
	}

	// toString() -- returns a string of the name and number of playlists the user
	// has
	public String toString() {
		return name + ", " + String.valueOf(playlists.size()) + " playlists";
	}

}