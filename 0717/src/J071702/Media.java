package J071702;

public class Media {
	private String id;
	private String title;
	
	
	
	public Media(String id,String title) {
		this.id=id;
		this.title=title;
	}
	@Override
	public String toString() {
		return "ID:"+id+", Á¦¸ñ:"+title;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
