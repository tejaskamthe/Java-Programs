class thiss{
	int a;
	a=a;
}
void show(){
	System.out.println(a);
}
public static void main(String[] args) {
	thiss t=new thiss(100);
	t.show();
}