package java_0702;

public class J070201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member member1=new Member();
//		Member member2=new Member();
//		System.out.println(member1);
//		member1.name="이순신";
//		member1.age=23;
//		System.out.println(member1);
//		member2.name="김유신";
//		member2.age=34;
//		System.out.println(member2.age);
//		Book book1=new Book();
//		Book book2=new Book();
//		book1.title="java";
//		book1.page=495;
//		book2.title="메모리최적화기법";
//		book2.page=893;
//		System.out.println(book2.page);
//		
		Phone smartphone1=new Phone();
		Phone smartphone2=new Phone();
		Phone smartphone3=new Phone();
		
		smartphone1.name="아이폰";
		smartphone1.system="ios";
		smartphone1.memory=64;
		
		smartphone2.name="갤럭시";
		smartphone2.system="안드로이드";
		smartphone2.memory=128;
		
		smartphone3.name="샤오미";
		smartphone3.system="mi";
		smartphone3.memory=32;
		
		System.out.println(smartphone1.name);
		System.out.println(smartphone1.system);
		System.out.println(smartphone1.memory);
		
		System.out.println(smartphone2.name);
		System.out.println(smartphone2.system);
		System.out.println(smartphone2.memory);
		
		System.out.println(smartphone3.name);
		System.out.println(smartphone3.system);
		System.out.println(smartphone3.memory);
		
		
		
	}

}
class Phone{
	String name;
	String system;
	int memory;
}
class Book{
	String title;
	int page;
}

class Member{ //Member 라는 이름의 클래스 정의
	String name;
	int age;
}
