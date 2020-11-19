package edLineales2020_21;
/**
 * Esta clase crea y modifica listas dinámicas
 */
public abstract class ListDynamic <T> implements List <T>{
    private int N;
    private Node <T> tail, head;
	/**
	* Constructor de listas dinámicas
	* @param N La variable N almacena el tamaño de la lista (Se inicializa a 0)
	* @param head Nodo que contiene el primer elemento y apunta al siguiente (al crearlo no hay elementos por lo que no apunta a nada "=null")
	* @param tail Nodo que contiene el último elemento añadido y por tanto no tiene nodo al que apuntar.
	*/
    public ListDynamic() {
        N = 0;
        head = null;
        tail = null;
    }//Cierre del constructor

    /**
     * Método que introduce un elemento en la lista
     * @param aux Nodo auxiliar que crearemos con el elemento deseado
     */
    public void add(T element) {
        Node <T> aux = new Node<T>(element,null);
        tail.setNext(aux);
        tail = aux;
        if(head == null) {
            head = aux;
        }
        N++;
	}//Cierre del método

    /**
     * Método que comprueba si una lista está vacía
     * @return <ul>
     *          <li>true: La cola está vacia</li>
     *          <li>false: La cola contiene algún valor</li>
     *          </ul>
     */
    public boolean isEmpty() {
        return N == 0;
 }//Cierre del método

    /**
     * Método que devuelve el tamaño de la lista
     * @return Tamaño de la lista
     */
    public int Size () {
        return N;
    }//Cierre del método
    
    /**
	* Método que comprueba si un elemento introducido se encuentra dentro de la lista y devuelve un valor booleano
	* @param match Parametro que tomará el valor booleano correspondiente a devolver
	* @param aux Nodo auxiliar en el que almacenamos el elemento y recorre toda la lista comparando con los distintos elementos
	* @return <ul>
        *         <li>true: El elemento introducido se encuentra en la lista</li>
        *         <li>false: El elemento no se encuentra en la lista</li>
        *         </ul>
        */
    public boolean exists(T element) {
    	boolean match = false;
    	Node <T> aux = new Node<T>(element,null);
    	if(!isEmpty()) {
    		aux = head;
    		while (aux != null && !match) {
    			match = (element == aux.getElement());
    			aux = aux.getNext();
    		}
    	}
    	return match;
    }
    
    /**
     * Método que devuelve el elemento de la lista de una posición index dada
	 * Si la lista está vacía nos imprime un mensaje de error
     * @param index Posición dada
	 * @param aux Nodo auxiliar que recorre la lista hasta el indice deseado
     * @throws IndexListException se lanza si la variable index toma valores imposibles
     * @return Elemento almacenado en la posición indicada
     */   
    public T get(int index) {
    	
    	if (isEmpty())
    		System.out.println ("La lista está vacía");
    		
    	else {
    		try {
    			Node <T> aux = new Node<T>();
    			aux = head;
    			if (index > 0) {
    				for (int j = 0; j < index; j++) {
    					aux=aux.getNext();
    				}
    			}
    			return aux.getElement();
    		} catch(IndexListException e) {
    			System.out.println ("Valor de índice fuera de rango");
    		}
    	}
    	return null;
     }//Cierre del método

    /**
     * Método que introduce un elemento en la posición anterior a index
	 * Para ello, el nodo que apuntaba a la posición index deberá apuntar ahora al nodo con el elemento introducido, el cual a su vez apuntará al nodo en index
     * @param element Elemento a introducir
     * @param index Posición del nodo al que apuntará el nodo con el elemento nuevo
     * @throws IndexListException se lanza si la variable index toma valores imposibles
     */
    public void put(T element, int index) {
    	try {
			if(index == 0) {
				Node <T> aux2 = new Node<T>(element, head);
				head = aux2;
			}else {
				Node <T> aux = new Node<T>();
				aux = head;
				Node <T> prev = new Node<T>();
				for (int j = 0; j < index; j++) {
					prev = aux;
					aux = aux.getNext();
				}
				Node <T> aux2 = new Node<T>(element, aux);
				prev.setNext(aux2);
			}
			N++;
		 } catch(IndexListException e) {
			System.out.println ("Valor de índice fuera de rango");
		   }
      }//Cierre del método

    /**
     * Método que elimina el elemento que se encuentra en la posición dada. El nodo anterior a este apuntará al nodo posterior
     * @param index posición del elemento a eliminar
     * @throws IndexListException se lanza si la variable index toma valores imposibles
     */
    public void remove(int index) {
    	if (isEmpty()) {
    		System.out.println ("La lista está vacía");
    	}else {
    		try {
    			if (index == 0) {
    				head = head.getNext();
    				if (head == null) {
    					tail = null;
    				}
    			}else {
    				Node <T> aux = new Node<T>();
    				Node <T> prev = new Node<T>();
    				aux = head;
    				for (int j = 0; j < index ; j++) {
    					prev = aux;
    					aux = aux.getNext();
    				}
    				prev.setNext(aux);
    				if (tail == aux) {
    					tail = prev;
    					aux = null;
    				}
    			}
    			N--;
    		} catch(IndexListException e) {
    			System.out.println ("Valor de índice fuera de rango");
    		}
    	}
    }//Cierre del método

    /**
     * Método que devuelve la posición de un elemento dado
     * @param elemLoc elemento a encontrar en la lista
	 * @param elemento Parametro que recorrerá todos los elementos de la lista hasta dar con el almacenado por elemLoc
     * @param index posición en la que se encuentra el elemento
     * @return Posición del elemento
     */
    public int locate(T elemLoc) {
    	int index = -1;
    	if (isEmpty()) {
    		System.out.println ("La lista está vacía");
    	}else {
    		Node <T> aux = new Node<T>();
    		aux = head;
    		T element = null;
    		for (int j = 0; j < N && index == -1; j++) {
    			element = aux.getElement();
    			if (element == elemLoc) {
    				index = j;
    			}
    			aux = aux.getNext();
    		}
    	}
    	return index;
    }// Cierre del método
}// Cierre de la clase
