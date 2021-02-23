package cs146F20.shao.project1;

public class Node {
	private Node next;
	private int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public int getData() {
		return data;
	}
}
