package java0703;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member1=new Member("�̼���",31,"����");
		Member member2=new Member("������",29,"�����������");
		Member member3=new Member("�念��",45,"��������");
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
//		int ��=cal.get(Calendar.MONTH)+1;
//		int ��=cal.get(Calendar.DAY_OF_MONTH);
//		int ����=cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(����);
//		
//		Date today=new Date();
//		System.out.println(today.);
//		
		
		
	}
}
class DataIdenti{
	void ageGroup(String name,int age) {
		
		String group=null;
		group=(age/10)+"0��";
		System.out.println(name+":"+group);
	}
	void nationalJob(String name, String job) {
		String ncs=null;
		switch(job) {
		  case"����": ncs="05.����";
			  break;
		  case"�����������": ncs="18.�����Ǻ�";
			  break;
		  case"��������": ncs="15.���";
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
		System.out.printf("%s �¾ �⵵: %d��\n",this.name,birthYear1);
	}
}










