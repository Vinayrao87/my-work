package myproj;

public class Print_only_digit 
{

	public static void main(String[] args)
	{
		String ch="lah34hkhkhalh335sf53fd43d43";
		int p=ch.length();
		for (int i=0;i<p;i++)
		{
			if(Character.isDigit(ch.charAt(i)))
			{
				System.out.print(ch.charAt(i)+"  ");
			}
		}
			
			
		}
}
