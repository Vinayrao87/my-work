import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class List_example {

	public static void main(String[]args)
	{
		List<String> lst=new ArrayList<String>();
		
		lst.add("1java");
		lst.add("2testing");

		lst.add("3mango");
		lst.add("4banana");

	for(String x: lst)
		{
		System.out.println(x);
		}
	lst.add(2,"2changed");
    
	for(String x: lst)
		{
		System.out.println(x);
		}
	
	
	HashMap<String,String> h= new HashMap<String,String>();
	h.put("sno", "56");
	h.put("sname", "ravi");
	h.put("score", "79");
	h.put("sname", "harish");//existing key will be overwritten
	     //key       value
	System.out.println(h.get("sname"));
	}
	
	
	
	
}
