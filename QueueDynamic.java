package edLineales2020_21;

/**
 * Esta clase crea una cola est�tica
 */
public abstract class QueueDynamic <T> implements Queue <T> {
    private int N;	//Tama�o de la cola
    private Node <T> front, rear;	//Creaci�n de los Nodos front y rear

    /**
     * M�todo que crea una cola din�mica
     * @param N Tama�o de la cola
     * @param front Nodo front
     * @param rear Nodo rear
     */
    public QueueDynamic() {
        N = 0;
        front = new Node <T>();
        rear = new Node <T>();
    }//Cierre del m�todo

    /**
     * M�todo que introduce un valor en la cola
     */
    public void enqueue(T element) {
        Node <T> aux = new Node<T> (element, null);

        if (isEmpty()) {
        	front = aux;
        } else {
        	rear.setNext(aux);
        }
        rear=aux;
        N++;
    }//Cierre del m�todo

    /**
     * M�todo que elimina y devuelve el valor front de la cola
     * En caso de que la cola est� vac�a, muestra un error
     * @param element Elemento top de la pila
     * @return Elemento top de la pila
     */
    public T dequeue() {
    	T element = null;
    	if (isEmpty()) {
    		return null;
    	}else {
    		element = (T) front.getElement();
    		front = front.getNext();
    		N--;
    		if(N == 0)
    			rear = null;
    		return element;
    	}
    }//Cierre del m�todo

    /**
     * M�todo que devuelve el valor front de la cola
     * En caso de que la cola est� vac�a, muestra un error
     * @return Elemento top de la pila
     */
    public T front() {
        T element = null;
        try {
 		   element = (T) front.getElement();
 	   } catch (EmptyStackException e) {
 		   System.out.println ("La cola est� vac�a");
 	   }
        return element;
    }//Cierre del m�todo

    /**
     * M�todo que devuelve el tama�o de la cola
     * @return Tama�o de la cola
     */
    public int Size () {
        return N;
    }//Cierre del m�todo

    /**
     * M�todo que comprueba si una cola est� vac�a
     * @return Toma el valor booleano False si la cola contiene alg�n valor y True si est� vac�a
     */
    public boolean isEmpty() {
        return N==0;
    }//Cierre del m�todo

    /**
     *
     */
    public String toString() {
        String values = "";
        Node <T> Nodoaux = front;
        if(isEmpty()) {
            return "La cola est� vac�a";
        }else {
            while(Nodoaux!=null) {
                values+=Nodoaux;
                Nodoaux = Nodoaux.getNext();
            }
        }
        return values;
    }//Cierre del m�todo


}//Cierre de la clase
