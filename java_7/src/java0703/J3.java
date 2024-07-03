package java0703;

public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnMth rm=new ReturnMth();
		
//		int num=rm.get();
//		int 결과=rm.sum();
//		
//		System.out.println(결과);
//		
//		String userName=rm.getName();
//		int age=34;
//		System.out.println(userName+" "+age);
		
		//국어89,영어78,수학50 세과목의 총점을 구하는 메서드
		//세과목의 평균을 구하는 메서드
		//총점과 평균을 출력하세요 메서드2개
		int totalscore=rm.totalScore();
		int pgPg=rm.pg();
		System.out.println("총점:"+totalscore+",평균:"+pgPg);
		
		
		
	}

}
class ReturnMth{
	int totalScore() {
		int 국어=89,영어=78,수학=50;
		int 총점=국어+영어+수학;
		return 총점;
		
	}
	int pg() {
		int 국어=89,영어=78,수학=50;
		int 총점=국어+영어+수학;
		int 평균=총점/3;
		return 평균;
		
	}
	
	
	
	
	String getName(){
		String name="이순신";
		return name;
	}
	int sum() {
		int num1=30,num2=45;
		int result=num1+num2;
		return result;
		
	}
	
	int get() {
		return 10;
	}
}