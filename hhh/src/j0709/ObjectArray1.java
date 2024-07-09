package j0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		
		Movie[]mv=new Movie[5];
		
		mv[0]=new Movie("범죄도시","강윤성",18);
		mv[1]=new Movie("인사이드아웃2","켈시",1);
		mv[2]=new Movie("탈주","이종필",12);
		mv[3]=new Movie("하이재킹","김성한",12);
		mv[4]=new Movie("혹성탈출","웨스",12);
		
		for(int i=0; i<mv.length; i++) {
			System.out.println(mv[i]);
		}
		for(Movie movie:mv) {
			System.out.println(movie);
		}
		

	}

}
//배열의 생성
//데이터 타입[][]