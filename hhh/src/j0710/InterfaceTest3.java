package j0710;

abstract class Unit{
	int hp;
}
interface Repairable{	
	public void repair();
}	
}
class Marine extends Unit{
	Marine(){ super.hp=50;}
	
}

class Dropship extends Unit implements Repairable{
	Dropship(){super.hp=100;}
	@Override
	public void repair() {System.out.println("scv가 수리");}
}

class Tank extends Unit implements Repairable {
	Tank(){super.hp=150;}
	@Override
	public void repair() {System.out.println("수리");}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		Marine m=new Marine();
		Dropship d=new Dropship();
		Tank t=new Tank();
		
		m.hp-=10;
		d.hp-=20;
		t.hp-=50;
		

	}

}
