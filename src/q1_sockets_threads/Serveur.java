package q1_sockets_threads;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur extends ServerSocket {
	private static int port = 2012;
	private Socket client;
	private ObjectInputStream ois;
	public class RunServeur implements Runnable{

		@Override
		public void run() {
			try {
				System.out.println("Attente d'un client");
				client = accept();
				Ig.jLabel_Etat_Client.setText("Client connecté");
				System.out.println("Client connécté");
				ois = new ObjectInputStream(client.getInputStream());
				Livre l = (Livre)ois.readObject();
				Ig.jLabel_Objet_Recu.setText(l.toString());
				System.out.println(l.toString());
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public Serveur() throws IOException {
		super(port);
		RunServeur rs = new RunServeur();
		Thread t = new Thread(rs);
		t.start();
		// TODO Auto-generated constructor stub
	}

	public Serveur(int arg0, int arg1, InetAddress arg2) throws IOException {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

	public Serveur(int arg0, int arg1) throws IOException {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Serveur(int arg0) throws IOException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
