package java071001;

public class InterClass1 {

	public static void main(String[] args) {
		Out out=new Out();
		out.num=100;
		out.obj.age=34;
		out.obj.setName("이순신");
		
		Out.인스턴스내부클래스 in=out.new 인스턴스내부클래스();
		in.age=20;
		in.setName("김유신");
		
		

	}

}
class Out{
	static int count;
	int num;
	private String job;
	인스턴스내부클래스 obj=new 인스턴스내부클래스();
	
	interface Car{
		void make();
	}
	void makeCar() {
		
		Car c=new Car() {
			@Override
			public void make() {
				System.out.println(" 익명 클래스를 통해 만들기");
			}
		};
		c.make();
	}
	void buyComputer() {
		
		class 지역클래스{
			int weight;
			void del() {
				
			}
			
		}
		지역클래스 ob=new 지역클래스();
	}
	
	static void save() {
		
	}
	static class 정적클래스{
		int tall;
		static int birth;
		static void update() {
			
		}
	}
	private class 인스턴스내부클래스{
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
		void create() {
			count=10;
		}
	}
	
}