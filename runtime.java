package naveen;
class X
{
	int id=6071;
	String name="Naveen",dept="IT",college="MIT";
	void print()
	{
		System.out.println("name" +name+ "id :" +id+ "dept :" +dept+ "college" +college);
	}
}
class Y extends X
{
	int id=6013;String name="Sainadh",dept="CS",college="CEG";
	void print()
	{
		super.print();
		System.out.println("name" +name+ "id :" +id+ "dept :" +dept+ "college" +college);
	}
}
public class runtime {
public static void main(String[] args)
{
	Y nav=new Y();
	nav.print();
}
}
