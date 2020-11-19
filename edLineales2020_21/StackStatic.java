package edLineales2020_21;

import java.util.*;

/**
 * Esta clase crea una pila est�tica
 */
public abstract class StackStatic<T> implements Stack<T> {
    private int N;	// tama�o de la pila
    private T S[];	// creaci�n de pila est�tica

    /**
     * M�todo que crea una pila est�tica con un tama�o estandarizado de 10
     * @param N Tama�o de la pila
     * @param S Pila
     */
    public StackStatic () {
        N = 0;
        S = (T[]) new Object[10];
    }//Cierre del m�todo

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
    }//Cierre del m�todo

    /**
     * M�todo que elimina y devuelve el valor top de la pila
     * En caso de que la pila est� vac�a, muestra un error
     * @param element Elemento top de la pila
     * @return Elemento top de la pila
     */
    public T pop () throws EmptyStackException {
		T element = null;
    	try {
    		N--;
    		element = S [N];
    	}catch(EmptyStackException e) {
    		System.out.println ("La pila est� vac�a");
    	}
		return element;
    }//Cierre del m�todo

    /**
     * M�todo que devuelve el valor top de la pila
     * En caso de que la pila est� vac�a, muestra un error
     * @return Elemento top de la pila
     */
    public T top () throws EmptyStackException {
    	T element = null;
    	try {
    		element = S [N - 1];
    	}catch (EmptyStackException e){
    		System.out.println ("La pila est� vac�a");
    	}
        return element;
    }//Cierre del m�todo


    /**
     * M�todo que devuelve el tama�o de la pila
     * @return Tama�o de la pila
     */
    public int Size () {
        return N;
    }//Cierre del m�todo

    /**
     * M�todo que comprueba si una pila est� vac�a
     * @return Toma el valor booleano False si la pila contiene alg�n valor y True si est� vac�a
     */
    public boolean isEmpty () {
        boolean isEmpty = (N-1) < 0;
        return isEmpty;
    }//Cierre del m�todo
}//Cierre de la clase
