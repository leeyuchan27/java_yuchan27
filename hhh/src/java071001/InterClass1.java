package java071001;

public class InterClass1 {

	public static void main(String[] args) {
		Out out=new Out();
		out.num=100;
		out.obj.age=34;
		out.obj.setName("�̼���");
		
		Out.�ν��Ͻ�����Ŭ���� in=out.new �ν��Ͻ�����Ŭ����();
		in.age=20;
		in.setName("������");
		
		

	}

}
class Out{
	static int count;
	int num;
	private String job;
	�ν��Ͻ�����Ŭ���� obj=new �ν��Ͻ�����Ŭ����();
	
	interface Car{
		void make();
	}
	void makeCar() {
		
		Car c=new Car() {
			@Override
			public void make() {
				System.out.println(" �͸� Ŭ������ ���� �����");
			}
		};
		c.make();
	}
	void buyComputer() {
		
		class ����Ŭ����{
			int weight;
			void del() {
				
			}
			
		}
		����Ŭ���� ob=new ����Ŭ����();
	}
	
	static void save() {
		
	}
	static class ����Ŭ����{
		int tall;
		static int birth;
		static void update() {
			
		}
	}
	private class �ν��Ͻ�����Ŭ����{
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