package Observer;

public class Myapp {
	public static void main(String[] args) {
		 System.out.println("Enter Text >");

	     // 이벤트 발행 주체를 생성함 - stdin으로부터 문자열을 입력받음
	      EventSource evSrc = new EventSource();

	     // 옵저버를 생성함
	      ResponseHandler respHandler = new ResponseHandler();

	     // 옵저버가 발행 주체가 발행하는 이벤트를 구독하게 함
	     evSrc.addObserver( respHandler );

	     // 이벤트를 발행시키는 쓰레드 시작
	     Thread thread = new Thread(evSrc);
	     thread.start();
	}	
}
