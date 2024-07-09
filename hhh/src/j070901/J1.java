package j070901;

public class J1 {

	public static void main(String[] args) {
		BoardDao dao=new BoardDao();
		Board[]list=dao.findByAll();
	
		for(Board board:list) {
			if(board.getTitle().length()>=10) {
				System.out.println(board);
			}
		
		}
		for(Board board:list) {
			if(board.getContent().length()<=10) {
				System.out.println(board.getTitle()+" "+board.getWriter());
			}
		}
		System.out.println("\n hit수가 100이상인 객체들을 추출하여 hot 배열에저장");
		Board[]hot=new Board[list.length];
		
		int i=0;
		for(Board board:list) {
			if(board.getHit()>=100) {
				hot[i++]=board;
			}
		}
		for(Board data:hot) {
			if(data==null)break;
			System.out.println(data);
		}
		Board[] sin=new Board[list.length];
		i=0;
		for(Board obj:list) {
			if(obj==null)break;
			System.out.println(obj);
		}
	}

}
