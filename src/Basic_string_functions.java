
public class Basic_string_functions {

	public static void main(String []args){
		
		String str="this is a sample data string haha";
		System.out.println(str.length());//for determining the length of string
		System.out.println(str.charAt(10));//character at 10th place
		System.out.println(str.substring(10));// reads from 10th place
		System.out.println(str.substring(10,18));//reads from 10th to 18th place
		System.out.println(str.contains("sample"));//checks for the "mavabati" and returns boolean
		System.out.println(str.indexOf("haha"));
		System.out.println(str.replace("is","was"));
		
	}
	
	
	
	
}
