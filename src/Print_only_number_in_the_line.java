
public class Print_only_number_in_the_line {
	
	
	
	public static void main(String[] args)
	{
		String str="how are u24 hhk8 hkhs34";
		int i=0;
		while(i<str.length())
		{
			if(Character.isDigit(str.charAt(i)))
				System.out.println(str.charAt(i));
			i++;
		}
		
				
	}

}
