package programjava;

import java.util.*;

public class LinkedListHashset1 {

	public static void main(String[] args) {
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		set.add("ravi");
		set.add("Tejas");
		set.add("ravi");
		set.add("Suraj");
		set.add("ravi");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
