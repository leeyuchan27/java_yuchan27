package java0703;

public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnMth rm=new ReturnMth();
		
//		int num=rm.get();
//		int ���=rm.sum();
//		
//		System.out.println(���);
//		
//		String userName=rm.getName();
//		int age=34;
//		System.out.println(userName+" "+age);
		
		//����89,����78,����50 �������� ������ ���ϴ� �޼���
		//�������� ����� ���ϴ� �޼���
		//������ ����� ����ϼ��� �޼���2��
		int totalscore=rm.totalScore();
		int pgPg=rm.pg();
		System.out.println("����:"+totalscore+",���:"+pgPg);
		
		
		
	}

}
class ReturnMth{
	int totalScore() {
		int ����=89,����=78,����=50;
		int ����=����+����+����;
		return ����;
		
	}
	int pg() {
		int ����=89,����=78,����=50;
		int ����=����+����+����;
		int ���=����/3;
		return ���;
		
	}
	
	
	
	
	String getName(){
		String name="�̼���";
		return name;
	}
	int sum() {
		int num1=30,num2=45;
		int result=num1+num2;
		return result;
		
	}
	
	int get() {
		return 10;
	}
}