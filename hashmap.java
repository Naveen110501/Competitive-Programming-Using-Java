package naveen;
import java.util.*;
class DA
{
	HashMap h=new HashMap();
	void add()
	{
		h.put(1,"erode");
		h.put(10,"salem");
		h.put(40,"madurai");
		h.put(50,"chennai");
		h.put(60,"thanjavur");
		int m=h.keySet().size();
		Iterator i=h.keySet().iterator();
		System.out.println("key"+"   "+"value");
		while(i.hasNext())
		{
			Object key=i.next();
			Object value=h.get(key);
			System.out.println(key+"    "+value);
			
		}
	
	h.remove(10);
	System.out.println("key"+"   "+"value");
	System.out.println(h);
	}
}
public class hashmap {
	public static void main(String args[])
	{
		DA nav =new DA();
		nav.add();
	}
}
