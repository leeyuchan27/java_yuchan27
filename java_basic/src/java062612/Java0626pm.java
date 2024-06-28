package java062612;

import java.util.Scanner;

public class Java0626pm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String name,dept;
		
		int money;
		float tax=0.08f;
		float salary=0;
		
		
		System.out.print("이름:");
		name=scan.next();
		System.out.print("부서:");
		dept=scan.next();
		System.out.print("월 급여액:");
		money=scan.nextInt();
		
	    salary=(int)(money-(money*tax));
		System.out.println("이름:"+name+"부서:"+dept+"수령액:"+salary);
		
		
		scan.nextLine();
		System.out.print("이름:");
		name=scan.next();
		System.out.print("부서:");
		dept=scan.next();
		System.out.print("월 급여액:");
		money=scan.nextInt();
		salary=(int)(money-(money*tax));
		System.out.println("이름:"+name+"부서:"+dept+"수령액:"+salary);
	
		 
		
		
		
		
		
	
	}

}
