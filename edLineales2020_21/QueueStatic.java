package edLineales2020_21;

import java.util.*;

/**
 * Esta clase crea y modifica una cola estática
 */
public abstract class QueueStatic <T> implements Queue <T>{
    private int rear, front, N; //Posición del valor rear y front en la cola, tamaño de la cola
    private T Q[];	//Creación de cola estática

    /**
     * Método que crea una cola estática con un tamaño estandarizado de 10
     * @param N El tamaño de la pila se inicia en 0
     * @param front La posición front se iniciará en 0
     * @param rear La posición rear se iniciará en 0
     * @param Q Cola
     */
    public QueueStatic () {
        N = 0;
        front = 0;
        rear = 0;
        Q = (T[]) new Object[10];
    }//Cierre del método

    /**
     * Método que introduce un valor en la cola
     * En caso de que la cola está llena, muestra un error
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
     * Método que saca el valor front de la cola
     * En caso de que la cola está vacía, muestra un error
     * @param element Elemento front de la cola
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
     * Método que comprueba si una pila está vacía
     * @return Toma el valor booleano False si la pila contiene algún valor y True si está vacía
     */
    public boolean isEmpty() {
        return N == 0;
    }//Cierre del método

    /**
     *
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
