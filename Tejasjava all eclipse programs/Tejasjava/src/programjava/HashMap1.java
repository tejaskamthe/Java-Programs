package programjava;

import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Banana");
		map.put(2,"Apple");
		map.put(3,"Mango");
		map.put(4,"Grapes");
		map.put(4,"Apple");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
