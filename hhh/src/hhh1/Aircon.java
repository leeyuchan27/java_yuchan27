package hhh1;

public class Aircon extends House {
	static final String[] windText= {"��","��","��"};
	
	private int wind=0;
	private int temperature;
	
	Aircon(){}
	Aircon(String brand,int price){
	
	}
	
	void windControl() {
		wind++;
		if(wind==windText.length)wind=0;
		System.out.println("����ٶ�����:"+windText[wind]);
	}
}
/*����������
*	public-��𼭳� �������� ��� ������ ������
*
*	default-������Ű�������� ���ٰ���
*
*  protected -������Ű�������� ���ٰ���,
*  			 ��Ӱ����ϰ�� ��Ű���� �޶�ٰ� ���ٰ���
*  
*  private-��𼭳� �������� �����Ѵ�.
*  		  -Ŭ�������� ���� �� ��밡��.
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
