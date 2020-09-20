 package naveen;
import java.net.*;
import java.io.*;
import java.util.*;
class FileTransfer
{ Socket soc;	
DataInputStream din;
DataOutputStream dout;
String fname;
File recfile;
String filecon;
FileTransfer() throws Exception
{ soc=new Socket("localhost",9999);
din=new DataInputStream(soc.getInputStream());
dout=new DataOutputStream(soc.getOutputStream());}
void rec_file() throws Exception{
Scanner in=new Scanner(System.in);
System.out.println("File Name :");
fname=in.nextLine();
dout.writeUTF(fname);
String server_msg=din.readUTF();
if(server_msg.equalsIgnoreCase("Y"))	{
recfile=new File(fname);
if(recfile.exists()){
System.out.println("File Already exists.Want to replace?(Y/N)");
if((in.nextLine()).equalsIgnoreCase("Y"))
{
dout.writeUTF("Y");
startrec();
}						
else	
{
System.out.println("Want to give a new File name or exit ?(Y/N)");
if((in.nextLine()).equalsIgnoreCase("Y"))
{
System.out.println("Enter :");
String newname=in.nextLine();
recfile=new File(newname);
dout.writeUTF("Y");
startrec();
}
else
{
dout.writeUTF("N");
}}}
else
{System.out.println(" Transferring File...");
startrec();}}
else
{
System.out.println("File not Found in Server");}}
void startrec() 
{
try
{
String filecon;
FileOutputStream fos=new FileOutputStream(recfile);
int ch;
System.out.println("Transferring File ....");
while(true)
{
filecon=din.readUTF();
ch=Integer.parseInt(filecon);
if(ch!=-1)
{fos.write(ch);}
else
break;
}
System.out.println("File is Received .");
}catch(Exception x)
{}}}
public class ftp_client {
	public static void main(String[] args) throws Exception{
	FileTransfer fs=new FileTransfer();
	fs.rec_file();	
	System.out.println("FTP Session Ended .");}}
