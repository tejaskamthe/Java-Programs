package programjava;

public class VoteEligible {
public static void vote(int age) throws UserdefineException {
	if(age<18) {
		throw new UserdefineException("You Are Not Eligible For Vote");
	}
	else {
		System.out.println("You are Eligible For Vote..");
	}
	
}
	public static void main(String[] args) throws UserdefineException{
		try {
		vote(12);
		}
		catch(UserdefineException e) {
			System.out.println(e);
		}
	}

}
