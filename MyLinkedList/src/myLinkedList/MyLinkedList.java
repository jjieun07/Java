package myLinkedList;

// 양방향
// CRUD

class Node<T> {
	Node left;
	Node right;
	T num;

	Node(T n) {
		num = n;
	}
}

public class MyLinkedList<T> {
	Node<T> head;

	MyLinkedList() {
		head = null;
	}

	void add(T n) {
		if (head == null) {
			head = new Node<T>(n);
			head.right = head;
			head.left = head;

		} else {
			Node<T> node = new Node<T>(n);
			Node<T> tail = head.left;
			head.left = node;
			tail.right = node;
			node.left = tail;
			node.right = head;
		}
	}

	void delete() {
		if (head == null)
			System.out.println("없음");
		else if (head.right == head && head.left == head)
			head = null;
		else {
			Node nodeDelete = head.left;
			Node nodePrev = nodeDelete.left;
			Node nodeNext = nodeDelete.right;

			nodePrev.right = nodeNext;
			nodeNext.left = nodePrev;
		}
	}

	T get(int index) {
		Node<T> nodeGet = head;
		for (int i = 0; i < index; i++) {
			nodeGet = nodeGet.right;
		}
		return nodeGet.num;
	}

	void set(int index, T num) {
		Node<T> nodeGet = head;
		for (int i = 0; i < index; i++) {
			nodeGet = nodeGet.right;
		}
		nodeGet.num = num;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node nowNode = head;
		do {
			sb.append(nowNode.num);
			sb.append(", ");
			nowNode = nowNode.right;
		} while (nowNode != head);
		sb.append("]");
		return sb.toString();
	}
}
