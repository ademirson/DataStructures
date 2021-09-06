package shellSort;

public class ShellSort {
	public static void sort(Comparable[] elements) {
	    int h = 1;                                                      
	    while (h < elements.length / 3) {                               
	        h = 3 * h + 1;                                              
	    }
	       
	    while (h >= 1) {                                                
	        for (int i = h; i < elements.length; i++) {                
	            for (int j = i; j >= h; j -= h) {                       
	                if (elements[j].compareTo(elements[j - h])==-1) {           
	                    swap(elements, j, j - h);                       
	                } else {
	                    break;                                          
	                }
	            }
	        }
	        h = h / 3;                                                  
	    }
	}
	public static void swap(Comparable[] elements, int a, int b) {
		Comparable temp=elements[a];
		elements[a]=elements[b];
		elements[b]=temp;
	}
	
}


