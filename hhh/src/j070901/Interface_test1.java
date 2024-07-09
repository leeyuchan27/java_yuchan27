package j070901;

interface RestCustomer{
	
	public void setCustomer(String customer);
	public String food();
}
class ReservCustomerA implements RestCustomer{
	String customer;
	

	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
		
	}

	@Override
	public String food() {
		return customer+" û���� �ش�";
		
	}
	
}

class Owner{
	void food(ReservCustomerA cus) {
		System.out.println(cus.food());
	}
	

public class Interface_test1 {

	public static void main(String[] args) {
		Owner ow=new Owner();
		ReservCustomerA a=new ReservCustomerA();
		ReservCustomerB b=new ReservCustomerB();
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		
		ow.food(a);
		ow.food(b);

	}

}
