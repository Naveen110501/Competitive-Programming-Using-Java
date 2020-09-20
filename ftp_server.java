package naveen;
import java.net.*;
import java.io.*;
import java.util.*;
class FileTransfer
{
Socket soc;
ServerSocket ss;	
DataInputStream din;
DataOutputStream dout;
String fname;
File recfile;
String filecon;
FileTransfer() throws Exception
{
ss=new ServerSocket(9999);
soc=ss.accept();
din=new DataInputStream(soc.getInputStream());
dout=new DataOutputStream(soc.getOutputStream());
}
void sendfile() throws Exception
{
Scanner in=new Scanner(System.in);
//dout.writeUTF("R");
//System.out.println("File Name :");
fname=din.readUTF();
System.out.println("File name :"+fname);
recfile=new File(fname);
if(recfile.exists())
{
dout.writeUTF("Y");
if((din.readUTF()).equalsIgnoreCase("Y"))
startsend();								
else
{}	}
else{
System.out.println(" Not Found");
dout.writeUTF("N");
}}
void startsend() throws Exception
{
String filecon;
FileInputStream fos=new FileInputStream(recfile);
int ch;
System.out.println("Transferring File ....");
while(true)
{
ch=fos.read();
if(ch!=-1)
{
dout.writeUTF(String.valueOf(ch));
}
else
break;
}
System.out.println("File Transferring Completed .");
}
}
public class ftp_server
{
public static void main(String[] args) throws Exception
{
FileTransfer fs=new FileTransfer();
fs.sendfile();	
System.out.println("Disconnected .");
}
}
