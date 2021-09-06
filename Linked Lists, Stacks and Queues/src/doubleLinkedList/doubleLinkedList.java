package doubleLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class doubleLinkedList<Item> implements Iterable<Item> {
	private Node head;
	private Node tail;
	private int currentSize=0;
	
	public boolean isEmpty() {
		return currentSize==0;
	}
	
	public void size() {
		System.out.println("Current size is "+ currentSize);
	}
	
	
	public void addToFront(Item data) {
		Node<Item> copy=new Node<Item>();
		copy.data=data;
		copy.next=head;
		copy.previous=null;
		
		if(head==null) {
			tail=copy;
		}else head.previous=copy;
		
		head=copy;
		currentSize++;
	}
	
	public void addToRear(Item data) {
		Node<Item> copy=new Node<Item>();
		copy.data=data;
		copy.previous=tail;
		copy.next=null;
		
		if(tail==null) {head=copy;}
		else tail.next=copy;
		tail=copy;
		currentSize++;
	}
	
	public Item removeFirst() {
		if(currentSize==0) {
			throw new NoSuchElementException("Linked list is empty");
		}
		Node temp= head;
		head=head.next;
		head.previous=null;
		currentSize--;
		return (Item) temp.data;
		
	}
	
	public Item removeLast() {
		if(currentSize==0) {
			throw new NoSuchElementException("Linked list is empty");
		}
		Node temp=tail;
		tail=tail.previous;
		tail.next=null;
		currentSize--;
		return (Item) temp.data;
	}
	
	
	public Iterator<Item> iterator() {
		return new doubleLinkedListIterator();}
	
	private class doubleLinkedListIterator implements Iterator<Item> {
	    
	    private Node<Item> current=head;
	    

	    public boolean hasNext() {
	    	  return current != null;
	    	}
	    
	    	public Item next() {
	    	    if (!hasNext()) throw new NoSuchElementException();
	    	    Item item = (Item) current.data;
	    	    current = current.next;  // if next is null, hasNext will return false.
	    	    return item;
	    	}
	}
	
}

