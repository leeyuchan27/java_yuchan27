package java0701;

import java.util.Arrays;

public class J070102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//많은양의 데이터를 다룰때는 배열을 사용한다.
		//상황에 따라서는 배열을 쓰면 안되는 경우도 있지만
		//보통의 배열의 구조에 데이터를 저장 한다.
//		String[] addr=new String[] {
//				"대전 중구 선화동 25","대전 중구 선화동 92",
//				"대전 서구 둔산동 111","대전 서구 둔산동 1023",
//				"대전 유성구 노은동 93","대전 중구 대흥동 932",
//				"대전 동구 가양동 945","대전 중구 선화동 1234",
//				"대전 중구 대흥동 23","대전 중구 선화동 984"
//		}
//		String[] 선화동=new String[addr.length];
//		int end=0,index=0;
//		
//		for(int i=0;i<addr.length;i++) {
//			if(addr[i].contains("선화동")){
//				선화동[index++]=addr[i];
//				
//			}
//		}
		int[]a=new int[] {10,20,0,40,50};
		for(int data:a) {
			System.out.println(data);
		}
		
				
				
	}

}
