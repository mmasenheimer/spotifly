/*
 * Purpose: This file represents a Library class, which is a collection
 * of songs from the user. The underlying data type is an arrayList, and
 * this can be accessed through the spotify user interface. Some methods 
 * include adding and removing a song, getting a song, and printing
 * out a string representation of the library of songs.
 */



import java.util.ArrayList;
import java.util.Collections;

public class Library {

	public ArrayList<Song> currLibrary;

	// Library() -- initializes a library of songs into an arrayList.
	public Library() {
		currLibrary = new ArrayList<Song>();

	}

	/*
	 * getSong(title) -- takes in a string title of a song and returns the Song
	 * object if found and null if not found.
	 */
	public Song getSong(String title) {
		for (int i = 0; i < currLibrary.size(); i++) {

			if (currLibrary.get(i).getTitle().equals(title)) {
				// checking for matching titles
				return currLibrary.get(i);

			}
		}
		return null;
	}

	/*
	 * addSong(song) -- takes in a Song object for an argument. Adds the song to the
	 * library (arrayList)
	 */
	public void addSong(Song song) {
		currLibrary.add(song);
	}

	/*
	 * removeSong(song) -- takes in a Song object and checks to see if it exists in
	 * the library and if so, removes it.
	 */

	public void removeSong(Song song) {
		for (int i = 0; i < currLibrary.size(); i++) {
			if (currLibrary.get(i).getArtist().equals(song.getArtist())
					&& currLibrary.get(i).getTitle().equals(song.getTitle())) {
				// Checking to see if both the artist and title match the input song object
				currLibrary.remove(i);
			}
		}

	}

	/*
	 * toString() -- returns a string representation of all the songs in the
	 * library, sorted by song name
	 */

	public String toString() {
		String outputString = "";
		ArrayList<String> finalLine = new ArrayList<String>();
		for (int i = 0; i < currLibrary.size(); i++) {

			finalLine.add(currLibrary.get(i).getTitle());
			// Storing just the titles of the songs in a new list

		}
		Collections.sort(finalLine);

		for (int i = 0; i < finalLine.size(); i++) {
			outputString += getSong(finalLine.get(i)).toString() + "\n";
			// Getting the string version of the song and adding to final string

		}
		return outputString;

	}

}
