package J071702;

import java.util.ArrayList;

public class G1 {

	public static void main(String[] args) {
		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd=new ArrayList<>();
		
		book.add(new book("B1234","�ڹٿ�������","�赿��"));
		book.add(new book("B24","��������","����"));
		book.add(new book("B134","�ȿ�������","��"));
		dvd.add(new DVD("C1234","��","���"));
		dvd.add(new DVD("C14","�κ�","����"));
		dvd.add(new DVD("C4","����","����"));
		
		Rental rent =new Rental(dvd.get(0));
		System.out.println(rent);

	}

}
