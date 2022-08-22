package lab4;

public class CD extends MediaItem{
	
	private String artist;
	private String genre;
	
	
	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public CD(int runtime, String artist, String genre) {
		super(runtime);
		this.artist = artist;
		this.genre = genre;
	}


	public CD(int runtime) {
		super(runtime);
		// TODO Auto-generated constructor stub
	}

}
