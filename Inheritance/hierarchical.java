package naveen;
import java.util.*;
class calculator
{
	float a,b;
	Scanner n=new Scanner(System.in);
	void get()
	{
			System.out.println("enter the a value : ");
			a=n.nextFloat();
			System.out.println("enter the b value : ");
			b=n.nextFloat();
}
}
class add extends calculator
{
void fun()
{
	System.out.println("Addition : " +(a+b));
}
}
class sub extends calculator
{
void fun()
{
	if(a>b)
	{
	System.out.println("substraction : " +(a-b));
	}
	else
	
		{System.out.println("substraction : " +(b-a));	
}
}
}
class mul extends calculator
{
void fun()
{
	System.out.println("multiplication : " +(a*b));
}
}
public class hierarchical {
public static void main(String[] args)
{
	add nav=new add();
	sub nav1=new sub();
	mul nav2=new mul();
	nav.get();
	nav.fun();
	nav1.get();
	nav1.fun();
	nav2.get();
	nav2.fun();
}
}
                                                                                                                                                                    