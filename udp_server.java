    package naveen;
	import java.net.*;
	import java.util.*;
	public class udp_server
	{
	public static void main(String[] args)
	{
	try
	{
	DatagramSocket dsserver=new DatagramSocket(1544);
	byte[] sendata=new byte[1024];
	byte[] recdata=new byte[1024];
	while(true)
	{
	recdata=new byte[1024];
	DatagramPacket recpacket=new DatagramPacket(recdata,recdata.length);
	dsserver.receive(recpacket);
	String clismsg=new String(recpacket.getData());
	if(clismsg.equalsIgnoreCase("bye"))
	{
	break;
	}
	InetAddress ipaddr=recpacket.getAddress();
	int port=recpacket.getPort();
	String toupcase=clismsg.toUpperCase();
	System.out.println("Client :"+clismsg);
	sendata=toupcase.getBytes();
	DatagramPacket sendpacket=new DatagramPacket(sendata,sendata.length,ipaddr,port);
	dsserver.send(sendpacket);
	System.out.println("Server :"+toupcase);
	}
	dsserver.close();
	}catch(Exception x)
	{
	x.printStackTrace();
	}
	}
	}

 


