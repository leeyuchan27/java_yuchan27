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
		
		
		System.out.print("�̸�:");
		name=scan.next();
		System.out.print("�μ�:");
		dept=scan.next();
		System.out.print("�� �޿���:");
		money=scan.nextInt();
		
	    salary=(int)(money-(money*tax));
		System.out.println("�̸�:"+name+"�μ�:"+dept+"���ɾ�:"+salary);
		
		
		scan.nextLine();
		System.out.print("�̸�:");
		name=scan.next();
		System.out.print("�μ�:");
		dept=scan.next();
		System.out.print("�� �޿���:");
		money=scan.nextInt();
		salary=(int)(money-(money*tax));
		System.out.println("�̸�:"+name+"�μ�:"+dept+"���ɾ�:"+salary);
	
		 
		
		
		
		
		
	
	}

}
