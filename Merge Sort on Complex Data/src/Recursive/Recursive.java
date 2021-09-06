package Recursive;

public class Recursive {
	
	 private ByCityName ByCityName;
	 
	 public static void sort(Comparable[] elements) {
	        Comparable[] aux = new Comparable[elements.length];           
	        sort(elements, aux, 0, elements.length - 1);   
	    }
	   
	   
	    private static void sort(Comparable[] elements, Comparable[] aux, int low, int high) {
	        if (high <= low) {                              
	            return;                                     
	        }
	       
	        int mid = low + (high - low) / 2;               
	        sort(elements, aux, low, mid);                  
	        sort(elements, aux, mid + 1, high);             
	        merge(elements, aux, low, mid, high);           
	    }
	   
	    private static void merge(Comparable[] elements, Comparable[] aux, int low, int mid, int high) {
	       
	        for (int k = low; k <= high; k++) {             
	            aux[k] = elements[k];                       
	        }          
	       
	        int i = low;                                    
	        int j = mid + 1;                                
	        for (int k = low; k <= high; k++) {             
	            if (i > mid) {                              
	                elements[k] = aux[j++];                 
	            } else if (j > high) {                      
	                elements[k] = aux[i++];                 
	            } else if (aux[j].compareTo(aux[i])<0) {          
	                elements[k] = aux[j++];                 
	            } else {                                    
	                elements[k] = aux[i++];                 
	            }
	        }
	    }
	    
	   
		
	    public static void sort(Comparable[] elements, ByCityName ByCityName) {
	    	Comparable[] aux = new Comparable[elements.length];           
	        sort(elements, aux, 0, elements.length - 1, ByCityName);  
	    }
		   
		   
	    private static void sort(Comparable[] elements, Comparable[] aux, int low, int high, ByCityName ByCityName) {
	        if (high <= low) {                              
	            return;                                     
	        }
	       
	        int mid = low + (high - low) / 2;               
	        sort(elements, aux, low, mid, ByCityName);                  
	        sort(elements, aux, mid + 1, high, ByCityName);             
	        merge(elements, aux, low, mid, high, ByCityName);           
	    }
		   
	    private static void merge(Comparable[] elements, Comparable[] aux, int low, int mid, int high, ByCityName ByCityName) {
	        
	        for (int k = low; k <= high; k++) {             
	            aux[k] = elements[k];                      
	        }          
	       
	        int i = low;                                    
	        int j = mid + 1;                              
	        for (int k = low; k <= high; k++) {            
	            if (i > mid) {                              
	                elements[k] = aux[j++];                 
	            } else if (j > high) {                      
	                elements[k] = aux[i++];                 
	            } else if (ByCityName.compare((IPAddress) aux[j], (IPAddress) aux[i]) < 0) {      
	                elements[k] = aux[j++];                 
	            } else {                                    
	            	elements[k] = aux[i++];                 
	            }
	        }
	    }
}
