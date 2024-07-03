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
		 String animal="골드리트리버";
		 String 공고일="2024-07-01";
		TestMethod ani=new TestMethod();
		ani.animals(animal,공고일);
		String examDate="2024-08-13";
		ani.month(examDate);
		int 흥민=31,강인=23,희찬=28,재범=37;
		ani.age(흥민,강인,희찬,재범);
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
		System.out.println("평균나이:"+last);
		
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
		String name="이유찬";
		int age=27;
		System.out.println(name+""+age);
	}
	void view() {
		int a=10,b=20;
		System.out.println("a="+a+""+",b="+b);
	}
	void dog() {
		System.out.println("메서드 dog쉽네~");
	}
	void total(int kor,int eng,int mat) {
		int result=kor+eng+mat;
		System.out.println("합:"+result);
	}
	
	void sum(int num1,int num2) {
		int result=num1+num2;
		System.out.println("합:"+result);
	}
	
	void sum() {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수:");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("합:"+result);
	}
}
