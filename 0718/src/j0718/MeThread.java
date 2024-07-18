package j0718;

public class MeThread extends Thread{
	private int time;
	public MeThread(int time,String name) {
		super(name);
		this.time=time;
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("�������: "+Thread.currentThread().getName()+"Ƚ��:"+i);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
