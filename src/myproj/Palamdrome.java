package myproj;

public class Palamdrome {

	public static void main(String[] args)
	{

		String str="malaylam";
		int len= str.length();
		boolean b=true;
		for(int i=0,j=len-1;i<j;i++,j--)
		{ 
			if( str.charAt(i)!=str.charAt(j))
		    {
			b=false;
		    break;
		    }
			
		}
		if(b==true)
		{
			System.out.println(str+"it is palindreome");
		}
		else
			System.out.println(str+"it is not palindrome");
			
	}

}
