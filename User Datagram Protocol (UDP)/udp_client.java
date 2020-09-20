    package naveen;
	import java.io.*;
	import java.net.*;
	import java.util.*;
	public class udp_client
	{
	public static void main(String[] args)
	{
	 try
	{
	DatagramSocket dsclient=new DatagramSocket();
	InetAddress ipaddr=InetAddress.getByName("localhost");
	Scanner in=new Scanner(System.in);
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	byte[] senddata=new byte[1024];
	byte[] recdata=new byte[1024];
	while(true)
	{
	System.out.print("client :");
	String tosend=in.nextLine();
	//String tosend=br.readLine();
	if(tosend.equalsIgnoreCase("bye"))
	break;
	senddata=tosend.getBytes();
	DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,ipaddr,1544);
	dsclient.send(sendpacket);
	DatagramPacket recpacket=new DatagramPacket(recdata,recdata.length);
	dsclient.receive(recpacket);
	String rec_frm_ser=new String(recpacket.getData());
	System.out.println("Server :"+rec_frm_ser);
	}
	dsclient.close();
	}catch(Exception x)
	{
	x.printStackTrace();
	}
	}
	}


