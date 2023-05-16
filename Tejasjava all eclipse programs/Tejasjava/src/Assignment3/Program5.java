package Assignment3;

public class Program5 {
	private static Program5 sc=null;
	public String str;
	private Program5() {
		str="I am Tejas";
	}
	/*public static Program5 getInstance() {
		if(sc==null)
		{
			sc=new Program5();
		}
		return sc;
	}*/
	public static void main(String[] args) {
		Program5 s1=new Program5();
		Program5 s2=new Program5();
		Program5 s3=new Program5();
		System.out.println("First Reference:"+s1.str);
		System.out.println("Second Reference:"+s2.str);
		System.out.println("Third Reference:"+s3.str);
	}

}
