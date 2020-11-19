package edLineales2020_21;

import java.util.Arrays;

/**
 * Esta clase crea y modifica listas estáticas
 */
public abstract class ListStatic <T> implements  List <T>{
    private int N;	//Tamaño de la lista
    private T L [];	//Creación de lista estática

   /**
     * Constructor de listas estáticas con un tamaño estandarizado de 10
     * @param N La variable N almacena el tamaño de la cola (Se inicializa a 1)
     * @param L Lista estática
     */
    public ListStatic () {
        N = 1;
        L = (T[]) new Object[10];
    }//Cierre del constructor

    /**
     * Método que añade un elemento a la lista
     * En el caso de que la lista esté llena, se redimensionará añadiendo el elemento
     * @param element Elemento a incluir en la lista
     * @throws FullListException se lanza en caso de que la lista esté llena
     */
	 public void add (T element) throws FullListException{
    	try {
    		L[N-1] = element;
    		N++
    	}catch(FullListException e){
    		L = Arrays.copyOf(L, (N+1));
        	L[N-1] = element;
            N++;
    	}
    }//Cierre del método
	
	/**
	* Método que comprueba si un elemento introducido se encuentra dentro de la lista
	* @param match parametro que tomará el valor booleano correspondiente a devolver
	* @return <ul>
        *         <li>true: El elemento introducido se encuentra en la lista</li>
        *         <li>false: El elemento no se encuentra en la lista</li>
        *         </ul>
        */
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
     * Método que devuelve el elemento de la lista de una posición index dada
     * @param index Posición dada
     * @throws IndexListException se lanza si la variable index toma valores imposibles
     * @return Elemento almacenado en la posición indicada
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
    }//Cierre del método

    /**
     * Método que comprueba si una lista está vacía y devuelve el valor booleano correspondiente
     * @return <ul>
     *          <li>true: La lista está vacia</li>
     *          <li>false: La lista contiene algún valor</li>
     *          </ul>
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
     * Método que introduce un elemento en la posición anterior a index, para ello tanto al elemento en index como a sus posteriores, les suma una posición
     * Si la lista está llena, la redimiensiona y mete el valor en su posición correspondiente
     * @param element Elemento a introducir
     * @param index Posición siguiente a la que introduciremos el elemento
     * @throws IndexListException se lanza si la variable index toma valores imposibles
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
     * Método que elimina el elemento que se encuentra en la posición dada y resta a todos los elementos posteriores una posición.
     * @param index posición del elemento a eliminar
     * @throws IndexListException se lanza si la variable index toma valores imposibles
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
     * @param element elemento a encontrar en la lista
     * @param pos posición en la que se encuentra el elemento
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
	
    /**
     * Método que imprime todos los elementos de la lista o indica que está vacía
     * @param values Parametro en el que se almacenarán los elementos 
     * @param aux Valor auxiliar para sacar uno a uno cada elemento de la cola
     * @return Elementos de la pila
     */
    public String toString() {
        String values = "";
        int aux = 0;
        if(isEmpty()) {
            return "La cola está vacía";
        }else {
            while(aux < N) {
                values+=L[aux++];
            }
        }
        return values;
    }//Cierre del método

}//Cierre de la clase
