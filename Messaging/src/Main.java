import java.util.*;
import java.io.IOException;
import java.net.*;
public class Main {

	public static void main(String[] args) throws IOException {
		Socket socket;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which port do you want to host on?");
		int port = sc.nextInt();
		sc.close();
		ServerSocket serverSocket = new ServerSocket(port);
		while(true){
			
			System.out.println("Server Started and listening to the port " + port);
			socket = serverSocket.accept();
			Connections x = new Connections(socket);
			x.start();
		}
		
}
}