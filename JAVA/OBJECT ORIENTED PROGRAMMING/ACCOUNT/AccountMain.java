import java.util.Scanner;
public class AccountMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		Account myAccount = new Account();
		
		System.out.println("The initial name is " + myAccount.getName());
		System.out.println("Please Enter Your Name:   ");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();

		System.out.println("Name in Object Account is:   " + myAccount.getName());
	}
}