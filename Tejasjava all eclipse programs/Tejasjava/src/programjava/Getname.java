package programjava;

class Simple1{}
public class Getname {
void printName(Object obj) {
	Class c=obj.getClass();
	System.out.println(c.getName());
}
	public static void main(String[] args) {
		Simple1 s=new Simple1();
		
		Getname t=new Getname();
		t.printName(s);

	}

}
