package chatClient;

public class ChatClientMain {
	   public static void main(String[] args) {
	      IClientChat clientChat = new ChatClient();
	      
	      // 클라이언트에서 받은 정보를 gui에 보여주기 위해 client를 인수로 전달
	      ChatClientGUI gui = new ChatClientGUI(clientChat);
	   }
	   
	}