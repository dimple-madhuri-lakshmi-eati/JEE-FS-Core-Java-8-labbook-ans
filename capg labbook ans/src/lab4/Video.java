package lab4;

public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private String year_published;

	public Video(int runtime, String director, String genre, String year_published) {
		super(runtime);
		this.director = director;
		this.genre = genre;
		this.year_published = year_published;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear_published() {
		return year_published;
	}

	public void setYear_published(String year_published) {
		this.year_published = year_published;
	}

	public Video(int runtime) {
		super(runtime);
		// TODO Auto-generated constructor stub
	}

}
