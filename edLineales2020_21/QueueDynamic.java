package edLineales2020_21;

/**
 * Esta clase crea y modifica colas dinámicas
 */
public abstract class QueueDynamic <T> implements Queue <T> {
    private int N;	//Tamaño de la cola
    private Node <T> front, rear;	//Creación de los Nodos front y rear

    /**
     * Constructor de colas dinámicas
     * @param N La variable N almacena el tamaño de la cola (Se inicializa a 0)
     * @param front Nodo front que contiene el primer elemento añadido y apunta al siguiente nodo
     * @param rear Nodo rear que contiene el último nodo añadido y por tanto no apunta a ningún nodo
     */
    public QueueDynamic() {
        N = 0;
        front = new Node <T>();
        rear = new Node <T>();
    }//Cierre del constructor

    /**
     * Método que introduce un elemento en la cola
     * @param aux Nodo auxiliar que crearemos con el elemento deseado
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
     * Método que devuelve el elemento front de la cola y lo elimina
     * En caso de que la cola está vacía, muestra un error y devuelve un elemento vacío
     * @param element Elemento top de la pila
     * @return Elemento top de la pila
     */
    public T dequeue() {
    	T element = null;
    	if (isEmpty()) {
            System.out.println ("La pila está vacía");
    		return element;
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
     * Método que devuelve el elemento front de la cola sin eliminarlo
     * En caso de que la cola está vacía, muestra un error y devuelve el elemento vacío
     * @throws EmptyQueueException se lanza en caso de que la cola esté vacía
     * @return Elemento top de la pila
     */
    public T front() throws EmptyQueueException {
        T element = null;
        try {
 		   element = (T) front.getElement();
 	   } catch (EmptyQueueException e) {
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
     * @return <ul>
     *          <li>true: La cola está vacia</li>
     *          <li>false: La cola contiene algún valor</li>
     *          </ul>
     */
    public boolean isEmpty() {
        return N==0;
    }//Cierre del método

    /**
     * Método que imprime todos los valores de la cola o indica que está vacía
     * @param values Parametro en el que se almacenarán los valores 
     * @param aux Nodo auxiliar para sacar uno a uno cada valor de la cola
     * @return Valores de la pila
     */
    public String toString() {
        String values = "";
        Node <T> aux = front;
        if(isEmpty()) {
            return "La cola está vacía";
        }else {
            while(aux!=null) {
                values+=aux;
                aux = aux.getNext();
            }
        }
        return values;
    }//Cierre del método


}//Cierre de la clase
