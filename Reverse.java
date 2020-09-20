package naveen;
import java.util.Scanner;
    public class Reverse{
       int i;String instr,cpstr;
      public void check()
      {
          cpstr="";
      for(i=instr.length()-1;i>=0;i--)
      {
          cpstr+=instr.charAt(i);
      }
System.out.println("After Reversing :"+cpstr);      }
     public static void main(String args[]){  
        Reverse r=new Reverse();
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        r.instr=in.nextLine();
        r.check();
    }  
    } 