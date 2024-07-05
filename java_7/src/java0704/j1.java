package java0704;

import java.util.Scanner;

public class j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dice game=new Dice();
//		int ����=game.getDice("����");
//		int ����=game.getDice("����");
//		game.result(����,����);
		DiceGame game=new DiceGame();
		game.init();
		game.diceThrow();
		game.result();
		
	}

}
class DiceGame{
	String[] names;
	int[] diceNum;
	
	void init() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�ֻ��� ���� �����ο�:");
		int cnt=sc.nextInt();
		this.names=new String[cnt];
		this.diceNum=new int[cnt];
		sc.nextLine();
		for(int i=0;i<names.length;i++) {
			System.out.println("������ �̸�:");
			names[i]=sc.nextLine();
		}
			
	}
	void diceThrow() {
		for(int i=0;i<names.length;i++) {
			this.diceNum[i]=(int)(Math.random()*6)+1;
			System.out.println(this.names[i]+"�ֻ���:"+this.diceNum[i]);
		}
	}
	void result() {
		int max=0;
		for(int num:diceNum) {
			if(max<num)max=num;
		}
		
		boolean isSame=true;
		for(int num:diceNum) {
			if(num!=max)isSame=false;
		}
		if(isSame) {
			System.out.println("��� ������ �ֻ��� ���� ����-���");
			return;
		}
		
		for(int i=0; i<diceNum.length;i++) {
			if(diceNum[i]==max) {
				System.out.println(names[i]+"��");
			}
		}
	}
	
}
//class Dice{
//	
//	void result(int ��, int ��) {
//		if(��>��) {
//			System.out.println("���� ��, ������ ");
//		}else if(��<��) {
//			System.out.println("���� ��, ���� ��");
//		}else
//			System.out.println("���");
//	}
//	int getDice(String name) {
//		int num=(int)(Math.random()*6)+1;
//		System.out.println(name+"�ֻ���:"+num);
//		return num;
//	}
//}