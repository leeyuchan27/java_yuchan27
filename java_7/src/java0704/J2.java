package java0704;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
//		MethodUtil util=new MethodUtil();
//		int[]num=util.twoNum();
//		int width=20;
//		int height=30;
//		Total main=new Total();
//		main.result(width,height);
//로그인 가능한 아이디는 skyblue,비밀번호는1234sea
		//login 메서드를 실행하여 로그인 여부를 출력하세요.
		//아이디 비밀번호가 일치하면 로그인 성공 출력
		//하나라도 불일치하면 로그인 실패 출력
		//로그인 여부 출력은 main에서
//		Total util=new Total();
//		boolean isFail=util.login();
//		if(isFail) {
//			System.out.println("로그인성공");
//		}else {
//			System.out.println("로그인실패");
//		}
		//정수 세개를 키보드를 통해 입력 받으세요.
		//입력한 세정수의 합이100을 넘으면
		//100-합의 결과를 출력하고
		//100을 넘지않으면 세정수의 합을 출력하세요.
		//main메서드에서 출력
		Total uuu=new Total();
		int total=uuu.hap();
		if(total>100) {
			System.out.println(100-total);
		}else
			System.out.println(total);
	}

}
class Total{
	int hap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째정수:");
		int one=sc.nextInt();
		System.out.print("두번째정수:");
		int two=sc.nextInt();
		System.out.print("세번째정수:");
		int the=sc.nextInt();
		int total=one+two+the;
		
		return total;
		
		
	}
	
//	boolean login(){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("아이디:");
//		String id=sc.nextLine();
//		System.out.println("비밀번호:");
//		String password=sc.nextLine();
//		boolean isSuccess=true;
//		if(id.equals("skyblue")) {
//			if(password.equals("1234sea"))
//				return isSuccess;
//		}
//		return isSuccess=false;
//							
//	}
//	int result(int a,int b) {
//		int num=a*b;
//		System.out.println(num);
//		return num;
//	}
}

//class MethodUtil{
//	int[] twoNum() {
//		int num1=20,num2=50;
//		int[]temp=new int[] {num1,num2};
//		return temp;
//		
//	}
//}
