package naveen;
import java.util.*;
interface square
{
	float a=5;
	void fun();
}
interface rectangle
{
float b=2;
void fun1();
}
class triangle implements square,rectangle
{
	public void fun()
	{
		//Scanner n=new Scanner(System.in);
		//System.out.println("enter the length : ");
		//a=n.nextLine();
	System.out.println("area of square : " +(a*a));
	}
	public void fun1()
	{
		//Scanner n=new Scanner(System.in);
		//System.out.println("enter the breadth : ");
		//b=n.nextLine();
	System.out.println("area of rectangle : " +(b*a));
	}
	public void fun2()
	{
	System.out.println("area of triangle : " +(0.5*b*a));
	}
} 
public class Simple {
	public static void main(String[] args)
	{
	triangle nav=new triangle();
	nav.fun();
	nav.fun1();
	nav.fun2();
	}
}
