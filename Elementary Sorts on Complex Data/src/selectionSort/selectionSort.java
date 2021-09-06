package selectionSort;

public class selectionSort {
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] elements) {
		
	    for (int i = 0; i < elements.length; i++) {             
	        int min = i;                                        
	        for (int j = i + 1; j < elements.length; j++) {    
	            if (elements[j].compareTo( elements[min])==-1) {        
	                min = j;                                    
	            }
	        }
	        swap(elements, i, min);                           
	        }
	}
	
	public static void swap(Comparable[] elements, int a, int b) {
		Comparable temp=elements[a];
		elements[a]=elements[b];
		elements[b]=temp;
	}
}


