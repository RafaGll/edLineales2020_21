package edLineales2020_21;

import java.util.*;

/**
 * Esta clase sirve para crear pilas estáticas. También nos permite modificarlas
 * y obtener valores de ellas.
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 30/10/2020
 * @version 1.0
 */
public abstract class StackStatic<T> implements Stack<T> {
    private int N;	// Elementos de la pila
    private T S[];	// creación de pila estática

    /**
     * Constructor de pilas estáticas con un tamaño estandarizado de 10
     */
    public StackStatic () {
        N = 0; // Variable encargada de guardar el número de elementos almacenados en la pila (Se inicializa a 0)
        S = (T[]) new Object[10]; // Creación de la pila
    }//Cierre del constructor
    
    /**
     * Método que introduce un elemento en la pila.
     * En el caso de que la pila esté llena la redimensiona e introduce el elemento deseado
     * @param element Elemento a introducir en la pila
     * @throws FullStackException se lanza en caso de que la pila esté llena
     */
    public void push(T element) throws FullStackException{
        try{
        	S [N] = element; // Se introduce el elemento en la posición correspondiente
        	N++;
        } catch (FullStackException e) {
        	S = Arrays.copyOf(S, (N+1)); // Redimensión del array
			S [N] = element;
			N++;
        }
    }//Cierre del método

    /**
     * Método que devuelve el elemento top de la pila y lo elimina.
     * En el caso de que la pila esté vacía, muestra un error y devuelve element vacío
     * @throws EmptyStackException se lanza en caso de que la pila esté vacía
     * @return Elemento top de la pila
     */
    public T pop () throws EmptyStackException {
		T element = null;
    	try {
    		N--;
    		element = S [N];
    	}catch(EmptyStackException e) {
    		System.out.println ("La pila está vacía");
    	}
		return element;
    }//Cierre del método

    /**
     * Método que devuelve el elemento top de la pila sin eliminarlo de la misma.
     * En el caso de que la pila esté vacía, muestra un error y devuelve element vacío
     * @throws EmptyStackException se lanza en caso de que la pila esté vacía
     * @return Elemento top de la pila
     */
    public T top () throws EmptyStackException {
    	T element = null;
    	try {
    		element = S [N - 1];
    	}catch (EmptyStackException e){
    		System.out.println ("La pila está vacía");
    	}
        return element;
    }//Cierre del método


    /**
     * Método que devuelve el tamaño de la pila
     * @return Tamaño de la pila
     */
    public int Size () {
        return N;
    }//Cierre del método

    /**
     * Método que comprueba si una pila está vacía y devuelve el valor booleano correspondiente
     * @return <ul>
     *          <li>true: La pila está vacia</li>
     *          <li>false: La pila contiene algún valor</li>
     *          </ul>
     */
    public boolean isEmpty () {
        boolean isEmpty = (N-1) < 0;
        return isEmpty;
    }//Cierre del método

    /**
     * Método que imprime todos los elementos de la pila o en su defecto indica que está vacía
     * @return Elementos de la pila
     */
    public String toString() {
        String values = ""; // En este String se almacenarán todos los elementos a imprimir
        int aux = 0; // Variable auxiliar que nos permite recorrer la pila
        if(isEmpty()) {
            return "La pila está vacía";
        }else {
            while(aux <= N) {
                values+=S[aux++];
            }
        }
        return values;
    }//Cierre del método
}//Cierre de la clase
