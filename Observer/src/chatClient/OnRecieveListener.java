package chatClient;

// client와 gui를 연결해주는 매개체
// gui의 이벤트와 동일한 역할
public interface OnRecieveListener {
	// 클라이언트가 서버로부터 메시지를 받았을 때 실행
	   void onRecieve(String message);
}
