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
		System.out.println("성큼성큼 이동한다.");
	}
}
class cat implements move{
	@Override
	public void moving() {
		System.out.println("사뿐 사뿐 이동한다.");
 }
}
interface move{
	static int a=10;
	public void moving();
}