package edLineales2020_21;

import java.util.*;

/**
 * Esta clase crea y modifica una cola est�tica
 */
public abstract class QueueStatic <T> implements Queue <T>{
    private int rear, front, N; //Posici�n del valor rear y front en la cola, tama�o de la cola
    private T Q[];	//Creaci�n de cola est�tica

    /**
     * M�todo que crea una cola est�tica con un tama�o estandarizado de 10
     * @param N El tama�o de la pila se inicia en 0
     * @param front La posici�n front se iniciar� en 0
     * @param rear La posici�n rear se iniciar� en 0
     * @param Q Cola
     */
    public QueueStatic () {
        N = 0;
        front = 0;
        rear = 0;
        Q = (T[]) new Object[10];
    }//Cierre del m�todo

    /**
     * M�todo que introduce un valor en la cola
     * En caso de que la cola est� llena, muestra un error
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
    }//Cierre del m�todo

    /**
     * M�todo que saca el valor front de la cola
     * En caso de que la cola est� vac�a, muestra un error
     * @param element Elemento front de la cola
     * @return Elemento front de la cola
     */
    public T dequeue () throws EmptyQueueException {
    	T element = null;
    	try {
    	element = Q [front++];
        	N--;
    	} catch (EmptyQueueException e) {
    		System.out.println ("La cola est� vac�a");
    	}
        return element;
    }//Cierre del m�todo


    /**
     * M�todo que devuelve el valor front de la cola
     * En caso de que la cola est� vac�a, muestra un error
     * @return Elemento front de la cola
     */
    public T front () throws EmptyQueueException {
    	T element = null;
    	try {
    		element = Q [front];
    	} catch (EmptyQueueException e) {
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
     * M�todo que comprueba si una pila est� vac�a
     * @return Toma el valor booleano False si la pila contiene alg�n valor y True si est� vac�a
     */
    public boolean isEmpty() {
        return N == 0;
    }//Cierre del m�todo

    /**
     *
     */
    public String toString() {
        String values = "";
        int aux = front;
        if(isEmpty()) {
            return "La cola est� vac�a";
        }else {
            while(aux <= rear) {
                values+=Q[aux++];
            }
        }
        return values;
    }//Cierre del m�todo
}//Cierre de la clase
