package java071001;

interface Runnabble{
	public void run();
}

class BankAccount{
	private int balance;
	private static String bankName="�踲Bank";
	public BankAccount(int balance) {
		this.balance=balance;
	}
	public void showBalance() {
		System.out.println("���� �ܾ�:"+balance);
	}
	
	class Transaction{
		void deposit(int amount) {
			balance=balance+amount;
			System.out.println("�Ա� �ݾ�: "+amount);
		}
		void withdraw(int amount) {
			if(balance>=amount) {
			balance=balance-amount;
			System.out.println("��� �ݾ�: "+amount);
			}else {
				System.out.println("�ܾ� ����! ��� �Ұ�");
			}
			
		}
		static class BankInfo
		{
			void showBankName()
			{
				System.out.println("���� �̸�: "+bankName);
			}
		}
		public void applyLoan(int amount) {
			class Loan{
				
			}
		}
	
}

public class InnerClass2 {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(3000000);
		account.showBalance();
		
		BankAccount.Transaction tran=account.new Transaction();
		tran.deposit(50000);
		account.showBalance();
		tran.withdraw(200000);
		account.showBalance();
		
		BankAccount.BankInfo info=new BankAccount.BankInfo();
		info.showBankName();
		

	}

}
