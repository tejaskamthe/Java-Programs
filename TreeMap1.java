import java.util.*;

public class TreeMap1 {

  public static void main(String[] args) {
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();
    map.put(5,"Banana");
    map.put(4,"Apple");
    map.put(3,"Mango");
    map.put(1,"Grapes");
    map.put(2,"Apple");
    for(Map.Entry m:map.entrySet()) {
      System.out.println(m.getKey()+" "+m.getValue());
      
    }

  }

}
