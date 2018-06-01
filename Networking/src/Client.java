
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	
	 
	    private static Socket socket;
	 
	    public static void main(String args[])
	    {
	    	Scanner sc = new Scanner(System.in);
	    	String a = sc.nextLine();
	    	sc.close();
	        try
	        {
	            String host = "localhost";
	            int port = 25004;
	            InetAddress address = InetAddress.getByName(host);
	            socket = new Socket(address, port);
	 
	            OutputStream os = socket.getOutputStream();
	            OutputStreamWriter osw = new OutputStreamWriter(os);
	            BufferedWriter bw = new BufferedWriter(osw);
	            
	            String sentence = a;
	 
	            String sendMessage = sentence + "\n";
	            bw.write(sendMessage);
	            bw.flush();
	            System.out.println("Message sent to the server : "+sendMessage);
	 
	            InputStream is = socket.getInputStream();
	            InputStreamReader isr = new InputStreamReader(is);
	            BufferedReader br = new BufferedReader(isr);
	            String message = br.readLine();
	            System.out.println("Message received from the server : " +message);
	        }
	        catch (Exception exception)
	        {
	            exception.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                socket.close();
	            }
	            catch(Exception e)
	            {
	                e.printStackTrace();
	            }
	        }
	    }
	}


