package Queue;



public class QueueFromLinkedList<Item> {
	private Node<Item> head = null; 
	private Node<Item> tail = null;
	private int currentSize=0;
	
	public boolean isEmpty()
	 {
	 return (currentSize == 0);
	 }
	
	public int size() {
		return currentSize;
	}
	
	public void enqueue(Item data)
	 {
	 Node<Item> oldTail = tail;
	 tail = new Node<Item>();
	 tail.data = data;
	 tail.next = null;
	 if (isEmpty()) 
	 {
	 head = tail;
	 }
	 else 
	 {
	 oldTail.next = tail;
	 }
	 currentSize++;
	 }

	 @SuppressWarnings("unchecked")
	public Item dequeue()
	 {
	 Item data = head.data;
	 head = head.next;
	 if (isEmpty()) 
	 {
	 tail = null;
	 }
	 currentSize--;
	 return data;
	 }
}
