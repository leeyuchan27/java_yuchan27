package java_mim;

public class Excetion {

	public static void main(String[] args) {
	
		Member member=new Member("ÀÌ¼ø½Å",1999);
		System.out.println(member.name+" "+member.birth);
		member.setAge();
		System.out.println(member.age);
	}

}

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name=name;
		this.birth=birth;
	}
	
	void setAge() {
	try {
		this.age=2024-birth;
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}
}
