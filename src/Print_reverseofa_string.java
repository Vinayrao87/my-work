
public class Print_reverseofa_string {

	public static void main(String[]args)
	{
		String str="automations";
				int i;
		i=str.length()-1;
		while(i>=0)
		{
			System.out.println(str.charAt(i));
			i--;
		}
	}
}
