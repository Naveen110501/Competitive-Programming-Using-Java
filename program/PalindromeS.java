package naveen;
import java.util.Scanner;
    public class PalindromeS{
       int i;String instr,cpstr;
      public void check()
      {
          cpstr="";
      for(i=instr.length()-1;i>=0;i--)
      {
          cpstr+=instr.charAt(i);
      } 
      if(instr.equals(cpstr))    
       System.out.println("It is a Palindrome string ");    
      else    
       System.out.println("It is not a palindrome string");  
      }
     public static void main(String args[]){  
        PalindromeS palin=new PalindromeS();
        Scanner in=new Scanner(System.in);
        palin.instr=in.nextLine();
        palin.check();
    }  
    } 