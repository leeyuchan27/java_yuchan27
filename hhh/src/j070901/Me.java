package j070901;

public class Me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move d=new dog();
		move c=new cat();
		c.moving();
		d.moving();
	}

}
class dog implements move{
	@Override
	public void moving() {
		System.out.println("��ŭ��ŭ �̵��Ѵ�.");
	}
}
class cat implements move{
	@Override
	public void moving() {
		System.out.println("��� ��� �̵��Ѵ�.");
 }
}
interface move{
	static int a=10;
	public void moving();
}