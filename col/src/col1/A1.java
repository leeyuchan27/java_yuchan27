package col1;

import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {
		ArrayList<Member> list=new ArrayList<>();
		
		list.add(new Member("�̼���",34,"19911005"));
		list.add(new Member("������",27,"19981008"));
		list.add(new Member("�̽�",29,"19961005"));
		list.add(new Member("�̼�",35,"19900105"));
		list.add(new Member("�ε鷹",25,"20000406"));
		
		for(Member mem:list) {
			if(mem.getBirth().isBlank()) {
				int year=2024-mem.getAge();
				mem.setBirth(year+"0000");
			}
		}
		System.out.println(list);
		
		Object obj;
	}

}
