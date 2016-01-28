import java.util.Scanner;

public class isCompany {
	
	public isCompany() {};

	//returns true if the order is for a company
	public boolean isCompany() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Are you ordering on behalf of a company? ");
		String answer = in.nextLine();
		if ( !(answer.equals("yes")) && !(answer.equals("Yes")) && !(answer.equals("YES")) )
			return false;
		else
			return true;
		
	}
	
}
