package java0704;

import java.util.Scanner;

public class j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dice game=new Dice();
//		int 석완=game.getDice("석완");
//		int 형준=game.getDice("형준");
//		game.result(석완,형준);
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
		System.out.println("주사위 게임 참가인원:");
		int cnt=sc.nextInt();
		this.names=new String[cnt];
		this.diceNum=new int[cnt];
		sc.nextLine();
		for(int i=0;i<names.length;i++) {
			System.out.println("참가자 이름:");
			names[i]=sc.nextLine();
		}
			
	}
	void diceThrow() {
		for(int i=0;i<names.length;i++) {
			this.diceNum[i]=(int)(Math.random()*6)+1;
			System.out.println(this.names[i]+"주사위:"+this.diceNum[i]);
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
			System.out.println("모든 참가자 주사위 값이 같다-비김");
			return;
		}
		
		for(int i=0; i<diceNum.length;i++) {
			if(diceNum[i]==max) {
				System.out.println(names[i]+"승");
			}
		}
	}
	
}
//class Dice{
//	
//	void result(int 서, int 전) {
//		if(서>전) {
//			System.out.println("석완 승, 형준패 ");
//		}else if(서<전) {
//			System.out.println("석완 패, 형준 승");
//		}else
//			System.out.println("비김");
//	}
//	int getDice(String name) {
//		int num=(int)(Math.random()*6)+1;
//		System.out.println(name+"주사위:"+num);
//		return num;
//	}
//}