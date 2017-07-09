package myproj;

public class Fibnossi_series {

	public static void main(String[] args) 
	{
		int a,b,c;
		a=0;
		b=1;
		System.out.print("  "+a);
		c=a+b;
		while(c<100)
		{
			System.out.print("   "+c);
			c=a+b;
			a=b;
			b=c;
			
			
		}
		
	}

}
