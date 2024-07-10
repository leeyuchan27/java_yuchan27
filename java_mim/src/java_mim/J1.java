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
			System.out.println("문자열 입력해라!");
			
		}catch(Exception e) {
			System.out.println("0 으로 나누기 하면 안되");
		}
		
		System.out.println("여기가 프로그램 끝");
		
		
	}

}
