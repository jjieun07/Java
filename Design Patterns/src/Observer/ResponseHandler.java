package Observer;

import java.util.Observable;
import java.util.Observer; /* 여기가 옵저버 */

public class ResponseHandler implements Observer
{
    private String resp;
    public void update (Observable obj, Object arg)
    {
        if (arg instanceof String)
        {
        	resp = (String) arg;
        	
        	if(resp.equals("aa")) {
        		System.out.println("종료합니다.");
        		System.exit(0);
        	}
        	
            System.out.println("\nReceived Response: "+ resp );
        }
    }
}