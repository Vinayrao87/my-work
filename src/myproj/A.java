package myproj;

public class A

{
	static int x=0;
	
	public void f1()
	{
		x++;
	}


	
	public static void main(String[] args)
	{
	
		
		
		 A o1=new A();
		o1.f1();
			
		A o2=new A();
		o2.f1();
System.out.println(o1.x+"     "+o2.x);	
	}

	
	
}
	
		
	
	
	


	
	
		
		

