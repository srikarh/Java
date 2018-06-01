import java.net.*;
import java.io.*;
import java.util.*;
public class Server
{
	public static void main(String[] args) throws IOException
    {
		Socket socket;
        try
        {
 
            int port = 25004;
            @SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started and listening to the port " + port);
 
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String words = br.readLine();
                System.out.println("Message received from client is "+words);
 
                String returnMessage;
                Scanner sc = new Scanner(System.in);
				System.out.println("What do you want to say?");
				String a = sc.nextLine();
				sc.close();
				returnMessage = a + "\n";
 
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(returnMessage);
                System.out.println("Message sent to the client is " + returnMessage);
                bw.flush();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e){}
        }
    }
}