package edLineales2020_21;

/**
 * Esta clase crea una cola estática
 */
public abstract class QueueDynamic <T> implements Queue <T> {
    private int N;	//Tamaño de la cola
    private Node <T> front, rear;	//Creación de los Nodos front y rear

    /**
     * Método que crea una cola dinámica
     * @param N Tamaño de la cola
     * @param front Nodo front
     * @param rear Nodo rear
     */
    public QueueDynamic() {
        N = 0;
        front = new Node <T>();
        rear = new Node <T>();
    }//Cierre del método

    /**
     * Método que introduce un valor en la cola
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
    }//Cierre del método

    /**
     * Método que elimina y devuelve el valor front de la cola
     * En caso de que la cola está vacía, muestra un error
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
    }//Cierre del método

    /**
     * Método que devuelve el valor front de la cola
     * En caso de que la cola está vacía, muestra un error
     * @return Elemento top de la pila
     */
    public T front() {
        T element = null;
        try {
 		   element = (T) front.getElement();
 	   } catch (EmptyStackException e) {
 		   System.out.println ("La cola está vacía");
 	   }
        return element;
    }//Cierre del método

    /**
     * Método que devuelve el tamaño de la cola
     * @return Tamaño de la cola
     */
    public int Size () {
        return N;
    }//Cierre del método

    /**
     * Método que comprueba si una cola está vacía
     * @return Toma el valor booleano False si la cola contiene algún valor y True si está vacía
     */
    public boolean isEmpty() {
        return N==0;
    }//Cierre del método

    /**
     *
     */
    public String toString() {
        String values = "";
        Node <T> Nodoaux = front;
        if(isEmpty()) {
            return "La cola está vacía";
        }else {
            while(Nodoaux!=null) {
                values+=Nodoaux;
                Nodoaux = Nodoaux.getNext();
            }
        }
        return values;
    }//Cierre del método


}//Cierre de la clase
