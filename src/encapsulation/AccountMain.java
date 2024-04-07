package encapsulation;

public class AccountMain {

	public static void main(String[] args) 
	{
	  Account acct=new Account(); // creating object
	  acct.setAcct_no(123); // Calling setters method to assign/set data to the variables
	  acct.setName("John"); // Calling setters method to assign/set data to the variables
	  acct.setAmount(5000.00); // Calling setters method to assign/set data to the variables
	  
	  System.out.println(acct.getAcct_no()); // Calling getters method to get data from the variables
	  System.out.println(acct.getName()); // Calling getters method to get data from the variables
	  System.out.println(acct.getAmount()); // Calling getters method to get data from the variables

	}

}
