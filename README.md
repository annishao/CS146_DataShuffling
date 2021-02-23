# CS146_DataShuffling

##PART A – Data Shuffling

###Solution:

I implemented a data-shuffling program by reading from a given file and putting the lines into an array,
shuffling the array using the Fisher-Yates algorithm, and then writing the newly shuffled array element
by element into a new file.

###Approach:

To implement the program, I created a class DataShuffle with 3 methods: readFromFile(), shuffle(), and
writeToFile(). The class DataShuffle has instance variables String[] data and double time. In the
constructor, data[] is initialized to a size of 7515 because there are 7515 lines in the ErdosCA.txt that
need to be shuffled. There is no need for a dynamic list because the number of lines to be shuffled are
fixed in this program. The time variable is set to System.nanoTime(). This is the initial time of the system
before performing any methods.

###Cases to consider:

If the path of the file ErdosCA.txt and ShaoAnniShuffled.txt cannot be found, my code catches the
IOException and the program will stop running. To test if the data in the file was properly shuffled and
that I used the random generator and implemented the algorithm correctly, I created a Junit test. In the
DataShuffleTest class, I read the lines in ShaoAnniShuffled.txt with a BufferedReader Out and read the
lines in Target3.txt (I used Target3.txt because I generated the random numbers using nextInt()) with a
BufferedReader In. I then compared the lines in the files line by line until the end of the files were
reached using assertEquals().


##PART B

###Solution:

I implemented a circular linked list and using a loop, kept deleting every kth node in the circular linked
list until there was only 1 element left.

###Approach:

I created 3 classes to implement this program: a Node class with a reference to its data and the next
Node, a LinkedList class to create a list of nodes with an insert and delete method, and a Game class to
delete nodes in the LinkedList methodically.

##Cases to consider:

In the Junit testing, I had a method to test if my LinkedList class worked properly, which I detailed
previously in the LinkedList class description. In addition to that, I also used various cases to test that my
elimination() method in my Game class worked properly.
