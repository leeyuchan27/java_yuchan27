package java07151;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class J1 {

	public static void main(String[] args) {
//		HashSet<String> ����=new HashSet<>();
//		HashSet<String> ���=new HashSet<>();
//		
//		����.add("¥���"); ����.add("������");
//		����.add("������"); ����.add("�޲ٹ̺���");
//		
//		���.add("��ġ������"); ���.add("������");
//		���.add("¥���"); ���.add("������");
//		
//		HashSet<String>����=new HashSet<>();
//		
//		Iterator<String> it=����.iterator();
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
