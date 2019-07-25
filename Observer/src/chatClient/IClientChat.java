package chatClient;

// client가 해야하는 기능
public interface IClientChat {
	void sendMessage(String message);
	
	// recieveMessage(String message) -> 메시지가 들어와야 실행되어야 함
	// 메시지가 언제 들어올지 모르기 때문에 listener를 추가하여 이벤트 처리..?
	void addOnRecieveListener(OnRecieveListener onRecieveListener);
}
