package datastuctures;

import java.util.NoSuchElementException;

public class LinkedList {

	private Node head;

	public LinkedList() {
		head = null;
	}

	public void addFirst(String data) {
		head = new Node(data, head);
	}

	public String getFirst() {

		if (head == null)
			throw new NoSuchElementException();

		return head.data;
	}

	public String removeFirst() {
		String tmp = getFirst();
		head = head.next;
		return tmp;
	}

	public String get(int key) {

		if (head == null)
			throw new NoSuchElementException();

		Node tmp = head;
		for (int i = 0; i < key; i++) {
			tmp = tmp.next;
		}

		return tmp.data;
	}

	// Inner class for Node
	private static class Node {
		private String data;
		private Node next;

		// Node constructor
		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

}
