public class LinkedStack<T> implements Stack<T> {

	/* Note: Here, we are using an inner class (as opposed to a static nested class). 
	   Doing so somewhat simplifies the definition of Elem but it intoduces other
	   dimensions that we have not yet discussed in class. Furthermore, we do not 
	   need the extra functionality provided by inner classes for implemnting
	   LinkedStack. 
	*/ 
    private class Elem {
        private T value;
        private Elem next;
        private Elem(T value, Elem next) {
            this.value = value;
            this.next = next;
		} 
	}
	
    private Elem top; // Instance variable

    public LinkedStack() { 
        this.top = null; 
    }

    public T push (T value) {
        // create a new element and make this new element's "next" point to the current top
        Elem temp = new Elem(value, top); 
        
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
        	Elem p = top;
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