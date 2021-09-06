package Queue;



public class Main {
	 public static void main(String[] args) 
	    { 
		 QueueFromLinkedList<Integer> queue = new QueueFromLinkedList<Integer>();
			

			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			
			queue.enqueue(4);
			
			System.out.println("Queue size: " + queue.size());
	    }  
}
