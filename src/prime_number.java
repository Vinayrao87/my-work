
public class prime_number {

	public static void main(String[] args)
	{
		int a,cnt;
		for(int x=1;x<20;x++)
		{
			cnt=0;
			for(int y=1;y<=x;y++)
			{
				if(x%y==0)
					cnt++;
				
			}
			if(cnt==2)
				System.out.println(x+"\n");
		}
	}
}
