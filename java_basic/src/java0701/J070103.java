package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class J070103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String word="i like banana";
		
//		System.out.println("equals:"+(word.equals("i like banana")));
//		
//		System.out.println("contains:"+(word.contains("banana")));
//		
//		System.out.println("indexOf:"+word.indexOf("orange"));
//		
//		System.out.println(word+"합");
//		
//		System.out.println(word.indexOf('b'));
////		
////		System.out.println(word.lastIndexOf('a'));
////		
////		System.out.println(word.charAt(5));
////		
////		Scanner sc=new Scanner(System.in);
////		
////		System.out.print("알파벳 하나 입력:");
////		char alp=sc.nextLine().charAt(0);
////		System.out.println("입력한문자:"+alp);
////		
////		char ch=65;
//		System.out.println("문자열 글자수:"+word.length() );
//		
//		String 대문자= word.toUpperCase();
//		
//		System.out.println(대문자);
//		
//		String word2="  i hate java ";
//		System.out.println(word2.trim());
//		
//		//위 메서드중 가장많이 사용되는것들
//		//equals,contains
//		
//		//문자열 분할
//		System.out.println( Arrays.toString(word.split(" ") ));
//		String name="이순신@김유신@강감찬@";
//		
//		String[] names=name.split("@");
//		System.out.println(names[1]);
//		
//		System.out.println( word.substring(2));
//		System.out.println( word.substring(6));
//		System.out.println( word.substring(2,6));
//		
//		String 뽀뽀뽀="아빠가 출근할 때 뽀뽀뽀 엄마가 안아줘도 "
//				+ "뽀뽀뽀 만나면 반갑다고 뽀뽀뽀";
//		
//		String 변경=뽀뽀뽀.replace("뽀뽀뽀","뿡뿡뿡");
//		System.out.println(변경);
//		
//		변경=변경.replaceAll("뿡뿡뿡","뿌우웅");
//		System.out.println(변경);
		
		//정규표현식
		//^-문자열의시작
		//$-문자열의종료
//		String bb="203";
//		int cc=Integer.parseInt(bb);
		
		String str="내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
	    String name;
		int age=0;
		
		name=str.substring(str.indexOf("[")+1,str.indexOf("]"));
		
		age=Integer.parseInt(str.substring(str.lastIndexOf("[")+1,str.lastIndexOf("]")));
		
		
		System.out.println(name);
		System.out.println(age);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
