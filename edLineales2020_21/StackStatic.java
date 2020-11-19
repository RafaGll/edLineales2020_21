package edLineales2020_21;

import java.util.*;

/**
 * Esta clase crea una pila estática
 */
public abstract class StackStatic<T> implements Stack<T> {
    private int N;	// tamaño de la pila
    private T S[];	// creación de pila estática

    /**
     * Constructor de pilas estáticas con un tamaño estandarizado de 10
     * @param N La variable N almacena el tamaño de la pila (Se inicializa a 0)
     * @param S Pila estática
     */
    public StackStatic () {
        N = 0;
        S = (T[]) new Object[10];
    }//Cierre del constructor

    /**
     * Método que introduce un valor en la pila
     * En caso de que la pila está llena la redimensiona e introduce el valor deseado
     * @param element Elemento a introducir en la pila
     * @throws FullStackException se lanza en caso de que la pila esté llena
     */
    public void push(T element) throws FullStackException{
        try{
        	S [N] = element;
        	N++;
        } catch (FullStackException e) {
        	S = Arrays.copyOf(S, (N+1));
			S [N] = element;
			N++;
        }
    }//Cierre del método

    /**
     * Método que devuelve el valor top de la pila y lo elimina
     * En caso de que la pila está vacía, muestra un error y devuelve element vacío
     * @param element Elemento top de la pila a devolver
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
     * Método que devuelve el valor top de la pila sin eliminarlo de la misma
     * En caso de que la pila esté vacía, muestra un error y devuelve element vacío
     * @param element Elemento top de la pila a devolver
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
     * Método que imprime todos los valores de la pila o indica que está vacía
     * @param values Parametro en el que se almacenarán los valores 
     * @param aux Valor auxiliar para sacar uno a uno cada valor de la pila
     * @return Valores de la pila
     */
    public String toString() {
        String values = "";
        int aux = 0;
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
