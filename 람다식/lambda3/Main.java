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
				//�ܺ� ��ü�� ������ ������ؼ��� Ŭ���� ��.this���
				System.out.println("outter : " + UsingThis.this.outter);
				
				System.out.println("inner : " + inner);
				//���ٽ� ������ this�� Inner ��ü ����
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
