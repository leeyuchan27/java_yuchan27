package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class J070103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String word="i like banana";
		
//		System.out.println("equals:"+(word.equals("i like banana")));
//		
//		System.out.println("contains:"+(word.contains("banana")));
//		
//		System.out.println("indexOf:"+word.indexOf("orange"));
//		
//		System.out.println(word+"��");
//		
//		System.out.println(word.indexOf('b'));
////		
////		System.out.println(word.lastIndexOf('a'));
////		
////		System.out.println(word.charAt(5));
////		
////		Scanner sc=new Scanner(System.in);
////		
////		System.out.print("���ĺ� �ϳ� �Է�:");
////		char alp=sc.nextLine().charAt(0);
////		System.out.println("�Է��ѹ���:"+alp);
////		
////		char ch=65;
//		System.out.println("���ڿ� ���ڼ�:"+word.length() );
//		
//		String �빮��= word.toUpperCase();
//		
//		System.out.println(�빮��);
//		
//		String word2="  i hate java ";
//		System.out.println(word2.trim());
//		
//		//�� �޼����� ���帹�� ���Ǵ°͵�
//		//equals,contains
//		
//		//���ڿ� ����
//		System.out.println( Arrays.toString(word.split(" ") ));
//		String name="�̼���@������@������@";
//		
//		String[] names=name.split("@");
//		System.out.println(names[1]);
//		
//		System.out.println( word.substring(2));
//		System.out.println( word.substring(6));
//		System.out.println( word.substring(2,6));
//		
//		String �ǻǻ�="�ƺ��� ����� �� �ǻǻ� ������ �Ⱦ��൵ "
//				+ "�ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
//		
//		String ����=�ǻǻ�.replace("�ǻǻ�","�׻׻�");
//		System.out.println(����);
//		
//		����=����.replaceAll("�׻׻�","�ѿ��");
//		System.out.println(����);
		
		//����ǥ����
		//^-���ڿ��ǽ���
		//$-���ڿ�������
//		String bb="203";
//		int cc=Integer.parseInt(bb);
		
		String str="�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�";
	    String name;
		int age=0;
		
		name=str.substring(str.indexOf("[")+1,str.indexOf("]"));
		
		age=Integer.parseInt(str.substring(str.lastIndexOf("[")+1,str.lastIndexOf("]")));
		
		
		System.out.println(name);
		System.out.println(age);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
