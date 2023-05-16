package CollectionFrameWork;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
ArrayList<String>list=new ArrayList<String>();
list.add("ravi");
list.add("Suraj");
list.add("ravi");
list.add("Tejas");
list.remove(0);
list.add("Raju");
Iterator<String> itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
