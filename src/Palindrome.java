
public class Palindrome {

	public static void main(String[]args)
	{
		String str="madddam";
		int i,j,flag=1;
		j=str.length()-1;
		for(i=0;i<j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
				{
				flag=0;
				break;
				}
		}
		if(flag==0)
			System.out.println(str+" is  not palindrome ");
	
		else
			System.out.println(str+" is palindrome");
	}
}
