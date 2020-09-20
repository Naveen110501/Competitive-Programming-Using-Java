package naveen;
import java.util.Scanner;
public class checkprime
{
   public static void main(String []args)
   {		
	int t;
	boolean isPrime=true;
	Scanner in= new Scanner(System.in);
	System.out.println("Enter any number: ");
	int num=in.nextInt();
	for(int i=2;i<=num/2;i++)
	{
           t=num%i;
	   if(t==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}