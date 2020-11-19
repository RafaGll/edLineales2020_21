package edLineales2020_21;

/**
 * Esta clase crea y modifica un nodo
 */
class Node<T> {
    T element;	//Elemento de la pila
    Node<T> next;	//Creación del Nodo next

    /**
     * Método que crea un Nodo que apunta a null
     */
    public Node () {
        next = null;
    }//Cierre del método

    /**
     * Método que crea un Nodo que apunta al elemento Nodo next y guarda el siguiente valor element en el Nodo actual
     * @param element Elemento al que se refiere el Nodo
     * @param next Nodo actual pasa a ser el Nodo next
     */
    public Node (T element, Node<T> next) {
    	this.element = element;
        this.next = next;
    }//Cierre del método

    /**
     * Método que devuelve el valor element de un Nodo
     * @return Elemento del Nodo
     */
	public T getElement () {
        return element;
    }//Cierre del método

	/**
     * Método que devuelve el valor element del Nodo next
     * @return Elemento del Nodo next
     */
    public Node<T> getNext () {
        return next;
    }//Cierre del método

    /**
     * Método que inserta un valor element en un Nodo
     */
    public void setElement (T element) {
        this.element = element;
    }//Cierre del método

    /**
     * Método que inserta un valor element en el Nodo next
     */
    public void setNext (Node<T> next) {
        this.next = next;
    }//Cierre del método
}//Cierre de la clase
