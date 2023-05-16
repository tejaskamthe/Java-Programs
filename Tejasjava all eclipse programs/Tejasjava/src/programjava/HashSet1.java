package programjava;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
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
