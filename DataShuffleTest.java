package cs146F20.shao.project1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataShuffleTest {
	DataShuffle test;
	
	@BeforeEach
	void setUp() {
		test = new DataShuffle();
	}
	
	@Test
	public void testShuffling(){
		test.readFromFile("ErdosCA.txt");
		test.shuffle();
		test.writeDataToFile();
		
		try {		
			BufferedReader Out = new BufferedReader (new FileReader ("ShaoAnniShuffled.txt"));
			BufferedReader In = new BufferedReader (new FileReader ("Target3.txt"));
			String expectedLine;
			String actualLine;
			while ((expectedLine = In.readLine()) != null) {
				actualLine = Out.readLine();
				// Tests line by line if shuffled data in file ShaoAnniShuffled.txt
				// is equal to the file Target3.txt.
				assertEquals((String) expectedLine, (String) actualLine);
			}
			Out.close();
			In.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}