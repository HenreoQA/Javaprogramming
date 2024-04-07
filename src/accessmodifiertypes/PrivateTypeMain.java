package accessmodifiertypes;

public class PrivateTypeMain {

	public static void main(String[] args) 
	{
		PrivateType p=new PrivateType();
		p.m1; // can't access the private method outside the class 
		p.h; // can't access the private variable outside the class

	}

}
