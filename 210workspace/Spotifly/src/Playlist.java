/*
 * Purpose: This file represents a Playlist class, which uses an
 * arrayList to store a bunch of Song objects. The playlist can be
 * "played", which is just printing out a string representation of the
 * playlist. Each playlist must have a name, set by the user in the interface.
 */



import java.util.ArrayList;
import java.util.List;

public class Playlist {

	public List<Song> playlistContents;
	public String playlistName;

	/*
	 * Playlist(name, contents) -- takes in a name for the playlist and the contents
	 * for the playlist.
	 */

	public Playlist(String name, List<Song> contents) {

		this.playlistName = name;
		this.playlistContents = contents;

	}
	/*
	 * Playlist(name) -- takes in a string for the playlist name and creates a new
	 * instance of the playlist
	 */

	public Playlist(String name) {
		this.playlistName = name;
		this.playlistContents = new ArrayList<Song>();

	}

	// getName() -- returns the string name of the playlist.

	public String getName() {
		return this.playlistName;
	}

	// addSong(Song) -- takes in a Song object and adds it to the playlist
	public void addSong(Song song) {
		this.playlistContents.add(song);
	}

	/*
	 * play() -- "plays" the playlist by printing out the string versions of the
	 * songs in the order they were added, one song per line
	 */
	public void play() {
		for (int i = 0; i < playlistContents.size(); i++) {
			System.out.println(playlistContents.get(i).toString());

		}
	}

	/*
	 * removeSong(Song) -- takes in a Song object and iterates through the playlist
	 * until it find the song, and then removes it.
	 */

	public void removeSong(Song song) {
		for (int i = 0; i < playlistContents.size(); i++) {
			if (playlistContents.get(i).getArtist().equals(song.getArtist())
					&& playlistContents.get(i).getTitle().equals(song.getTitle())) {
				// Checking if the artist and title match up
				playlistContents.remove(i);
			}
		}
	}

}
