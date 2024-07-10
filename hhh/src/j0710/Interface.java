package j0710;

abstract class Animal1{
	static int a=10;
	final int b=10;
	static void mee() {
		
	}
	
	public abstract void sound();
}
class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("港港");
	}
}
class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("衬克");
	}
}
class Pigeon implements Animal1{
	@Override
	public void sound() {
		System.out.println("备备");
	}
}

public class Interface {

	public static void main(String[] args) {
		Dog1 d=new Dog1();
		Cat1 c=new Cat1();
		Pigeon p=new Pigeon();
		
		d.sound();
		c.sound();
		p.sound();
		
		
	}

}
