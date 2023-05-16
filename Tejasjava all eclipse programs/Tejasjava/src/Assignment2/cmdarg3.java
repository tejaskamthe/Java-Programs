package Assignment2;

public class cmdarg3 {

	public static void main(String[] args) {
		float bsry;
		float da,hra,gross,it=1;
		bsry=Float.parseFloat(args[0]);
		da=bsry*0.20f;
		hra=bsry*0.30f;
		gross=bsry+da+hra;
		if((bsry>0)&&(bsry<4000))
		{
			it=bsry*0.04f;
		}
		else if((bsry>4000)&&(bsry<10000)) {
			it=bsry*0.06f;
		}

		else if((bsry>10000)&&(bsry<17000)) {
			it=bsry*0.08f;
		}
		else if((bsry>17000)&&(bsry<27000)) {
			it=bsry*0.1f;
		}
		else if(bsry>27000) {
			it=bsry*0.15f;
		}
		System.out.println("Display DA="+da);
		System.out.println("Display HRA="+hra);
		System.out.println("Display Gross="+gross);
		System.out.println("Display Income Tax="+it);
	}
}
