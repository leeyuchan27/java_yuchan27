package java0708;

import java.util.Scanner;

public class j070801 {
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Dao dao=new Dao();
		Member[] list;
		
		System.out.print("1. 입력 2. 출력: ");
		int menu=scan.nextInt();
		
		switch(menu) {
		case 1:
		System.out.print("학생 이름: ");
		String name= scan.nextLine();
		System.out.print("국어 성적: ");
		int kor= scan.nextInt();
		System.out.print("영어 성적: ");
		int eng= scan.nextInt();
		System.out.print("수학 성적: ");
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
