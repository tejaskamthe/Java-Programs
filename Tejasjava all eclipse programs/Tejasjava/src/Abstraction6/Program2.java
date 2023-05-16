package Abstraction6;
class Mediccine{
	String name;
	String address;
	public void dispalylable(){
		System.out.println("This Medicine is Manufacture By \n******'TSKP Company'******");
		System.out.println("Addree- kondhwa Bk Pune-411048");
	}
}
class Tablet extends Mediccine{
	public void displaylable() {
		System.out.println("This tablet Should Store In Cool Place Only..");
	}
}
class Syrup extends Mediccine{
	public void displaylable() {
		System.out.println("Shake Before It Use...");
	}
}
class Oinment extends Mediccine{
	public void dispalylable() {
		System.out.println("Only For External Use...");
	}
}
public class Program2 {

	public static void main(String[] args) {
		Mediccine m[]=new Mediccine[10];
		double i=Math.random()*4;
		int j=(int)i;
		System.out.println(j);
		switch(j) {
		case 1:
			m[0]=new Mediccine();
			m[1]=new Tablet();
			m[0].dispalylable();
			m[1].dispalylable();
			break;
		case 2:
			m[2]=new Mediccine();
			m[3]=new Syrup();
			m[2].dispalylable();
			m[3].dispalylable();
			break;
		case 3:
			m[4]=new Mediccine();
			m[5]=new Oinment();
			m[4].dispalylable();
			m[5].dispalylable();
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
