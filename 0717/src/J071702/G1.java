package J071702;

import java.util.ArrayList;

public class G1 {

	public static void main(String[] args) {
		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd=new ArrayList<>();
		
		book.add(new book("B1234","자바완전정복","김동형"));
		book.add(new book("B24","완전정복","동형"));
		book.add(new book("B134","안완전정복","형"));
		dvd.add(new DVD("C1234","복","김민"));
		dvd.add(new DVD("C14","민복","드형"));
		dvd.add(new DVD("C4","완전","인준"));
		
		Rental rent =new Rental(dvd.get(0));
		System.out.println(rent);

	}

}
