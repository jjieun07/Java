package chatClient;

public class ChatClientMain {
	   public static void main(String[] args) {
	      IClientChat clientChat = new ChatClient();
	      
	      // Ŭ���̾�Ʈ���� ���� ������ gui�� �����ֱ� ���� client�� �μ��� ����
	      ChatClientGUI gui = new ChatClientGUI(clientChat);
	   }
	   
	}