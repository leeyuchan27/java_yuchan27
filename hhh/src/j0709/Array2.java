package j0709;

public class Array2 {

	public static void main(String[] args) {
		Game[]game=new Game[7];
		
		game[0]=new Game("�������","fps","pc");
		game[1]=new Game("�����ý��丮","rpg","pc");
		game[2]=new Game("�����ǽ�","���÷���","switch");
		game[3]=new Game("�ٶ��ǳ���","rpg","pc");
		game[4]=new Game("����Ͼ�","mmorpg","mobile");
		game[5]=new Game("��","���÷���","pc");
		game[6]=new Game("������ġ","fps","pc");
		
		for(int i=0; i<game.length; i++) {
			System.out.println(game[i]);
		}
		
		

	}

}
