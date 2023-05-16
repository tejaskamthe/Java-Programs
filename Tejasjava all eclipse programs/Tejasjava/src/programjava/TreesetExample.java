package programjava;

import java.util.*;


public class TreesetExample {

	public static void main(String[] args) {
		TreeSet<String>set=new TreeSet<String>();
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
