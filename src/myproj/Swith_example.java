package myproj;

public class Swith_example 
{

	public static void main(String[] args) 
	{
	
		String str="t";
				
		switch(str.toLowerCase())
	{
	case "a":
	case "e":
    case "i":
	case "o":
    case "u":
		{System.out.println("this is a vowel");
		break;}
		default:
			System.out.println("not a vowel");
			
	}	
				
	}}


