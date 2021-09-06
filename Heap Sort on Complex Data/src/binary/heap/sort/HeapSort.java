package binary.heap.sort;

public class HeapSort {
	public static void sort(IPAddress [] ipAddress) {
		BinaryHeap<IPAddress> heap = new BinaryHeap<IPAddress>();	
		
		for (int i = 0; i < ipAddress.length; i++) {			
			heap.insert(ipAddress[i]);							
		}
		
		for (int i = ipAddress.length - 1; i >= 0; i--) {	
			ipAddress[i] = heap.delMax();						
		}
	}
}
