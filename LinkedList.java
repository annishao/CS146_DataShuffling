package cs146F20.shao.project1;

public class LinkedList {
	private Node tail;
	private int size;
	
	public LinkedList() {
		tail = null;
		size = 0;
	}
	
	// Returns true if LinkedList is empty; false otherwise.
	public boolean isEmpty() {
		return size == 0;
	}
	
	// Returns the size of the LinkedList.
	public int getSize() {
		return size;
	}
	
	// Returns the tail of the LinkedList.
	public Node getTail() {
		return tail;
	}
	
	// Inserts a new Node to the LinkedList.
	public void insert(int value) {
		// Creates a new Node n to be added.
		Node n = new Node(value);
		
		// If LinkedList is empty, set next Node to n.
		if(tail == null) {
			tail = n;
			tail.setNext(n);
		} else {
			 // If LinkedList is not empty, 
			 // set next Node to the original tail's next Node.
			 Node prevTail = tail;
			 Node beginning = tail.getNext();
			 prevTail.setNext(n);
			 tail = n;
			 n.setNext(beginning);
		}
		// Increase the size of LinkedList by 1.
		size++;
	}
	
	// Deletes a Node at the given index and returns the node after 
	// the node that was just deleted.
	public Node delete(int index) {
		// Creates variables prev, node, and after.
		Node prev = new Node(0);
		Node node = tail;
		Node after = tail.getNext();
		
		// Updates the 3 variables until node is at the correct index.
		while(node.getData() != index) {
			prev = node;
			node = after;
			after = after.getNext();
		}
		
		// Special case: if the tail of the LinkedList is removed,
		// set the node before tail as the new tail.
		if(node == tail) {
			tail = prev;
		}
		// Removes node at the index by setting the prev to after.
		prev.setNext(after);
		
		// Decreases the size of the LinkedList by 1.
		size--;
		
		// Returns the node after the node that was just deleted.
		return after;
	}
}
