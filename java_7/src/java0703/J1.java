package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member1=new Member("이순신",31,"군인");
		Member member2=new Member("문익점",29,"섬유공장사장");
		Member member3=new Member("장영실",45,"기계공학자");
		member1.birth();
		member2.birth();
		member3.birth();
		
		DataIdenti dataIdenti=new DataIdenti();
		
		dataIdenti.ageGroup(member1.name,member1.age);
		dataIdenti.ageGroup(member2.name,member2.age);
		dataIdenti.ageGroup(member3.name,member3.age);
		
	
		
//	
//		
//		Calendar cal=Calendar.getInstance();
//		int year=cal.get(Calendar.YEAR);
//		int 월=cal.get(Calendar.MONTH)+1;
//		int 일=cal.get(Calendar.DAY_OF_MONTH);
//		int 요일=cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(요일);
//		
//		Date today=new Date();
//		System.out.println(today.);
//		
		
		
	}
}
class DataIdenti{
	void ageGroup(String name,int age) {
		
		String group=null;
		group=(age/10)+"0대";
		System.out.println(name+":"+group);
	}
	void nationalJob(String name, String job) {
		String ncs=null;
		switch(job) {
		  case"군인": ncs="05.국방";
			  break;
		  case"섬유공장사장": ncs="18.섬유의복";
			  break;
		  case"기계공학자": ncs="15.기계";
			  break;
		}
		System.out.println(name+":"+ncs);
		
	}
}

class Member{
	String name;
	int age;
	String job;
	Member(){}
	Member(String name,int age,String job){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	void birth() {
		LocalDate today=LocalDate.now();
		int nowYear=today.getYear();
		
		int birthYear1=nowYear-this.age;
		System.out.printf("%s 태어난 년도: %d년\n",this.name,birthYear1);
	}
}










