package programjava;

interface arith {
	void add();
	void sub();
	void mult();
	void div();
}
class maths implements arith{
	int a=20,b=10;
	public void add() {
	System.out.println("Addition :"+(a+b));
	}
	public void sub() {
		System.out.println("Addition :"+(a-b));
		}
	public void mult() {
		System.out.println("Addition :"+(a*b));
		}
	public void div() {
		System.out.println("Addition :"+(a/b));
		}
		public static void main(String[] args) {
			maths m=new maths();
			m.add();
			m.sub();
			m.mult();
			m.div();
		}
	
}
