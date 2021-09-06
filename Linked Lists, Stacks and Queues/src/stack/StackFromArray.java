package stack;

public class StackFromArray<Item>{
	@SuppressWarnings("unchecked")
	private Item[] stack=(Item[]) new Object[1];;
	private int top=0;
	
	public void push(Item item) {
		if(size()==stack.length) {
			resize(2*stack.length);
		}
			stack[top++]=item;
	}

	public Item pop() { 
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("The stack is empty.");
		}
		Item item=stack[--top];
		stack[top]=null;
		if(top>0 && size()<=stack.length/4) {
			resize (stack.length/2);
		}
		return item;
	}
	
	@SuppressWarnings("unchecked")
	private void resize(int capacity) {
		Item[] copy=(Item[]) new Object[capacity];
		for(int i=0;i<top;i++) {
			copy[i]=stack[i];
		}
		stack=copy;
	}
	
	public boolean isEmpty() {
	        return top == 0;
	    }
	
	public int size() {
		return top;
	}
	
	public void show() {
		for(Item n:stack) {
			System.out.print(n+" ");
		}
		System.out.println();
	}	
}

