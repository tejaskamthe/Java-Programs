package programjava;

import java.util.*;

public class LinkMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"Tejas");
		map.put(102,"vijay");
		map.put(103,"Vijay");
		map.put(104,"Kamthe");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
