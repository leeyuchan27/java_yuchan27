package j0716;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class J1 {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		
		map.put("�̼���",19990405);
		map.put("������",19990101);
		map.put("�念��",20110718);
		map.put("�̵�",20051103);
		map.put("������",20091010);
		map.put("�̼���",20091010);
		
		map.putIfAbsent("�念��",1222);
		
		System.out.println(map);

		System.out.println(map.get("�̼���"));
		map.replace("�̼���",19760505);
		System.out.println(map);
		System.out.println(map.containsKey("�̼���"));
		Set<String>keys=map.keySet();
		System.out.println(keys);
		Set<Map.Entry<String,Integer>>entry=map.entrySet();
		System.out.println(entry);
		map.forEach((k,v)->System.out.println(k+""+v));
		
	}

}
