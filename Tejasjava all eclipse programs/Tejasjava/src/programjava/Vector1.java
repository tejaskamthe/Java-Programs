package programjava;
import java.util.*;
public class Vector1{

	public static void main(String[] args) {
Vector<String>v=new Vector<String>();
v.add("ravi");
v.add("Suraj");
v.add("ravi");
v.add("Tejas");
v.remove(0);
v.add("Raju");
Iterator<String> itr=v.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
