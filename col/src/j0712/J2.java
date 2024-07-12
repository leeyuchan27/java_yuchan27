package j0712;

public class J2 {
	private String bank;
	private int balance;
	private String accountNum;
	private String holder;
	
	public J2(String bank,int balance,
			String accountNum,String holder) {
		this.bank=bank;
		this.balance=balance;
		this.accountNum=accountNum;
		this.holder=holder;
	}
	@Override
	public String toString() {
		return bank+"("+accountNum+"),"+balance+","+holder;
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
}
