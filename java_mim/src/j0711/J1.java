package j0711;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class J1 {

	public static void main(String[] args) {
//		BufferedWriter br=null;
//		try {
//		br=new BufferedWriter(new FileWriter("c:/test/data.txt"));
//		String name="이순신";
//		br.write("이순신 34 군인"+name.substring(10));
//		
//		
//		br.close();
//		
//		}catch(Exception e) {
//			System.out.println("파일 열기 실패 또는 파일 쓰기 실패");
//			try {
//			br.close();
//			}catch(Exception el) {
//				el.printStackTrace();
//			}
//		}
		try(BufferedReader br=
				new BufferedReader(new FileReader("c:/test/data.txt")) )
		{
			String text= br.readLine();
			System.out.println(text);
			
		}catch(Exception e) {
			System.out.println("파일 열기 실패 및 파일쓰기 실패");
		}
	}

}
