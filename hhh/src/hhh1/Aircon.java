package hhh1;

public class Aircon extends House {
	static final String[] windText= {"미","약","강"};
	
	private int wind=0;
	private int temperature;
	
	Aircon(){}
	Aircon(String brand,int price){
	
	}
	
	void windControl() {
		wind++;
		if(wind==windText.length)wind=0;
		System.out.println("현재바람세기:"+windText[wind]);
	}
}
/*접근제어자
*	public-어디서나 누구든지 사용 가능한 제어자
*
*	default-같은패키지에서만 접근가능
*
*  protected -같은패키지에서만 접근가능,
*  			 상속관계일경우 패키지가 달라다고 접근가능
*  
*  private-어디서나 누구든지 사용못한다.
*  		  -클래스내부 에서 만 사용가능.
*  
*	
*
*
*
*
*
*
*
*/
