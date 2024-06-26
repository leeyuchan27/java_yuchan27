package java062612;

import java.util.Scanner;

public class Java0626pm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name,dept;
		int money;
		float tax=0.08f;
		
		System.out.print("이름:");
		name=scan.next();
		System.out.print("부서:");
		dept=scan.next();
		System.out.print("월 급여액:");
		money=scan.nextInt();
		
		float salary=(int)(money-(money*tax));
		 
		
		
		
		
		
	
	}

}
