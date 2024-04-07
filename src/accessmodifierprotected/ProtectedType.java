package accessmodifierprotected;

import accessmodifiertypes.DefaultType; // import the package

public class ProtectedType extends DefaultType
{

	public static void main(String[] args) 
	{
		ProtectedType pt=new ProtectedType(); // creating object
		pt.m3(); // calling the protected method

	}


}
