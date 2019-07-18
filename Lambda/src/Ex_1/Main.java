package Ex_1;

interface T {
	void func1() throws Exception;
}

class A {
	void func2(T t) {
		System.out.println('1');
		
		try {
			t.func1();
		} catch (Exception e) {
			
		}
		
		System.out.println('2');
		
		
		/* 
		 System.out.println('1');
		 
		 try { Thread.sleep(2000); System.out.println("ȣ����"); } catch
		 (InterruptedException e) { e.printStackTrace(); }
		 
		 System.out.println('2');
		 */
		 

	}
	void func1() {
		
		func2(new T() {
		// func1()���� �߻��ϴ� exception�� å������ �ʱ� ������ func1�� �θ� �Լ����� å�� �ѱ�.
			public void func1() throws Exception {
				Thread.sleep(2000);
				System.out.println("ȣ����");
			}
		});

		func2(new T() {
			public void func1() throws Exception {
				Thread.sleep(2000);
				System.out.println("�ڳ���");
			}
		});

		func2(new T() {
			public void func1() throws Exception {
				Thread.sleep(2000);
				System.out.println("������");
			}
		});

	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.func1();
	}
}
