package j0709;

public class Array2 {

	public static void main(String[] args) {
		Game[]game=new Game[7];
		
		game[0]=new Game("서든어택","fps","pc");
		game[1]=new Game("메이플스토리","rpg","pc");
		game[2]=new Game("동물의숲","롤플레잉","switch");
		game[3]=new Game("바람의나라","rpg","pc");
		game[4]=new Game("제노니아","mmorpg","mobile");
		game[5]=new Game("롤","롤플레잉","pc");
		game[6]=new Game("오버워치","fps","pc");
		
		for(int i=0; i<game.length; i++) {
			System.out.println(game[i]);
		}
		
		

	}

}
