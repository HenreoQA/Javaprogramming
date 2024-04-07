package method;

/* METHOD: Is a block or group of statements which performs certain task. Method is called through object.

Different ways of creating method:

1. No parameters, No return of values

2. No parameters, Return of values

3. Take parameters, No return of values

4. Take parameters, Return of values*/

public class Greetings 
{
	// 1. No parameters, no return values
	
	void greeting1() // void means no return of values, greeting1=name of the method, ()=no parameters
	{
		System.out.println("Hello...");
	}
	
	// 2. No parameters, return values
	
	 String greeting2() // Assign data type of the values you are returning to the method
	 {
		 return "Hello...How are you";
	 }
	 
	 int greeting3() // Assign data type of the value
	 {
		 return 100;
	 }
	 
	 float greeting4()
	 {
		 return 10.567f;
	 }
	 
	 double greeting5()
	 {
		 return 20.6789543455;
	 }
	 
	 char greeting6()
	 {
		 return 'A';
	 }
	 
	 boolean greeting7()
	 {
		 return true;
	 }
	 
	// 3. Take parameters, No return of values
	 
	 void greeting8(String name)
	 {
		 System.out.println(name);
	 }

	 void greeting9(int number)
	 {
		 System.out.println(number);
	 }
	 
	 
	 // 4. Take parameters, return of values
	 
	 String greeting10(String name)
	 {
		 return "John";
	 }
	 
	 int greeting11(int number)
	 {
		 return number;
	 }
	 
	 
	 
	 
	 

	
	

}
