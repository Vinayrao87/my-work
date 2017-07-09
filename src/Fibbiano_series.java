
public class Fibbiano_series {
	public static void main(String[] args)
	{
		int a,b,c;
		a=1;
		b=0;
		c=0;
		while(c<100)
		{
			System.out.println(c+"\t");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
