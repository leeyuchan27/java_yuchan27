package j0718;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		th.start();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자입력:");
		int num=sc.nextInt();
		System.out.println(num);
		
		
	
		
		
	}
	
}
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
		 System.out.println("쓰레드"+i);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

