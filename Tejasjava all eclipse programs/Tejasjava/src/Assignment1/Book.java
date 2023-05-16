package Assignment1;

class Book1 {
	String Name;
	int Prize;
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}
	public void setPrize(int Prize)
	{
		this.Prize=Prize;
	}
	public int getPrize()
	{
		return Prize;
	}
	void createBook()
	{
		setName("TeJas");
		setPrize(50000);
	}
	void showBook()
	{
		System.out.println(getName());
		System.out.println(getPrize());
	}
}
	public class Book{
		
		
	public static void main(String[] args) {
	Book1 b=new Book1();
	b.createBook();
	b.showBook();
	}
	}

