package java07151;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class J1 {

	public static void main(String[] args) {
//		HashSet<String> ÀçÇĞ=new HashSet<>();
//		HashSet<String> »ó¹Î=new HashSet<>();
//		
//		ÀçÇĞ.add("Â¥Àå¸é"); ÀçÇĞ.add("ººÀ½¹ä");
//		ÀçÇĞ.add("µ·°¡½º"); ÀçÇĞ.add("ÂŞ²Ù¹ÌººÀ½");
//		
//		»ó¹Î.add("±èÄ¡ººÀ½¹ä"); »ó¹Î.add("¶±ººÀÌ");
//		»ó¹Î.add("Â¥Àå¸é"); »ó¹Î.add("µ·°¡½º");
//		
//		HashSet<String>°øÅë=new HashSet<>();
//		
//		Iterator<String> it=ÀçÇĞ.iterator();
//		while(it.hasNext()) {
//			String food=it.next();
//			System.out.println(food);
		
//		}
		HashSet<Integer> num1=new HashSet<>();
		HashSet<Integer> num2=new HashSet<>();
		HashSet<Integer> num3=new HashSet<>();
		
		while(num1.size()<=15) 
			num1.add(Integer.valueOf((int)(Math.random()*50)));

		while(num2.size()<=15) 
			num1.add(Integer.valueOf((int)(Math.random()*50)));
			

		while(num3.size()<=15) 
			num1.add(Integer.valueOf((int)(Math.random()*50)));
			
			
			
		
		
		
	}

}
