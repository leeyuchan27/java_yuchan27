package j0716;

import java.util.HashMap;

public class J2 {

	public static void main(String[] args) {
		HashMap<String,ImageBoard>board=new HashMap<>();
		
		ImageBoard temp=new ImageBoard("�ڹټ�ġ","javava","��ġ.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("mysql��ġ���","��ġ�λ�","mysql��ġ.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("õ����","������³�","�鸸.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("�����ӱ�...","����������","mysql��ġ.jpg");
		board.put(temp.getTitle(),temp);
		temp=new ImageBoard("mysql��ġ���2","��ġ�λ�","mysql��ġ.jpg");
		board.put(temp.getTitle(),temp);


		

	}

}
