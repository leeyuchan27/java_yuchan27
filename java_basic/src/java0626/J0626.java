package java0626;

public class J0626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자바테스트");
		//코드실행 컨트롤+f11
		//단축키syso 컨트롤+스페이스
		//자바변수
		//데이터타입 변수이름=데이터;
		//데이터종류 정수,실수,문자
		//정수-byte,short,int,long,char
		//문자-char
		//실수-float,double,longdobule
		byte num=10;//1바이트
		short num1=200;//2바이트
		int num2=2323;//4바이트 byte  32bit
		long num3=234L;//8바이트
		
		char ch='a'; //''작은따옴표 문자,""큰따옴표가 문자열
		
		float fnum=3.14f;
		double dnum=12.3343;
		fnum=35;
		
		boolean isTrue=false;
		
		String word="이순신";//String은 클래스이다.
		//클래스-사용자 정의 타입
		
		//사각형의 의 넓이를 구하시오.(밑변과 높이는 정수이다.)
		
		int width=15;
		int height=20;
		int area=width*height;
		System.out.println("넓이:"+area);
		
		//키보드를 30개 구매해야한다.
		//hp게이밍키보드의 가격이8000원이라면 총 구매금액은 얼마인가?
		
		int keyboard=30;
		int keyboardprice=8000;
		int total=keyboard*keyboardprice;
		
		//\n =엔터키 <br>같은
		
		System.out.println("총 구매금액:"+total);
		System.out.print("java 출력방법 print");
		System.out.print("줄바꿈 안된다");
		System.out.printf("printf\n출력");
		//서식문자=형식지정문자
		System.out.printf("총 구매금액:%d",total);
		//%d-10진수 정수
		//%u-10진수 정수
		//%f-10진수 실수
		//%c-문자
		//%s-문자열
		//%b-boolean(false,true)
		//%o-8진수 정수 %x-16진수 정수
		System.out.printf("%.2f",172.561);
		
		
		
	
		
		
		
		
		
	}

}
