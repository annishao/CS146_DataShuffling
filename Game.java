package cs146F20.shao.project1;

public class Game {
	private LinkedList list;
	
	public Game(int n) {
		list = new LinkedList();
		// Creates a LinkedList with n number of prisoners.
		for(int i = 1; i <= n; i++) {
			list.insert(i);
		}
	}
	
	// Starting at the Node in position 1, eliminates every kth
	// element. If the end of the list is reached, the process loops
	// back to the beginning. 
	public int elimination(int k) {
		// Initializes the node that will be eliminated each process.
		Node node = list.getTail().getNext();
		
		// The elimination process stops when there is only 1 node left
		// in the list.
		while(list.getSize() != 1) {
			// Looks for the kth node in the list.
			// Since it is a circular linked list, it will loop back to the
			// beginning by default.
			for(int i = 0; i < k; i++) {
				node = node.getNext();
			}
			// Deletes the kth node and sets the node variable to the next node.
			node = list.delete(node.getData());
		}
		// Returns the last prisoner standing.
		return node.getData();
	}
}