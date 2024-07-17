package J071702;

public class Book extends Media{
	private String author;

	public Book(String id,String title,String author) {
		super(id,title);
		this.author=author;
	}
	@Override
	public String toString() {
		return super.toString()+", ÀúÀÚ:"+author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
