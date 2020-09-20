package naveen;
import java.util.Scanner;
import java.lang.Math;
public class checkarmstrong
{
    int num, n, no, t, count=0, a = 0;
    public void check()
    { 
        n=num;
        while(n > 0)
        {
            n /=10;
            count++;
        }
    }
    public void func()
    {   no=num;
        while(no!=0)
        {
            t= no % 10;
           a+=Math.pow(t,count);
            no/=10;  
        }
        if(a == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number"); 
    }
    public static void main(String[] args) {
        checkarmstrong ca=new checkarmstrong();
        System.out.println("Ënter a Number");
        Scanner in = new Scanner(System.in);
        ca.num = in.nextInt();
        ca.check();
        ca.func();
    }
}