package j0709;

public class Game {
	private String title;
	private String genre;
	private String platForm;
	
	public Game() {}
	public Game(String title,String genre,String platForm) {
		this.title=title;
		this.genre=genre;
		this.platForm=platForm;
	}
	@Override
	public String toString() {
		return title+","+genre+","+platForm;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatform() {
		return platForm;
	}
	public void setPlatform(String platForm) {
		this.platForm = platForm;
	}
	

}
