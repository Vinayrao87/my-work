package myproj;

public class array {

	public static void main(String[] args) 
	{
		int x[]=new int[5];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		
		int y[]={1,2,3,4,5};
		
		for(int i=0; i<x.length; i++)
		{
			System.out.print(x[i]+"  ");
		}
		
		for(int j:y)
			System.out.print(j+"  ");
	}

}
