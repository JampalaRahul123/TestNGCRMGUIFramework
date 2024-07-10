package methodOverloading;

public class Music {
	String song;
	String artist;
	String album;
	int year;

	public Music(String song, String artist, String album, int year) {
		this.song = song;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}

	public void available(String song) {
		if (this.song == song) {
			System.out.println("Song is available");
		} else {
			System.out.println("Song name isn't right");
		}
	}

	public void available(String song, String album) {
		if (this.song == song) {
			if (this.album == album) {
				System.out.println("Song is available");
			} else {
				System.out.println("Album name isn't right");
			}
		} else {
			System.out.println("Song name isn't right");
		}
	}

	public void available(String song, int year) {
		if (this.song == song) {
			if (this.year == year) {
				System.out.println("Song is available");
			} else {
				System.out.println("Year name isn't right");
			}
		} else {
			System.out.println("Song name isn't right");
		}
	}

	public void available(String song, String artist, String album) {
		if (this.song == song) {
			if (this.artist == artist) {
				if (this.album == album) {
					System.out.println("Song is available");
				} else {
					System.out.println("Album name isn't right");
				}
			} else {
				System.out.println("Artist name isn't right");
			}
		} else {
			System.out.println("Song name isn't right");
		}
	}
}
