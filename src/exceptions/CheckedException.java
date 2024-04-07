package exceptions;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException 
	{
// Checked exceptions:These are the exceptions that are automatically identified by Java compiler.
		
		 System.out.println("program is stated...");
		 System.out.println("program is in progress...");
		 
		 Thread.sleep(5000); // interrupted exception identified by Java compiler
		 
		 System.out.println("program is completed...");
		 System.out.println("program is in exited...");
			
	} 

}
