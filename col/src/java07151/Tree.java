package java07151;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Integer>rank=new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		
		System.out.println("�����Է�:");
		sc.nextLine();
		if(int)(sc>=90) {
			System.out.println(sc+"��"+"����10%");   
		}else if(int)(sc>=70){
			System.out.println(sc+"��"+"����30%");
		}else if(int)(sc>=40){
			System.out.println(sc+"��"+"����80%");
		}
		System.out.println();
		
		
		
		
		
		TreeSet<String>score=new TreeSet<>();
		score.add("89�� �̼���"); score.add("67�� ������");
		score.add("45�� ������"); score.add("98�� �Ѽ���");
		score.add("72�� �ڹ���"); score.add("81�� ������");
		score.add("59�� �̼���"); score.add("32�� �����");
		
		

	}

}
