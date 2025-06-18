/*
 * Purpose: This file represents a Song class, where a song has fields title,
 * artist, and numPlays. The user can access the data about these songs
 * through the main interface, where songs can be added to playlists or 
 * played
 */



public class Song {
	public String title;
	public String artist;
	public int numPlays;

	/*
	 * Song(inTitle, inArtist) -- Takes in two strings and initializes them into the
	 * song object with title, artist, and number of plays fields.
	 */
	public Song(String inTitle, String inArtist) {
		this.title = inTitle;
		this.artist = inArtist;
		this.numPlays = 0;
	}

	// getTitle() -- returns the title of the song
	public String getTitle() {
		return this.title;
	}

	// getArtist() -- returns the artist associated with the song
	public String getArtist() {
		return this.artist;
	}

	// getTimesPlayed() -- returns the number of times a song has been played
	public int getTimesPlayed() {
		return this.numPlays;
	}

	/*
	 * play() -- This function prints out a string representation of a song object,
	 * to simulate "playing" a song, and then adds 1 to the numbers of times the
	 * song has been played.
	 */
	public void play() {
		System.out.println(this.title + " by " + this.artist + ", " + String.valueOf(numPlays) + " play(s)");
		this.numPlays += 1;
	}

	/*
	 * toString -- This function prints out a string representation of a song object
	 * with the title, artist and the number of plays the song has.
	 */
	public String toString() {
		return this.title + " by " + this.artist + ", " + String.valueOf(numPlays) + " play(s)";

	}

}
