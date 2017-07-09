import java.lang.reflect.Array;

public class Basic_switch_statements {
	
	public static void main(String[] args)
	{
		String str="hello";
		char str2;
		int i=0;
		str2=str.charAt(i);
		
		while(i<str.length())
		{
			str2=str.charAt(i);
		switch(str2)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(str2+"is a vowel \n");
				break;
			default:
				System.out.println(str2+"is not a vowel \n");
		
		}
		i++;
		
		
		}
	}
	
	
	

}
