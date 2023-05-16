public class cmdarg5{
	public static void main(String[] args) {
		int m, n[]=new int[5],i,sum=0;
		
		for(i=0;i<5;i++){
			n[i]=Integer.parseInt(args[i]);
			System.out.println("5 No.:"+n[i]);
			sum=sum+n[i];
		
		}
		System.out.println("Sum Of No.:"+sum);
	}
}