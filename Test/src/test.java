import java.util.*;

class Queue {
	qNode front;
	qNode rear;
	int count = 0;
	
	public Queue() {
		front = null;
		rear = null;
	}

	public void push(int x) {
		qNode p = new qNode(x);
		if(rear == null) rear = p;
		else {
			rear.next = p;
			rear = p;
		}
		if(front == null) front = rear;
		count++;
	}

	public int pop() {
		if(front == null) return -1;
		int s = front.data;
		front = front.next;
		count--;
		return s;
	}

	public int size() {
		return count;
	}

	public int empty() {
		if(front == null)return 1;
		else return 0;
	}

	public int front() {
		if(front == null) return -1;
		return front.data;
	}
	
	public int back() {
		if(front == null) return -1;
		return rear.data;
	}
}

class qNode {
	int data;
	qNode next;
	
	qNode(int data) {
		this.data = data;
		next = null;
	}
}

public class test {


	public static void main(String[] args) {
		int n;
		Queue queue = new Queue();
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			String func = scan.next();
			
			if(func.equals("push")) {
				int x = scan.nextInt();
				
				queue.push(x);
			}
			else {
				int num = 0;
				
				if(func.equals("pop")) num = queue.pop();
				else if(func.equals("size")) num = queue.size();
				else if(func.equals("empty")) num = queue.empty();
				else if(func.equals("front")) num = queue.front();
				else if(func.equals("back")) num = queue.back();
				
				System.out.println(num);
			}
		
		}
	}
}