class Book1 {
	String Name;
	int prize;
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() 
	{
		return Name;
	}
	public void setPrize(int prize)
	{
		this.prize=prize;
	}
	public int getPrize()
	{
		return prize;
	}
	void CreateBook()
	{
		setName("TeJas");
		setPrize(50000);
	}
	void ShowBook()
	{
		System.out.println(getName());
		System.out.println(getPrize());
	}
}
	public class Book{
		
		
	public static void main(String[] args) {
	Book1 b=new Book1();
	b.CreateBook();
	b.ShowBook();
	}
	}
   