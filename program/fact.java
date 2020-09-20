
package naveen;
import java.util.*;
public class fact{
    public int n,c,f=1;
public void f(int n)
     {
     
    if (n < 0)
      System.out.println("Number should be non-negative.");
    else
    {
      for (c = 1; c <= n; c++)
        f = f*c;

      System.out.println("Factorial of "+n+" is = "+f);
    }    
         
     }
     public static void main(String []args){
     int n;
    fact a=new fact();
    System.out.println("Enter an number: ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    a.f(n);
     }
}