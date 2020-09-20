package naveen;
import java.util.*;
class BBD
{
	HashSet a=new HashSet();
	TreeSet b=new TreeSet();
	void add()
	{
		a.add("web technololgy");
		a.add("web technology");
		a.add("OOPS");
		a.add("DBMS");
		a.add("datastructure");
		b.add(13);
		b.add(14);
		b.add(16);
		b.add(17);
	}
	void disp()
	{
		Iterator m=a.iterator();
		while(m.hasNext()) 
		{
			System.out.println(m.next());
		}
		for(Object c:b)
		{
			System.out.println(c+" ");
		}
	}
}


public class set {
	public static void main(String args[])
	{
		BBD nav =new BBD();
		nav.add();
		nav.disp();
	}
}
