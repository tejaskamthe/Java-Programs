class p1
{
	int a;
	String name;
	p1(){
		a=0; name=null;
	}
	void show()
	{
		System.out.println(a+" "+name);
	}
	public static void main(String[] args) {
		p1 ref=new p1();
		ref.show();
	}
}