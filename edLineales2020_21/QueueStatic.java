package edLineales2020_21;

import java.util.*;

/**
 * Esta clase crea y modifica colas estáticas
 */
public abstract class QueueStatic <T> implements Queue <T>{
    private int rear, front, N; //Posición del valor rear y front en la cola, tamaño de la cola
    private T Q[];	//Creación de cola estática

    /**
     * Constructor de colas estáticas con un tamaño estandarizado de 10
     * @param N La variable N almacena el tamaño de la cola (Se inicializa a 0)
     * @param front La posición front (primer valor/cabeza) se iniciará en 0
     * @param rear La posición rear (último valor/cola/final) se iniciará en 0
     * @param Q Cola estática
     */
    public QueueStatic () {
        N = 0;
        front = 0;
        rear = 0;
        Q = (T[]) new Object[10];
    }//Cierre del constructor

    /**
     * Método que introduce un elemento en la cola
     * En caso de que la cola esté llena se redimensionará la cola añadiendo el elemento
     * @param element Valor a introducir en la cola
     * @throws FullQueueException se lanza en caso de que la cola esté llena
     */
    public void enqueue (Object e) throws FullQueueException {
        T element = (T) e;
        try{
        	Q [rear++] = element;
        	N++;
        } catch (FullQueueException j) {
        	Q = Arrays.copyOf(Q, (N+1));
			Q [rear++] = element;
			N++;
        }
    }//Cierre del método

    /**
     * Método que devuelve el elemento front de la cola y lo elimina de la misma
     * En caso de que la cola está vacía, muestra un error y devuelve el elemento vacío
     * @param element Elemento front de la cola
     * @throws EmptyQueueException se lanza en caso de que la cola esté vacía
     * @return Elemento front de la cola
     */
    public T dequeue () throws EmptyQueueException {
    	T element = null;
    	try {
    	element = Q [front++];
        	N--;
    	} catch (EmptyQueueException e) {
    		System.out.println ("La cola está vacía");
    	}
        return element;
    }//Cierre del método


    /**
     * Método que devuelve el valor front de la cola
     * En caso de que la cola está vacía, muestra un error
     * @throws EmptyQueueException se lanza en caso de que la cola esté vacía
     * @return Elemento front de la cola
     */
    public T front () throws EmptyQueueException {
    	T element = null;
    	try {
    		element = Q [front];
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
     * Método que comprueba si una cola está vacía y nos devuelve el valor boolean correspondiente
     * @return <ul>
     *          <li>true: La cola está vacia</li>
     *          <li>false: La cola contiene algún elemento</li>
     *          </ul>
     */
    public boolean isEmpty() {
        return N == 0;
    }//Cierre del método

    /**
     * Método que imprime todos los elementos de la cola o indica que está vacía
     * @param values Parametro en el que se almacenarán los elementos 
     * @param aux Valor auxiliar para sacar uno a uno cada elemento de la cola
     * @return Elementos de la pila
     */
    public String toString() {
        String values = "";
        int aux = front;
        if(isEmpty()) {
            return "La cola está vacía";
        }else {
            while(aux <= rear) {
                values+=Q[aux++];
            }
        }
        return values;
    }//Cierre del método
}//Cierre de la clase
