package java0701;

import java.util.Scanner;

public class J070101 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] number=new int[20];
//		for(int i=0;i<number.length;i++) {
//			number[i]=(int)(Math.random()*30)+1;
//		}
//		int count=0;
//		for(int i=0; i<number.length; i++) {
//			if(number[i]%5==0)
//				count++;
//		}
//		System.out.println("5�� ��� �?"+count);
//		
		int[] bingo=new int[25];
		
		for(int i=0;i<bingo.length;i++) {
			bingo[i]=(int)(Math.random()*50)+1;
			for(int k=0;k<i;k++) {
				if(bingo[k]==bingo[i]) {
					i--;break;
				}
			}
		}
		while(true) {
			for(int i=0; i<bingo.length;i++) {
				if(i%5==0)
					System.out.println();
				if(bingo[i]==0)
					System.out.printf(" %2c ",'��');
				else
				 System.out.printf(" %2d ",bingo[i]);
			}
			System.out.print("������� �Է�:");
			int num=scan.nextInt();
			
			for(int i=0;i<bingo.length; i++) {
				if(num==bingo[i]) {
					bingo[i]=0; break;
				}
			}
			int ����=0,����=0,�밢��1=0,�밢��2=0,end=0;
		
			for(int i=0;i<5;i++) {
				for(int k=0;k<5;k++) {
					 if(bingo[i*5+k]==0)����++;
					 if(bingo[k*5+i]==0)����++;
				}
				if(bingo[i*6]==0)�밢��1++;
				if(bingo[i*4+4]==0)�밢��2++;
				
				if(�밢��1==5)end++;
				if(�밢��2==5)end++;
				if(����==5)end++;
				if(����==5)end++;
				
				����=0;
				����=0;
			}
			if(end==5) {
				System.out.println("5�ٺ��� �ϼ�!!");
				break;
			}
		}
		
		
		
	}

}
