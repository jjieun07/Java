package chatClient;

// client�� �ؾ��ϴ� ���
public interface IClientChat {
	void sendMessage(String message);
	
	// recieveMessage(String message) -> �޽����� ���;� ����Ǿ�� ��
	// �޽����� ���� ������ �𸣱� ������ listener�� �߰��Ͽ� �̺�Ʈ ó��..?
	void addOnRecieveListener(OnRecieveListener onRecieveListener);
}
