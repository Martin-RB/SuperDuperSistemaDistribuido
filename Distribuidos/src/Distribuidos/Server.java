package Distribuidos;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Distribuidos.ClientThread;

public class Server {
	public static void main(String[] args) throws Exception
	{
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		Socket s = null;
		ServerSocket ss = new ServerSocket(5432);	
		
		while( true)
		{
			try
			{
				//el serversocket me da el socket
				s = ss.accept();
				new ClientThread(s).start();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			Thread.sleep(2000);
		}	
	}
}
