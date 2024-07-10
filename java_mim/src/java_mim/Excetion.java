package java_mim;

public class Excetion {

	public static void main(String[] args) {
	
		try {
			if()
			throw new NullPointerException("aa");
			
		}catch(Exception e) {
			System.out.println("강제 오류 발생");
		}

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
		this.age=2024-birth;
	}
}
