package myproj;

public class Fibnosi 
{

	public static void main(String[] args) 
	{
	int a,b,c;
	
	a=1;
	b=0;
	c=0;
	while(c<100)
	{
	
	System.out.print(c+"   ");
	c=a+b;
	a=b;
	b=c;
		
	}
	
	
	
	}
	
}
