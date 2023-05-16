class Book1{
	String Name;
	int Prise;
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName()
	{
		return Name;
	}
	public void setPrise(int Prise)
	{
		this.Prise=Prise;
	}
	public int getPrise()
	{
		return Prise;
	}
	void createBook()
	{
		setName("Tejas");
		setPrise(50000);
	}
	void ShowBook(){
		System.out.println(getName());
		System.out.println(getPrise());
			
	}
}
public class BookDemo{
	public static void main(String[] args) {
		Book1 b=new Book1();
		b.createBook();
		b.ShowBook();
	}
}