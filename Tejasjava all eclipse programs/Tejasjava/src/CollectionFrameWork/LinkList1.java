package CollectionFrameWork;
import java.util.*;
public class LinkList1 {
	public static void main(String[] args) {
	LinkedList<String>al=new LinkedList<String>();
	al.add("ravi");
	al.add("Suraj");
	al.add("ravi");
	al.add("Tejas");
	al.add("String");
	al.remove(4);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//al.remove(2);
	//Iterator<String> itr1=al.iterator();
	//while(itr1.hasNext()) {
		//System.out.println(al);
	}	}

	//}
