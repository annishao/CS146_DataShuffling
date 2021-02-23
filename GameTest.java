package cs146F20.shao.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	double time;
	Game game;
	
	@BeforeEach
	void setUp() {
		time = System.nanoTime();
		game = new Game(0);
	}
	
	@Test
	public void testLinkedList() {
		// Creates a LinkedList object. Ensures that list is empty and size is 0.
		double time = System.nanoTime();
		LinkedList list = new LinkedList();
		System.out.println(System.nanoTime() - time);
		assertTrue(list.isEmpty());
		assertEquals(0, list.getSize());
		
		// Ensures that after inserting, the list is not empty and size is 1.
		time = System.nanoTime();
		list.insert(1);
		System.out.println(System.nanoTime() - time);
		assertFalse(list.isEmpty());
		assertEquals(1, list.getSize());
		
		// Counts the time it takes to delete a non-tail node in a linkedlist.
		list.insert(2);
		time = System.nanoTime();
		list.delete(2);
		System.out.println(System.nanoTime() - time);
		
		// Ensures that after deleting a node in a list size 1, the list
		// will then be empty and size 0.
		list.delete(1);
		time = System.nanoTime();
		System.out.println(System.nanoTime() - time);
		assertTrue(list.isEmpty());
		assertEquals(0, list.getSize());
	}
	
	@Test
	public void testGameCase1() {
		// Test case 1: Normal circumstances
		time = System.nanoTime();
		game = new Game(6);
		assertEquals(1, game.elimination(2));
		System.out.println(System.nanoTime() - time);
	}
	
	@Test
	public void testGameCase2() {
		// Test case 2: Original LinkedList has 1 node only
		time = System.nanoTime();
		game = new Game(1);
		assertEquals(1, game.elimination(9));
		System.out.println(System.nanoTime() - time);
	}
	
	@Test
	public void testGameCase3() {
		// Test case 3: n and k are same value
		time = System.nanoTime();
		game = new Game(7);
		assertEquals(4, game.elimination(7));
		System.out.println(System.nanoTime() - time);
	}
	
	@Test
	public void testGameCase4() {
		// Test case 4: Fairly large LinkedList size
		time = System.nanoTime();
		game = new Game(12);
		assertEquals(2, game.elimination(8));
		System.out.println(System.nanoTime() - time);
	}
	
	@Test
	public void testGameCase5() {	
		// Test case 5: k is 1
		time = System.nanoTime();
		game = new Game(5);
		assertEquals(3, game.elimination(1));
		System.out.println(System.nanoTime() - time);
	}
	
	
}