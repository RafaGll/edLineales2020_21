package edLineales2020_21;

public abstract class ListDynamic <T> implements List <T>{
    private int N;
    private Node <T> tail, head;

    
    public ListDynamic() {
        N = 0;
        head = null;
        tail = null;
    }

    
    public void add(T element) {
        Node <T> aux = new Node<T>(element,null);
        tail.setNext(aux);
        tail = aux;
        if(head == null) {
            head = aux;
        }
        N++;
    }
    
    
    public boolean isEmpty() {
        return N == 0;
    }


    public int Size () {
        return N;
    }//Cierre del método
    
    
    public boolean exists(T element) {
    	boolean match = false;
    	Node <T> aux = new Node<T>(element,null);
    	if(!isEmpty()) {
    		aux = head;
    		while (aux != null && !match) {
    			match = (element == aux.getElement());
    			aux = aux.getNext();
    		}
    	}
    	return match;
    }
    
    
    public T get(int index) {
    	
    	if (isEmpty())
    		System.out.println ("La lista está vacía");
    		
    	else {
    		try {
    			Node <T> aux = new Node<T>();
    			aux = head;
    			if (index > 0) {
    				for (int j = 0; j < index; j++) {
    					aux=aux.getNext();
    				}
    			}
    			return aux.getElement();
    		} catch(IndexListException e) {
    			System.out.println ("Valor de índice fuera de rango");
    		}
    	}
    	return null;
    }
    
    
    public void put(T element, int index) {
    	try {
			if(index == 0) {
				Node <T> aux2 = new Node<T>(element, head);
				head = aux2;
			}else {
				Node <T> aux = new Node<T>();
				aux = head;
				Node <T> prev = new Node<T>();
				for (int j = 0; j < index; j++) {
					prev = aux;
					aux = aux.getNext();
				}
				Node <T> aux2 = new Node<T>(element, aux);
				prev.setNext(aux2);
			}
			N++;
		} catch(IndexListException e) {
			System.out.println ("Valor de índice fuera de rango");
		}
    }
    
    
    public void remove(int index) {
    	if (isEmpty()) {
    		System.out.println ("La lista está vacía");
    	}else {
    		try {
    			if (index == 0) {
    				head = head.getNext();
    				if (head == null) {
    					tail = null;
    				}
    			}else {
    				Node <T> aux = new Node<T>();
    				Node <T> prev = new Node<T>();
    				aux = head;
    				for (int j = 0; j < index ; j++) {
    					prev = aux;
    					aux = aux.getNext();
    				}
    				prev.setNext(aux);
    				if (tail == aux) {
    					tail = prev;
    					aux = null;
    				}
    			}
    			N--;
    		} catch(IndexListException e) {
    			System.out.println ("Valor de índice fuera de rango");
    		}
    	}
    }
    
    
    public int locate(T elemLoc) {
    	int index = -1;
    	if (isEmpty()) {
    		System.out.println ("La lista está vacía");
    	}else {
    		Node <T> aux = new Node<T>();
    		aux = head;
    		T element = null;
    		for (int j = 0; j < N && index == -1; j++) {
    			element = aux.getElement();
    			if (element == elemLoc) {
    				index = j;
    			}
    			aux = aux.getNext();
    		}
    	}
    	return index;
    }
}