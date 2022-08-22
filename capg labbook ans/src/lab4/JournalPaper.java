package lab4;

public class JournalPaper extends WrittenItem{
	
	private String year_published;

	public JournalPaper(String author,String year_published) {
		super(author);
		this.year_published=year_published;
		}

	public String getYear_published() {
		return year_published;
	}

	public void setYear_published(String year_published) {
		this.year_published = year_published;
	}

}
