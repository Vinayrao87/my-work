package myproj;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Array_sort 
{

	public static void main(String[] args)
	{
		int i,j,k=1,l=0;
		Scanner s= new Scanner(System.in);
	    int x[]=new int[5];
		while(l<=4)
		{
	    x[l]=s.nextInt();
		l++;
		}
		for (i=0;i<x.length-1;i++)
		{
			for(j=i+1;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
				k=x[i];
				x[i]=x[j];
			x[j]=k;
				}
			}
		}
		
		
		
		for(int m=0;m<x.length;m++)
			System.out.print(x[m]+"   ");
		
		
		
		
		/*int x[]={8,4,6,3,23,65,454,11};
		
		int i,k;
		for(i=0;i<x.length-1;i++)
		{
			for(j=)
			if(x[i]>x[i+1])
			{
				k=x[i];
				x[i]=x[i+1];
				x[i+1]=x[i];
			    
			    i=-1;
			}
		}
		
		for (int l:x)
			System.out.print(l+" ");*/
		
	}

}
