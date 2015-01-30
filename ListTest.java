// ****************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some 
// ints in it, and prints the list.
//          
// ****************************************************************
//import IntList;
import java.util.*;

public class ListTest
{
    public static void main(String[] args)
    {
    	IntList list = new IntList(10);
    	list.add(100);
    	list.add(50);
    	list.add(200);
    	list.add(25);
    	
    	GetInfo.showMessage(list.toString());
    	
    	SortedIntList sortedList = new SortedIntList(10);
    	sortedList.add(100);
    	sortedList.add(50);
    	sortedList.add(200);
    	sortedList.add(25);
    	sortedList.add(100);
    	sortedList.add(50);
    	sortedList.add(200);
    	sortedList.add(25);
    	sortedList.add(100);
    	sortedList.add(50);
    	sortedList.add(200);
    	sortedList.add(25);
    	sortedList.add(100);
    	sortedList.add(50);
    	sortedList.add(200);
    	sortedList.add(25);
    	sortedList.add(100);
    	sortedList.add(50);
    	sortedList.add(200);
    	sortedList.add(25);
    	sortedList.add(100);
    	sortedList.add(50);
    	sortedList.add(200);
    	sortedList.add(25);
    	sortedList.add(100);
    	sortedList.add(50);
    	sortedList.add(200);
    	sortedList.add(25);
    	/*for(int i = 0; i < 15; i++)
    	{
    		sortedList.add(new Random().nextInt(100) + 1);
    	}*/
    	
		GetInfo.showMessage(sortedList.toString());
    }
}
