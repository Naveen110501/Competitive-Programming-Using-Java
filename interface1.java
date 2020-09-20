package naveen;
import java.util.*;
interface A
{
	String s="naveen";
	void comp();
}
interface B extends A
{
String r="naveen";
void get();
}
public class interface1 implements B {
	public void comp()
	{
		if(s.equals(r))
		{
			System.out.println("String is equal");
		}
	}
	public void get()
	{
		String a;
		Scanner nav = new Scanner(System.in);
		System.out.println("enter the string");
		a=nav.nextLine();
		if(s.equals(a))
		{
			System.out.println("String is equal");
		}
		else
		{
				System.out.println("String is not equal");
		}
	}
	public static void main(String[] args)
	{
		interface1 n= new interface1();
	
		n.comp();
		n.get();
	}

}
