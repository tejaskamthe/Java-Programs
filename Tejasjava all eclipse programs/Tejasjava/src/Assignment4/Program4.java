package Assignment4;

public class Program4 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Length Is:"+sb.length());
		System.out.println("String Capacity:"+sb.capacity());
		System.out.println("Add Name At Last:"+sb.append("  World"));
		System.out.println("Deleting Character:"+sb.deleteCharAt(3));
		System.out.println("Delete String From Given Index:"+sb.delete(0, 1));
		System.out.println("To Reverse String:"+sb.reverse());
	}

}
