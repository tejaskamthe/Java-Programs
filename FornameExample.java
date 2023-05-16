class Simple{}
public class FornameExample{

	public static void main(String[] args) throws ClassNotFoundException {
		Class c=Class.forName("Simple");
		System.out.println(c.getName());
		//System.out.println("Tejas");
	}
}

