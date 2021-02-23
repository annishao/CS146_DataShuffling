package cs146F20.shao.project1;

import java.util.*;
import java.io.*;

public class DataShuffle {
	private String[] data;
	private double time;
	
	public DataShuffle() {
		data = new String[7515];
		time = System.nanoTime();
	}
	
	// Reads all the data from the file and puts the data into array data.
	public void readFromFile(String fileName) {
		time = System.nanoTime();
		try 
		{
			// Creates a BufferedReader object that reads from the fileName file.
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			// Skips over the metadata line (the first line) of the file.
			reader.readLine();
			
			// Adds the lines sequentially to the array data.
			for(int i = 0; i < 7515; i++) {
				data[i] = reader.readLine();
			}
			
			// Closes the BufferedReader.
			reader.close();
			
			// Calculates time it takes to read from file.
			time = System.nanoTime() - time;
			System.out.println(time);
		} 
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Shuffles the lines in the array using the Fisher-Yates algorithm.
	public void shuffle() {
		time = System.nanoTime();
		// Creates a random number generator with seed 20.
		Random random = new Random();
		random.setSeed(20);
		
		// Shuffles the array using the Fisher-Yates algorithm.
		// Starting with the last element, swap with a randomly selected element in the array
		// until the first element is reached.
		for(int i = data.length - 1; i > 0; i--) {
			// Finds a random int value between 1 and i for the index by using nextInt().
			int j = random.nextInt(i + 1);
			
			// Swaps the element of index i with element of random index j.
			String originalValue = data[i];
			data[i] = data[j];
			data[j] = originalValue;
		}
		
		// Calculates time it takes to shuffle the data.
		time = System.nanoTime() - time;
		System.out.println(time);
	}
	
	// Writes the shuffled array to a new text file titled ShaoAnniShuffled.txt.
	public void writeDataToFile() {
		time = System.nanoTime();
		try {
			// Creates a new text file titled ShaoAnniShuffled.txt.
			File file = new File("ShaoAnniShuffled.txt");
			
			// Creates a BufferedWriter and FileWriter object.
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			// Writes each element in the array to a new line in the new text file.
			for(int i = 0; i < data.length; i++) {
				bw.write(data[i]);
				bw.newLine();
			}
			
			// Closes BufferedWriter.
			bw.close();
			
			// Calculates time it takes to write to file.
			time = System.nanoTime() - time;
			System.out.println(time);
		} 
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}