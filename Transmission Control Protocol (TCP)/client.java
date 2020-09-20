package naveen;
import java.io.*;
import java.net.*;
public class client {
public static void main(String[] args) throws Exception
{
	Socket a=new Socket("localhost",12313);
	DataInputStream mout=new DataInputStream(a.getInputStream());
	BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream nout=new DataOutputStream(a.getOutputStream());
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	
	while(true)
	{
		String i=b.readLine();
		nout.writeUTF(i);
		String p=mout.readUTF();
		System.out.println("server :"+p);
		if(i.equalsIgnoreCase("exit"))
			break;
		
	}
a.close();
}
}
