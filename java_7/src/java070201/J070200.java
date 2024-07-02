package java070201;

public class J070200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Car.제조사);
//		
//		Car car2=new Car("그랜져",3000,"휘발유");
//		System.out.println(car2.carName);
//		
//		Car car1 = new Car();
//	}
//
//}


//class Car{
//	static String 제조사="현대";
//	String carName;
//	int 배기량;
//	String 연료;
//	Car(){
//		연료="휘발유";
//	}
//	Car(String carName,int 배기량,String 연료){
//		this.carName=carName;
//		this.배기량=배기량;
//		this.연료=연료;
		WebNovel author1=new WebNovel("김건우",4580,4.3f);
		WebNovel author2=new WebNovel("김경제",3485,4.1f);
		WebNovel author3=new WebNovel("박재범",90930,2.7f);
		WebNovel author4=new WebNovel("서석완",19200,3.1f);
		
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
		return name+" "+point+"점 "+rating;
	}
}


	



