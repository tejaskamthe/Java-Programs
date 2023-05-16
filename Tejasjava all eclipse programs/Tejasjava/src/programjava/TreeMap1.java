package programjava;

import java.util.*;
import java.util.Map.Entry;

public class TreeMap1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(2,"Two");
		map.put(1,"one");
		map.put(4, "Four");
		map.put(3,"Three");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("After Remove() Method");
		map.remove(2);
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
