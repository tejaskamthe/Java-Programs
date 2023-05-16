class Wrapper1{
public static void main(String[] args) {
		
int num = 10;
Integer integerObj = Integer.valueOf(num); // convert int to Integer object
int newNum = integerObj.intValue(); // convert Integer object to int
System.out.println("New number is " + newNum);
}
}