package doubleLinkedList;

public class Main {
	public static void main(String[] args) 
    { 
	doubleLinkedList<Integer> a=new doubleLinkedList<Integer>();
	a.addToFront(4);
	a.addToFront(3); 
	a.addToRear(5);
	a.addToFront(2); 
	a.addToFront(1);
	
    for (Integer i: a) {
		System.out.print(i);
    	}
    System.out.print("\n");
	
    a.removeFirst();
    a.removeLast(); 
    
    for (Integer j: a) {
		System.out.print(j);
		}

    }
}
