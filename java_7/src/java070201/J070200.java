package java070201;

public class J070200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Car.������);
//		
//		Car car2=new Car("�׷���",3000,"�ֹ���");
//		System.out.println(car2.carName);
//		
//		Car car1 = new Car();
//	}
//
//}


//class Car{
//	static String ������="����";
//	String carName;
//	int ��ⷮ;
//	String ����;
//	Car(){
//		����="�ֹ���";
//	}
//	Car(String carName,int ��ⷮ,String ����){
//		this.carName=carName;
//		this.��ⷮ=��ⷮ;
//		this.����=����;
		WebNovel author1=new WebNovel("��ǿ�",4580,4.3f);
		WebNovel author2=new WebNovel("�����",3485,4.1f);
		WebNovel author3=new WebNovel("�����",90930,2.7f);
		WebNovel author4=new WebNovel("������",19200,3.1f);
		
		System.out.println(author4);
		
		
	}
}
class WebNovel{
	String name;
	int point;
	float rating;
	WebNovel(){
		
	}
	WebNovel(String name){
		this.name=name;
	}
	
	
	WebNovel(String name,int point,float rating){
		this.name=name;
		this.point=point;
		this.rating=rating;
	}
	public String toString() {
		return name+" "+point+"�� "+rating;
	}
}


	



