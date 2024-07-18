package g0718;

public class Money {
	private int myMoney=10000;
	public int getMyMoney() {
		return myMoney;
	}
	public boolean widhdraw(int money) {
		if(myMoney>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
