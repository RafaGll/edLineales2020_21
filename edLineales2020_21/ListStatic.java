package edLineales2020_21;

import java.util.Arrays;

/**
 * Esta clase crea y modifica una lista estática
 *
 * @author
 */
public abstract class ListStatic <T> implements  List <T>{
    private int N;	//Tamaño de la lista
    private T L [];	//Creación de lista estática

    /**
     * Método que crea una lista estática
     * @param N Tamaño de la lista
     * @param L Lista
     */
    public ListStatic () {
        N = 1;
        L = (T[]) new Object[10];
    }//Cierre del m�todo

    /**
     * Método que añade un elemento a la lista
     * @param element Elemento a incluir en la lista
     * @throws FullStackException
     */
    public void add (T element) throws FullStackException{
        if (L.length < N) {
        	L = Arrays.copyOf(L, (N+1));
        	L[N-1] = element;
            N++;
        }else {
            L[N-1] = element;
            N++;
        }
    }//Cierre del método

	public boolean exists(T element) {
    	boolean match = false;
    	if(!isEmpty()) {
			for (int i=0; i<=(N-1) && !match; i++){
				match=L[i]==element;
			}
    	}
    	return match;
    }

    /**
     * Método que devuelve el elemento de la lista de una posición dada
     * @param index Posición
     * @return Elemento almacenado en la posición index
     */
    public T get(int index) throws IndexListException{
        T element=null;
        if (isEmpty()) {
        	System.out.println ("La lista está vacía");
        }else {
        	try {
        		element = L[index];
        	}catch(IndexListException e) {
        		System.out.println ("Valor de índice fuera de rango");
        	}
        }
        return element;
    }//Cierre del m�todo

    /**
     * Método que comprueba si una lista está vacía
     * @return Toma el valor booleano False si la pila contiene alg�n valor y True si está vacía
     */
    public boolean isEmpty() {
        boolean isEmpty = (N < 0);
        return isEmpty;
    }//Cierre del método

    /**
     * Método que devuelve el tamaño de la lista
     * @return Tamaño de la lista
     */
    public int Size () {
        return N;
    }//Cierre del m�todo

    /**
     * Método que introduce un elemento en la posición anterior a index
     * @param element Elemento a introducir
     * @param index Posición del elemento
     */
    public void put(T element, int index) throws IndexListException{
    	try {
            for(int j = N; j >= index; j--) {
            	L[j] = L[j-1];
            }
            L [index] = element;
			N++;
        }
        catch(IndexListException e){
        	if (index < 0 || index > N) {
        		System.out.println ("Valor de índice fuera de rango");
        	}else {
        		L = Arrays.copyOf(L, (N+1));
				for(int j = N; j >= index; j--) {
				   L[j] = L[j-1];
				}
				L [index] = element;
				N++;
        	}
		}
      }
    //Cierre del método

    /**
     *
     * @param index
     * @throws IndexListException
     */
    public void remove(int index) throws IndexListException{
    	if(isEmpty()) {
        	System.out.println ("La lista está vacía");
        }else{
        	try {
        		for (int j = index; j < N-1; j++) {
        			L[j] = L[j+1];
        		}
        	}catch(IndexListException e){
        		System.out.println ("Valor de índice fuera de rango");
        	}
        	N--;
        }
    }//Cierre del método

    /**
     * Método que devuelve la posición de un elemento dado
     * @param index
     * @return Posición del elemento
     */
    public int locate (T element){
        int pos = -1;
        if(isEmpty()) {
        	System.out.println ("La lista está vacía");
        }else{
        	for(int j = 0; (j <= N) && (pos == -1); j++) {
        		if ( L [j] == element)
        			pos = j;
        	}
        }
        return pos;
    }//Cierre del método

}//Cierre de la clase
