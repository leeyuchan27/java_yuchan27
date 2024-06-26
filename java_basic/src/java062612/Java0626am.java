package java062612;

import java.util.Scanner;

public class Java0626am {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("자바출력");
//		//System.in-입력  
		//입력받을수 있는 내장 클래스-Scanner
		Scanner scan=new Scanner(System.in);
	 
		//float타입 -nextFloat() 
		//double- nextDouble()
		//byte -nextByte() short-nextShort()
		//char없다
		//문자열입력 -nextLine(),next()
	
//		int 대게라면,삼각김밥,바나나우유;
//		System.out.print("대게라면 가격:");
//		대게라면=scan.nextInt();
//		System.out.print("삼각김밥 가격:");
//		삼각김밥=scan.nextInt();
//		System.out.print("바나나우유 가격:");
//		바나나우유=scan.nextInt();
//		
//		int 지불금액=대게라면+삼각김밥+바나나우유;
//		System.out.println("점심값:"+지불금액+"원");
		
//		
//		int floor=5;
//		float sec=3.4f;
//		int 왕복=4;
//		
//		float total_sec=(floor-1)*sec*왕복;
//		System.out.println(total_sec);
//		//데이터의 종류는 정수,실수,문자,boolean(참,거짓)
//		데이터타입
//			정수-byte,short,int,long
//			문자-char
//			실수-float,double
//			참거짓-boolean
//		
//	    변수 선언방법	-데이터 타입 변수이름
//	    int num; 정수 타입 변수 선언
//	    double dnum; 실수 타입 변수 선언
//	    char ch; 문자타입 변수선언
//	    boolean bool; 참 거짓 변수선언
//	    
//	    변수의 초기화
//	    int num=10;  변수선언과 함께 데이터를 저장
//	    
//	    출력방법
//	    System.out.println(출력내용);
//	    System.out.print(출력내용);
//	    System.out.printf(출력내용);
//	    
//	    printf 사용시 함께 사용하는 형식지정자
//	    %d,%u-정수, %f-실수 ,%c 문자, %s-문자열
	    
//	    System.out.printf("%s 마을의 나이가 %d살인 폭군지도자 %c","코딩빌",28,'박');
	    
	    
	    
	    
	   
	    int a,b,c;
	    System.out.print("c언어:");
	    a=scan.nextInt();
	    System.out.print("자바:");
	    b=scan.nextInt();
	    System.out.print("건축학개론:");
	    c=scan.nextInt();
	    
	    int 총점=a+b+c;
	    float 평균=총점/3;
	    System.out.println("총점:"+총점+"평균:"+평균);
	    
	    
	    
	    
	   
	
	    
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
