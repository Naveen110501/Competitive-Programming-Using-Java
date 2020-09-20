package naveen;
import java.io.*;
import java.net.*;
public class server {
	public static void main(String[] args) throws Exception
	{
		ServerSocket s=new ServerSocket(12313);
		Socket c=s.accept();
		System.out.println("connected");
		DataInputStream nout=new DataInputStream(c.getInputStream());
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream mout=new DataOutputStream(c.getOutputStream());
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String p=nout.readUTF();
			System.out.println("client :"+p);
			String i=d.readLine();
			mout.writeUTF(i);
			if(p.equalsIgnoreCase("exit"))
				break;
		}
s.close();
	}

}
