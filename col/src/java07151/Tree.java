package java07151;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Integer>rank=new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		
		System.out.println("점수입력:");
		sc.nextLine();
		if(int)(sc>=90) {
			System.out.println(sc+"점"+"상위10%");   
		}else if(int)(sc>=70){
			System.out.println(sc+"점"+"상위30%");
		}else if(int)(sc>=40){
			System.out.println(sc+"점"+"상위80%");
		}
		System.out.println();
		
		
		
		
		
		TreeSet<String>score=new TreeSet<>();
		score.add("89점 이순신"); score.add("67점 김유신");
		score.add("45점 문익점"); score.add("98점 한석봉");
		score.add("72점 박문수"); score.add("81점 김춘추");
		score.add("59점 이성계"); score.add("32점 정약용");
		
		

	}

}
