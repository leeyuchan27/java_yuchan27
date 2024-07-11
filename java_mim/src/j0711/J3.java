package j0711;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=null;
		int age=0;
		String userInfo=null;
		
		System.out.print("이름: ");
		name=scan.nextLine();
		System.out.print("나이: ");
		age=scan.nextInt();
		if(age>=20) {
			System.out.print("자기소개 : ");
			userInfo=scan.nextLine();
		}
		System.out.println(age+"살"+name+"님은 ");
		System.out.println(userInfo.substring(0,10));

	}

}
