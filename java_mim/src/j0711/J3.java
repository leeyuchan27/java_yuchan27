package j0711;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name=null;
		int age=0;
		String userInfo=null;
		
		System.out.print("�̸�: ");
		name=scan.nextLine();
		System.out.print("����: ");
		age=scan.nextInt();
		if(age>=20) {
			System.out.print("�ڱ�Ұ� : ");
			userInfo=scan.nextLine();
		}
		System.out.println(age+"��"+name+"���� ");
		System.out.println(userInfo.substring(0,10));

	}

}
