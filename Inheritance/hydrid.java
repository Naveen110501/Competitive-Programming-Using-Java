package naveen;
import java.util.*;
class mark1
{
	int a;
	Scanner n=new Scanner(System.in);
	mark1()
	{
		System.out.println("enter the Internal 1/+ : ");
		a=n.nextInt();
	}
}
class mark2 extends mark1
{
	int b;
	Scanner n=new Scanner(System.in);
	mark2()
	{
		System.out.println("enter the Internal 2/+ : ");
		b=n.nextInt();
	}
}
interface credit
{
	int c=4;
	void total();
}
class average extends mark2 implements credit 
{
	float sum,sum1,avg;
	int tamil,english,maths,chemistry;
	public void get()
	{
		System.out.println("enter the tamil mark : ");
		tamil=n.nextInt();
		System.out.println("enter the english mark : ");
		english=n.nextInt();
		System.out.println("enter the maths mark : ");
	   maths=n.nextInt();
		System.out.println("enter the chemistry mark : ");
	   chemistry=n.nextInt();
	}
	public void total()
	{
		sum=(tamil+english+maths+chemistry)/4;
		sum1=(a+b)/2;
		avg=sum+sum1;
		System.out.println("total marks obtained : "+avg);
	}
}
public class hydrid {
public static void main(String[] args)
{
	average nav=new average();
	nav.get();
	nav.total();
}
}
