package naveen;
import java.util.*;
class P
{
	Scanner b=new Scanner(System.in);
	int a[]=new int[100];
	int n,i,sum=0;
	void add()
	{
	System.out.println("enter the array size");
	n=b.nextInt();
	System.out.println("enter the values");
	for(i=0;i<n;i++)
	{
		a[i]=b.nextInt();
		sum+=a[i];
	}
	System.out.println("Sum :"+" "+sum);
	}
	}
public class find
{
	public static void main(String args[])
	{
		P nav=new P();
		nav.add();
	}
}