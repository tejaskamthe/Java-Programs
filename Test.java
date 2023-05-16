public class Test {

	public static void main(String[] args) {
		
		   try{  
			    int a[]=new int[5];
			    a[5]=30/0;
			    System.out.println(a[10]); 		 	//"Arithmetic Exception occurs"
			    
			    /*int a[]={1,2,3,4,5};
			    System.out.println(a[10]);*/ 		//"ArrayIndexOutOfBounds Exception occurs"
			   }  
			   catch(ArithmeticException e)
		          {
				   System.out.println("Arithmetic Exception occurs");
				  }  
			   catch(ArrayIndexOutOfBoundsException e)
		          {
				   System.out.println("ArrayIndexOutOfBounds Exception occurs");
				  }  
			   catch(Exception e)
		          {
				   System.out.println(e); //If Do Not Declare Any Specific Type Of Exceptiion "
				  }  		  
			   System.out.println("rest of the code");  
	}
}
