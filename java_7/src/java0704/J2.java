package java0704;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
//		MethodUtil util=new MethodUtil();
//		int[]num=util.twoNum();
//		int width=20;
//		int height=30;
//		Total main=new Total();
//		main.result(width,height);
//�α��� ������ ���̵�� skyblue,��й�ȣ��1234sea
		//login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
		//���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		//�ϳ��� ����ġ�ϸ� �α��� ���� ���
		//�α��� ���� ����� main����
//		Total util=new Total();
//		boolean isFail=util.login();
//		if(isFail) {
//			System.out.println("�α��μ���");
//		}else {
//			System.out.println("�α��ν���");
//		}
		//���� ������ Ű���带 ���� �Է� ��������.
		//�Է��� �������� ����100�� ������
		//100-���� ����� ����ϰ�
		//100�� ���������� �������� ���� ����ϼ���.
		//main�޼��忡�� ���
		Total uuu=new Total();
		int total=uuu.hap();
		if(total>100) {
			System.out.println(100-total);
		}else
			System.out.println(total);
	}

}
class Total{
	int hap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��°����:");
		int one=sc.nextInt();
		System.out.print("�ι�°����:");
		int two=sc.nextInt();
		System.out.print("����°����:");
		int the=sc.nextInt();
		int total=one+two+the;
		
		return total;
		
		
	}
	
//	boolean login(){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("���̵�:");
//		String id=sc.nextLine();
//		System.out.println("��й�ȣ:");
//		String password=sc.nextLine();
//		boolean isSuccess=true;
//		if(id.equals("skyblue")) {
//			if(password.equals("1234sea"))
//				return isSuccess;
//		}
//		return isSuccess=false;
//							
//	}
//	int result(int a,int b) {
//		int num=a*b;
//		System.out.println(num);
//		return num;
//	}
}

//class MethodUtil{
//	int[] twoNum() {
//		int num1=20,num2=50;
//		int[]temp=new int[] {num1,num2};
//		return temp;
//		
//	}
//}
