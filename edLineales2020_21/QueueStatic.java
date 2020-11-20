package edLineales2020_21;

import java.util.*;

/**
 * Esta clase sirve para crear colas estáticas. También nos permite modificarlas
 * y obtener valores de ellas.
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 6/11/2020
 * @version 1.0
 */
public abstract class QueueStatic <T> implements Queue <T>{
    private int rear, front, N; //Posición del valor rear y front en la cola, elementos de la cola
    private T Q[];

    /**
     * Constructor de colas estáticas con un tamaño estandarizado de 10
     */
    public QueueStatic () {
        N = 0; // Variable encargada de guardar el número de elementos almacenados en la cola (Se inicializa a 0)
        front = 0; // La posición front (primer valor/cabeza) se iniciará en 0
        rear = 0; // La posición rear (último valor/cola/final) se iniciará en 0
        Q = (T[]) new Object[10]; // Creación de la cola estática
    }//Cierre del constructor

    /**
     * Método que introduce un elemento en la cola.
     * En el caso de que la cola esté llena se redimensionará la cola añadiendo el elemento
     * @param e Valor a introducir en la cola
     * @throws FullQueueException Se lanza en caso de que la cola esté llena
     */
    public void enqueue (Object e) throws FullQueueException {
        T element = (T) e;
        try{
        	Q [rear++] = element;
        	N++;
        } catch (FullQueueException j) {
        	Q = Arrays.copyOf(Q, (N+1)); // Redimensión de la cola
			Q [rear++] = element;
			N++;
        }
    }//Cierre del método

    /**
     * Método que devuelve el elemento front de la cola y lo elimina de la misma.
     * En caso de que la cola esté vacía, muestra un error y devuelve el elemento vacío
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
     * Método que devuelve el valor front de la cola.
     * En el caso de que la cola está vacía, muestra un error
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
     * @return Elementos de la cola
     */
    public String toString() {
        String values = ""; // En este String se almacenarán todos los elementos a imprimir
        int aux = front; // Variable auxiliar que nos permite recorrer la cola
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
