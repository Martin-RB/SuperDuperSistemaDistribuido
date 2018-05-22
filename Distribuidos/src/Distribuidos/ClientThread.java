package Distribuidos;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread extends Thread {
	protected Socket socket;
	
	public ClientThread(Socket clientSocket) {
        this.socket = clientSocket;
    }
	
	public void run() {
		try {
			//informacion en la consola
			System.out.println("Se conectaron desde la IP: " + socket.getOutputStream());
			
			//enmascaro la entrada y salida de bytes
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			
			//leo el nombre que envia el  cliente
			String mensaje_entrante = (String)ois.readObject();
			System.out.println(mensaje_entrante);
			
			System.out.println("Mensaje");
			Scanner sc = new Scanner(System.in);
			String mensaje_enviado= sc.nextLine();
						
			//envio el saludo al cliente
			oos.writeObject(mensaje_enviado);
			
			System.out.println("Saludo enviado...");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
