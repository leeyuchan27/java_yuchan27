package j0705;

public class J0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setTitle("JAVA 속성");
		book.setAuthor("유재학");
		book.setPage(786);
		System.out.println(book.getPage());
		
		Book book2=new Book("JAVA,웹,성공적","이병헌",564);
		System.out.println(book2);
	}

}
//변수,메서드
//인스턴스,클래스
//생성자메서드
//인스턴스변수,클래스 변수초기화
//오버로딩
//오버라이딩
//상속
//제어자
//다형성
//추상화
//인터페이스
//내부클래스(익명클래스,정적클래스)
//열거형
//
//컬렉션-자료구조와 알고리즘
//	- collection,List,Map Set
//	-ArrayList,Vector,LinkedList,
//	-Queue,stack,HashSet,TreeSet
//	-HashMap,treeMap 등등

//제네릭
//애너테이션
//스트림
//쓰레드