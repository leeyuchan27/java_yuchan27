package java0708;

import java.util.Scanner;

public class j070801 {
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Dao dao=new Dao();
		Member[] list;
		
		System.out.print("1. �Է� 2. ���: ");
		int menu=scan.nextInt();
		
		switch(menu) {
		case 1:
		System.out.print("�л� �̸�: ");
		String name= scan.nextLine();
		System.out.print("���� ����: ");
		int kor= scan.nextInt();
		System.out.print("���� ����: ");
		int eng= scan.nextInt();
		System.out.print("���� ����: ");
		int mat= scan.nextInt();
		
		Member member=new Member(name,kor,eng,mat);
		total_avg(member );
		System.out.println(member);
	
		dao.insert(member);
		break;
	 case 2: 
		 list=dao.select();
		 for(Member data : list) {
			 System.out.println(data);
		 }
		break;
		
	 }
 }		
	static void total_avg(Member m) {
		int total=m.getKor() +m.getEng()+m.getMat();
		m.setTotal(total);
		m.setStd_avg(total/3);
	}

}
