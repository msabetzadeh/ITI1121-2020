public class LinkedStack<T> implements Stack<T> {

    private static class Elem<E> {
        private E value;
        private Elem<E> next;
        private Elem(E value, Elem<E> next) {
            this.value = value;
            this.next = next;
		} 
	}
	
    private Elem<T> top; // Instance variable

    public LinkedStack() { 
        this.top = null; 
    }

    public T push (T value) {
        // create a new element and make this new element's "next" point to the current top
        Elem<T> temp = new Elem<T>(value, top); 
        
        // update top
        top = temp;
        
        return value;
    }

    public boolean isEmpty() {
    	return top == null;
    }
    
    public T peek() {
        if (!isEmpty()) { 
            return top.value; 
        }
        
        return null;
    }
    
    public T pop() {
    	T value = null;
    	
        if (!isEmpty()) {
            value = top.value; 
            
        	// update the top to point to the next element 
        	top = top.next; 
        }
        
        return value;  
    }
    
    public String toString() {
    	String res = "[";
  		if ( top != null ) {
        	Elem<T> p = top;
        	res = res + p.value;
        	p = p.next;
        	while ( p != null ) {
            	res = res + "," + p.value;
				p = p.next; 
			}
		}
		res = res + "]";

		return res;
	}
}