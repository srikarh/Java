import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Connections extends Thread {
	private Socket socket;
	public Connections(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		while(true) {
			try {
			InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String words = br.readLine();
            System.out.println("Message received from client is "+words);
            if(words.equals("exit")) {
            	socket.close();
            	break;
            }
            String returnMessage;
            //Scanner sc = new Scanner(System.in);
			//System.out.println("What do you want to say?");
			//String a=null;
			//if(sc.hasNextLine()) {
			//	a = sc.nextLine();	
			//}
			//sc.close();
			returnMessage = "You said " + words + "\n";

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(returnMessage);
            System.out.println("Message sent to the client is " + returnMessage);
            bw.flush();
            
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
