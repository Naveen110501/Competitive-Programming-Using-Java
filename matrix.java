package naveen;
import java.util.*;
class ABC
{
	int i,j,k;
	int c[][]=new int[100][100];
	Scanner n=new Scanner(System.in);
	void mul(int a[][],int b[][],int p,int q,int r,int s)
	{
		System.out.println("enter the value for 1st matrix");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				a[i][j]=n.nextInt();
			}
		}
		System.out.println("enter the value for 2nd matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<s;j++)
			{
				b[i][j]=n.nextInt();
			}
		}
	if(q==r)
	{
		for(i=0;i<p;i++)
		{
			for(j=0;j<s;j++)
			{
				c[i][j]=0;
				for(k=0;k<r;k++)
				{
				c[i][j]+=a[i][k]*b[k][j];
				}
			}
	}
		
		
	}	
	System.out.println("after multilplication\n");
	for(i=0;i<p;i++)
	{
		for(j=0;j<s;j++)
		{
			System.out.println(c[i][j]);
		}
	}	
		
		
		
		
	}
}
public class matrix {
public static void main(String args[])
{
	int a[][]=new int[100][100];
	int b[][]=new int[100][100];
	int p,q,r,s;
	Scanner n=new Scanner(System.in);
	System.out.println("enter row and column for 1st matrix");
	p=n.nextInt();
	q=n.nextInt();
	System.out.println("enter row and column for 2nd matrix");
	r=n.nextInt();
	s=n.nextInt();
	ABC nav=new ABC();
	nav.mul(a,b,p,q,r,s);
}
}
