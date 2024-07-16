package j0716;

import java.util.HashMap;

public class J2 {

	public static void main(String[] args) {
		HashMap<String,ImageBoard>board=new HashMap<>();
		
		ImageBoard temp=new ImageBoard("자바설치","javava","설치.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("mysql설치방법","설치인생","mysql설치.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("천장결과","운수없는날","백만.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("최저임금...","편의점사장","mysql설치.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("mysql설치방법2","설치인생","mysql설치.jpg");
		board.put(temp.getTitle(),temp);


		

	}

}
