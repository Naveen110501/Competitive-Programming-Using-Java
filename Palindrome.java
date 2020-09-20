package naveen;
import java.util.Scanner;
    public class Palindrome{
       int r,sum=0,t,n;
      public void check()
      {
      t=n;    
      while(n>0){    
       r=n%10;  
       sum=(sum*10)+r;    
       n=n/10;    
      }    
      if(t==sum)    
       System.out.println("It is a Palindrome number ");    
      else    
       System.out.println("It is not a palindrome number");  
      }
     public static void main(String args[]){  
        Palindrome p=new Palindrome();
        Scanner in=new Scanner(System.in);
        p.n=in.nextInt();
        p.check();
    }  
    }  