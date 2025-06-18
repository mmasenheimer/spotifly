/*
 * Purpose: This file represents a class of user objects, using an
 * arrayList to store them. The collection of users can be printed out
 * in alphabetical order using a TreeMap, and has methods for adding users,
 * checking if a user exists, and logging in, which is called through 
 * the user interface.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserCollection {
	public List<User> users;

	// UserCollection() -- initializes an arrayList for collection of user objects
	public UserCollection() {
		this.users = new ArrayList<User>();

	}

	/*
	 * userExists(username) -- takes in a string representing the username of a
	 * user, and checks if the user exists in the list of users.
	 */
	public boolean userExists(String username) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName().equals(username)) {
				// if the user is found
				return true;
			}
		}
		return false;
	}

	/*
	 * login(username, password) -- takes in a string for username and a string for
	 * password and iterates through the users checking for a match, and if found,
	 * returns the user object, otherwise returns null.
	 */
	public User login(String username, String password) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getName().equals(username) && users.get(i).attemptLogin(password)) {
				// The login was successful
				return users.get(i);
			}
		}
		return null;

	}

	// addUser(add) -- takes in a user and adds it to the list of users
	public void addUser(User add) {
		users.add(add);

	}
	/*
	 * toString() -- returns a giant string of all the users in the collection.
	 * Prints them out in alphabetical order by username.
	 */

	public String toString() {
		String outputString = "{ ";
		Map<String, Integer> finalMap = new TreeMap<String, Integer>();
		// Using a treeMap for sorted keys

		for (int i = 0; i < users.size(); i++) {
			finalMap.put(users.get(i).getName(), users.get(i).playlists.size());
			// Keys are the user's name and the values are number of playlists
		}

		for (Map.Entry<String, Integer> entry : finalMap.entrySet()) {
			outputString += entry.getKey();
			outputString += ": ";
			outputString += String.valueOf(entry.getValue());
			outputString += " playlists, ";
			// Adding all of the data from the TreeMap into the output string.

		}

		outputString += "}";
		return outputString;

	}

}
