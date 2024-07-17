package J071702;

public class Rental {
	Media item;
	
	Rental(Media item){
		this.item=item;
	}
	Media getItem() {
		return this.item;
	}
	@Override
	public String toString() {
		return item.toString();
	}
	
}
