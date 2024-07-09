package j0709;

public class Movie {
	private String title;
	private String director;
	private int viewAge;
	
	public Movie() {}
	public Movie(String title,String director,int viewAge) {
		this.title=title;
		this.director=director;
		this.viewAge=viewAge;
	}
	@Override
	public String toString() {
		return title+","+director+","+viewAge;
	}

	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getViewAge() {
		return viewAge;
	}
	public void setViewAge(int viewAge) {
		this.viewAge = viewAge;
	}
}
