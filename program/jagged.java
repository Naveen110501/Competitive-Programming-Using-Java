package naveen;

import java.util.*;

class ABCD
{
	int i,j;
	void printf(int a[][])
	{
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}
public class jagged {
public static void main(String args[])
{
	int r;
	Scanner n=new Scanner(System.in);
	System.out.println("enter the line value");
	r=n.nextInt();
	int a[][]=new int[r][];
	for(int i=0,k=1;i<r;i++,k++)
	{
		a[i]=new int[k];
	}
	ABCD nav=new ABCD();
	nav.printf(a);
}
}
