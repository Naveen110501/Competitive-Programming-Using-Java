package naveen;
import java.util.*;
class DAV
{
	TreeMap k=new TreeMap();
	void add()
	{
		k.put(1,"java");
		k.put(30,"python");
		k.put(50,"c");
		k.put(90,"c++");
		k.put(70,"linux");
		int m=k.keySet().size();
		Iterator i=k.keySet().iterator();
		System.out.println("key"+"   "+"value");
		while(i.hasNext())
		{
			Object key=i.next();
			Object value=k.get(key);
			System.out.println(key+"    "+value);
			
		}
		Set s=k.keySet();
		System.out.println("***************");
		System.out.println("retrival using faster forloop");
		System.out.println("***************");
		System.out.println("key"+"   "+"value");
		for(Object o:s)
		{
			System.out.println(o+" "+k.get(o));
		}
	}
}
public class treemap {
	public static void main(String args[])
	{
		DAV nav =new DAV();
		nav.add();
	}
}
