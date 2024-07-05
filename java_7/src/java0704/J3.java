package java0704;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Game game=new Game();
		game.play();
	}

}
class Game{
	String user;
	String com;
	
	void play() {
		comInput();
		userInput();
		result();
	}
	
	void result() {
		if(user.equals(com)) {
			System.out.println("비김");
		}else if((user.equals("가위")&& com.equals("보"))||
				 (user.equals("바위")&& com.equals("가위"))||
				 (user.equals("보")&& com.equals("바위")) ) {
			System.out.println("유저승, 컴퓨터 패");
		}else {
			System.out.println("유저 패, 컴퓨터 승");
		}
				
	}
	
	void userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("가위바위보:");
		this.user=scan.nextLine();
	}
	
	void comInput() {
		int temp=(int)(Math.random()*3);
		switch(temp) {
		case 0:this.com="가위";break;
		case 1:this.com="바위";break;
		case 2:this.com="보";break;
		}
	}
}
