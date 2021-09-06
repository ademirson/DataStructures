package binary.search;

public class BinarySearch {	
	public static int search(IPAddress[] array, long key) {
	int low = 0;									
	int high = array.length - 1;					
	
	while (low <= high) {							
		int mid = low + (high - low) / 2;			
		if (key < array[mid].ipFrom) {					
			high = mid - 1;							
		} else if (key > array[mid].ipTo) {			
			low = mid + 1;							
		} else {									
			return mid;								
		}
	}
	return -1;										
}
		
}

