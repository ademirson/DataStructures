package QuickSort;

import java.util.Random;

public class QuickSort {
	
	public static void sort(Comparable[] elements) {
		shuffle(elements);
		sort(elements, 0, elements.length - 1);}
	
	private static void shuffle(Comparable[] elements) {
	    Random rand = new Random();                             // 1
	    for (int i = 0; i < elements.length; i++) {             // 2
	        int r = i + rand.nextInt(elements.length - i);      // 2
	        swap(elements, i, r);                               // 3
	    }
	}
	
	private static void sort(Comparable[] elements, int low, int high) {
	    if (high <= low) {                              
	        return;                                     
	    }
	    int j = partition(elements, low, high);         
	    sort(elements, low, j - 1);                     
	    sort(elements, j + 1, high);                    
	}
	
	private static int partition(Comparable[] elements, int low, int high) {
	    int i = low;                                            
	    int j = high + 1;                                       
	    while (true) {                                          
	        while (elements[++i].compareTo(elements[low])<0) {        
	            if (i == high) {                                
	                break;                                      
	            }
	        }
	        while (elements[low].compareTo(elements[--j])<0) {        
	            if (j == low) {                                 	                break;                                      
	            }
	        }
	        if (i >= j) {                                       
	            break;                                          
	        }
	        swap(elements, i, j);                               
	    }
	    swap(elements, low, j);                                 
	    return j;                                               
	}
	
	public static void swap(Comparable[] elements, int a, int b) {
		Comparable temp=elements[a];
		elements[a]=elements[b];
		elements[b]=temp;
	}
}
