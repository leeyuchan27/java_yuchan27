package java0703;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc=new Calc();
		
		calc.sum(40,10);
		
		int kor=89,eng=74,mat=43;
		
		Calc toTal=new Calc();
		toTal.total(kor,eng,mat);
		
		calc.dog();
		toTal.dog();
		
		Calc lala=new Calc();
		lala.dog();
		
		calc.view();
		calc.na();
		 String animal="��帮Ʈ����";
		 String ������="2024-07-01";
		TestMethod ani=new TestMethod();
		ani.animals(animal,������);
		String examDate="2024-08-13";
		ani.month(examDate);
		int ���=31,����=23,����=28,���=37;
		ani.age(���,����,����,���);
	}

}
class TestMethod{
	void age(int a,int b,int c,int d) {
		a=a;
		b=b;
		c=c;
		d=d;
		int total=a+b+c+d;
		int last=total/4;
		System.out.println("��ճ���:"+last);
		
	}
	
	void month(String ex) {
		String[]current=ex.split("-");
		System.out.println(current[1]+""+current[2]);
	}
	

	void animals(String num1,String num2){
		
	System.out.println(num1+""+num2);
		 
 }
}

class Calc{
	
	void na() {
		String name="������";
		int age=27;
		System.out.println(name+""+age);
	}
	void view() {
		int a=10,b=20;
		System.out.println("a="+a+""+",b="+b);
	}
	void dog() {
		System.out.println("�޼��� dog����~");
	}
	void total(int kor,int eng,int mat) {
		int result=kor+eng+mat;
		System.out.println("��:"+result);
	}
	
	void sum(int num1,int num2) {
		int result=num1+num2;
		System.out.println("��:"+result);
	}
	
	void sum() {
		Scanner scan=new Scanner(System.in);
		System.out.println("ù��° ����:");
		int num1=scan.nextInt();
		System.out.println("�ι�° ����:");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("��:"+result);
	}
}
