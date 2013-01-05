package q1_sockets_threads;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Socket {
	public ObjectOutputStream oos;
	
	public Client() throws UnknownHostException, IOException {
		super("127.0.0.1", 2012);
		// TODO Auto-generated constructor stub
	}

	public Client(InetAddress address, int port) throws IOException {
		super(address, port);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client c = new Client();
		c.oos = new ObjectOutputStream(c.getOutputStream());
		Livre l = new Livre("Martine à la plage", "John");
		c.oos.writeObject(l);
		while(true){
			
		}
	}
}
