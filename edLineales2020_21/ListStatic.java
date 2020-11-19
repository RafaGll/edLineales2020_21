package edLineales2020_21;

import java.util.Arrays;

/**
 * Esta clase crea y modifica una lista est�tica
 *
 * @author
 */
public abstract class ListStatic <T> implements  List <T>{
    private int N;	//Tama�o de la lista
    private T L [];	//Creaci�n de lista est�tica

    /**
     * M�todo que crea una lista est�tica
     * @param N Tama�o de la lista
     * @param L Lista
     */
    public ListStatic () {
        N = 1;
        L = (T[]) new Object[10];
    }//Cierre del m�todo

    /**
     * M�todo que a�ade un elemento a la lista
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
    }//Cierre del m�todo

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
     * M�todo que devuelve el elemento de la lista de una posici�n dada
     * @param index Posici�n
     * @return Elemento almacenado en la posici�n index
     */
    public T get(int index) throws IndexListException{
        T element=null;
        if (isEmpty()) {
        	System.out.println ("La lista est� vac�a");
        }else {
        	try {
        		element = L[index];
        	}catch(IndexListException e) {
        		System.out.println ("Valor de �ndice fuera de rango");
        	}
        }
        return element;
    }//Cierre del m�todo

    /**
     * M�todo que comprueba si una lista est� vac�a
     * @return Toma el valor booleano False si la pila contiene alg�n valor y True si est� vac�a
     */
    public boolean isEmpty() {
        boolean isEmpty = (N < 0);
        return isEmpty;
    }//Cierre del m�todo

    /**
     * M�todo que devuelve el tama�o de la lista
     * @return Tama�o de la lista
     */
    public int Size () {
        return N;
    }//Cierre del m�todo

    /**
     * M�todo que introduce un elemento en la posici�n anterior a index
     * @param element Elemento a introducir
     * @param index Posici�n del elemento
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
        		System.out.println ("Valor de �ndice fuera de rango");
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
        	System.out.println ("La lista est� vac�a");
        }else{
        	try {
        		for (int j = index; j < N-1; j++) {
        			L[j] = L[j+1];
        		}
        	}catch(IndexListException e){
        		System.out.println ("Valor de �ndice fuera de rango");
        	}
        	N--;
        }
    }//Cierre del m�todo

    /**
     * M�todo que devuelve la posici�n de un elemento dado
     * @param index
     * @return Posici�n del elemento
     */
    public int locate (T element){
        int pos = -1;
        if(isEmpty()) {
        	System.out.println ("La lista est� vac�a");
        }else{
        	for(int j = 0; (j <= N) && (pos == -1); j++) {
        		if ( L [j] == element)
        			pos = j;
        	}
        }
        return pos;
    }//Cierre del m�todo

}//Cierre de la clase
