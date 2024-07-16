package j0716;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class J1 {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		
		map.put("이순신",19990405);
		map.put("김춘추",19990101);
		map.put("장영실",20110718);
		map.put("이도",20051103);
		map.put("김춘추",20091010);
		map.put("이성계",20091010);
		
		map.putIfAbsent("장영실",1222);
		
		System.out.println(map);

		System.out.println(map.get("이순신"));
		map.replace("이성계",19760505);
		System.out.println(map);
		System.out.println(map.containsKey("이순신"));
		Set<String>keys=map.keySet();
		System.out.println(keys);
		Set<Map.Entry<String,Integer>>entry=map.entrySet();
		System.out.println(entry);
		map.forEach((k,v)->System.out.println(k+""+v));
		
	}

}
