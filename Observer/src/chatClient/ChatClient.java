package chatClient;

import java.net.Socket;
import java.io.*;

public class ChatClient extends Thread implements IClientChat {
	   int port = 64000;
	   String ip = "127.0.0.1";
	   private Socket socket;
	   private PrintWriter out;
	   private BufferedReader in;
	   private String inputMessage;
	   private OnRecieveListener onRecieveListener;
	   
	   public ChatClient() {
	      requestToConnect();
	   }
	   
	   private void requestToConnect() {
	      try {
	         socket = new Socket(ip, port);
	         OutputStream out = socket.getOutputStream();
	         InputStream in = socket.getInputStream();
	         this.out = new PrintWriter(out);
	         this.in = new BufferedReader(new InputStreamReader(in));
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      this.start();
	   }
	   
	   @Override
	   public void run() {
	      try {
	         while ((inputMessage = in.readLine()) != null) {
	            if (onRecieveListener != null) {
	               onRecieveListener.onRecieve(inputMessage);
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	   
	   @Override
	   public void sendMessage(String message) {
	      out.println(message);
	      out.flush();
	   }

	   @Override
	   public void addOnRecieveListener(OnRecieveListener onRecieveListener) {
	      this.onRecieveListener = onRecieveListener;
	   }
	}
