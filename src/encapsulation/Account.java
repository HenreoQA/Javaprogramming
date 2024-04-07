package encapsulation;

public class Account 
{
  private int acct_no; // variable (make the variables private so that it can be accessed only through getters and setters methods)
  private String name; // variable
  private double amount; // variable
  
//click on source menu above and select generate getters and setters, select the variables and click on update
  
public int getAcct_no() 
{
	return acct_no;
}

public void setAcct_no(int acct_no) 
{
	this.acct_no = acct_no;
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public double getAmount() 
{
	return amount;
}

public void setAmount(double amount) 
{
	this.amount = amount;
}


}

