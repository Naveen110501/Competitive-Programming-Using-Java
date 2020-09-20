package naveen;
import java.util.*;
class ABCDE
{
	Scanner k=new Scanner(System.in);
	int i,m;
	String f;
	Vector <String> n=new Vector <String>();
	void array()
	{
	System.out.println("****************");
	System.out.println("arraylist");
	System.out.println("********************");
	System.out.println();
	ArrayList a=new ArrayList();
	a.add("web technology");
	a.add("python");
	a.add("data structure");
	a.add("OOPS");
	a.add("DBMS");
	System.out.println("**********************");
	System.out.println("retrival using index");
	System.out.println("******************");
	for(i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	a.clear();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	Iterator l=a.iterator();
	System.out.println("**********************");
	System.out.println("retrival using iterartor");
	System.out.println("******************");
	while(l.hasNext())
	{
		System.out.println(l.next());
	}
	a.clear();
	System.out.println("****************");
	System.out.println("vectorlist");
	System.out.println("********************");
	System.out.println("enter the size of vector");
	m=k.nextInt();
	System.out.println("enter the string");
	for(i=0;i<m;i++)
	{
		f=k.next();
		n.add(f);
    }
	System.out.println("**********************");
	System.out.println("retrival using faster for lop");
	System.out.println("**********************");
	for(Object c:n)
	{
		System.out.println(c+" ");
	}
	System.out.println("**********************");
	System.out.println("retrival using oject");
	System.out.println("**********************");
	System.out.println(n);	
}
}
public class arraylist {
public static void main(String args[])
{
	ABCDE nav =new ABCDE();
	nav.array();
}
}
