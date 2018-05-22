package Distribuidos;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception
	{
		/*Scanner in = new Scanner(System.in);
		System.out.println("Mensaje: ");
		String msg = in.next();*/
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Socket s = null;
		
		//instancio el server con la IP y el PORT
		s = new Socket("localhost", 5432);
		oos = new ObjectOutputStream(s.getOutputStream() );
		ois = new ObjectInputStream(s.getInputStream() );
		
		//envio un mensaje
		oos.writeObject("Hola galleta");
		
		//recibe la respuesta (el saludo persoalizado)
		String ret = (String)ois.readObject();
		 
		//muestro la respuesta que envio el server
		System.out.println(ret);

		if( oos !=null ) oos.close();
		if( ois != null) ois.close();
		if( s != null ) s.close();
	}
}
