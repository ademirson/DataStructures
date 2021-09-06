package insertionSort;


public class InsertionSort 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sort(Comparable[] elements) {
	    for (int i = 0; i < elements.length; i++) {           
	        for (int j = i; j > 0; j--) {                      
	            if (elements[j].compareTo(elements[j - 1])==-1) {      
	                swap(elements, j, j - 1);                   
	            } else {
	                break;                                      
	            }
	        }
	    }
	}


	
	public static void swap(Comparable[] elements, int a, int b) {
		Comparable temp=elements[a];
		elements[a]=elements[b];
		elements[b]=temp;
	}
}
