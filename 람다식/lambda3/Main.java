package lambda3;
interface test1 {
	public void method();
}

class UsingThis {
	public int outter = 10;
	
	public class Inner {	 
		int inner = 20;
		int outter = 33;
		
		void method() {	//this
		test1 test1	 = () -> {
				System.out.println("outter : " + outter);
				//외부 객체의 참조를 얻기위해서는 클래스 명.this사용
				System.out.println("outter : " + UsingThis.this.outter);
				
				System.out.println("inner : " + inner);
				//람다식 내부의 this는 Inner 객체 참조
				System.out.println("inner : " + this.inner);
			};
			
			test1.method();
		}
	}
}

public class Main {
	public static void main(String[] args) {	
		UsingThis usingthis = new UsingThis();
		UsingThis.Inner inner = usingthis.new Inner();
		inner.method();
	}
}
