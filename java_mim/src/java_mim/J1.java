package java_mim;

public class J1 {

	public static void main(String[] args) {
		
		try {
			String name="aaa";
			name.length();
			a.length();
			b.length();
			c.length();
			System.out.println(10/0);
		
		}catch(NullPointerException n) {
			n.printStackTrace();
			System.out.println(n.getMessage());
			System.out.println(n.getClass());
			System.out.println("���ڿ� �Է��ض�!");
			
		}catch(Exception e) {
			System.out.println("0 ���� ������ �ϸ� �ȵ�");
		}
		
		System.out.println("���Ⱑ ���α׷� ��");
		
		
	}

}
