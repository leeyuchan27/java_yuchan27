package j071201;

import java.util.LinkedList;

public class LinkedLIstStudy1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		
		list.add("���ֵ�");
		list.add("����");
		list.add("�︪��");
		list.add("��ɵ�");
		list.add("����");
		
		list.indexOf("�︪��");
		System.out.println(list.get(3));
		list.forEach(��->System.out.println(��));

	}

}
