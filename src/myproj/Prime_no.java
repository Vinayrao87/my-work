package myproj;

public class Prime_no 
{

	public static void main(String[] args)
	{
		int cnt,n,i;
		for( n=1;n<=20;n++)
		{
			cnt=0;
			
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				cnt++;				
			}
				if(cnt==2)
				System.out.println(n);
				
		}
	}
			
			
		
		
	}
	

