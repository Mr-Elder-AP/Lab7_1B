/**
 * @(#)SortedIntList.java
 *
 *
 * @author 
 * @version 1.00 2014/12/5
 */


public class SortedIntList extends IntList{

		public SortedIntList(int size){
			super(size);
		}
    
    	public void addAtIndex(int index, int val) {	
			int temp[] = new int[list.length];
	
			for (int i = 0; i < list.length; i++) {
				temp[i] = list[i];
			}
	
			list = new int[list.length];
	
			int listIndex = 0;
			int tempIndex = 0;
			while (listIndex < list.length) {
				if (listIndex != index) {
					list[listIndex] = temp[tempIndex];
					listIndex++;
					tempIndex++;
				} else {
					list[listIndex] = val;
					listIndex++;
				}
			}
	}
    
    	public void add(int val){
    		
    		if(arrayFull())
    		{
    			GetInfo.showMessage("Cant add number " + val + ", array is full");
    		}else
    		{
    		
	    	for (int i = 0; i < list.length; i++) 
			{
				if (val == list[i] || list[i] == 0) 
				{
					System.out.println("Adding " + val + " at : " + i);
					addAtIndex(i, val);
					i = list.length;
				} else if (i == 0 && val < list[0]) 
				{
					System.out.println("Adding at : " + i);
					addAtIndex(0, val);
					i = list.length;
				} else if (i == list.length - 1 && val > list[list.length - 1]) 
				{
					System.out.println("Adding at last: " + i);
					addAtIndex(list.length, val);
					i = list.length;
				} else if (i > 0 && i < list.length - 1) 
				{
					if (val > list[i] && (val < list[i + 1] || list[i + 1] == 0)) 
					{
						System.out.println("Adding " + val + " after : " + i);
						addAtIndex(i + 1, val);
						i = list.length;
					}
				}
			}
    		}
    	}
    
    	public String toString(){
    		String builder = "";
    		for(int i = 0; i < list.length; i++){
    			if(list[i] != 0)
    				builder += i + ": " + list[i] + "\n";
    		}
    	
    		return builder;
    	}
    	
    	public boolean arrayFull(){
    		
    		for(int i = 0; i < list.length; i++)
    		{
    			if(list[i] == 0)
    				return false;
    		}
    		
    		return true;
    	}
    
}