package naveen;
interface Anaveen
{
	float w=70.87f;
	float h=1.91f;
	void print();
}
abstract class know implements Anaveen
{
	abstract void get();
	public void print()
	{
		System.out.println("**************");
		System.out.println("Good BMI ranges");
		System.out.println("***************");
		System.out.println("For Ideal MEn & women 18.5 - 24.9");
	}
}
public class interface2 extends know {
	float bmi;
	void get()
	{
		bmi=w/(h*h);
		System.out.println("your BMI" +bmi);
	}
	public static void main(String[] args)
	{
		interface2 n=new interface2();
		know nav=n;
		nav.get();
		nav.print();
	}

}
