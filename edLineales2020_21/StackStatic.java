package edLineales2020_21;

import java.util.*;

/**
 * Esta clase crea una pila estática
 */
public abstract class StackStatic<T> implements Stack<T> {
    private int N;	// tamaño de la pila
    private T S[];	// creación de pila estática

    /**
     * Método que crea una pila estática con un tamaño estandarizado de 10
     * @param N Tamaño de la pila
     * @param S Pila
     */
    public StackStatic () {
        N = 0;
        S = (T[]) new Object[10];
    }//Cierre del método

    /**
     * M�todo que introduce un valor en la pila
     * En caso de que la pila est� llena, muestra un error y la redimensiona
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
     * Método que elimina y devuelve el valor top de la pila
     * En caso de que la pila está vacía, muestra un error
     * @param element Elemento top de la pila
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
     * Método que devuelve el valor top de la pila
     * En caso de que la pila esté vacía, muestra un error
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
     * método que comprueba si una pila está vacía
     * @return Toma el valor booleano False si la pila contiene algún valor y True si está vacía
     */
    public boolean isEmpty () {
        boolean isEmpty = (N-1) < 0;
        return isEmpty;
    }//Cierre del método

    /**
     *
     */
    public String toString() {
        String values = "";
        int aux = 0;
        if(isEmpty()) {
            return "La cola está vacía";
        }else {
            while(aux <= N) {
                values+=S[aux++];
            }
        }
        return values;
    }//Cierre del método
}//Cierre de la clase
