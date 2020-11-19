package edLineales2020_21;

/**
 * Esta clase crea una pila estática
 */
public abstract class StackDynamic <T> implements Stack <T>{
	private int N;	//Tamaño de la pila
    private Node<T> top = null;	// Creación de top

    /**
     * Método que crea una pila dinámica
     * @param N Tamaño de la pila
     * @param top top
     */
    public StackDynamic () {
        N = 0;
        top = new Node <T>();
    }//Cierre del método

    /**
     * Método que elimina y devuelve el valor top de la pila
     * En caso de que la pila está vacía, muestra un error
     * @param element Elemento top de la pila
     * @return Elemento top de la pila
     */
    public T pop() throws EmptyStackException{
        T element = null;
        try {
        	element = (T) top.getElement();
        	top = top.getNext();
        	N--;
    	}catch(EmptyStackException e) {
    		System.out.println ("La pila está vacía");
    	}
        return element;
   }//Cierre del método


    /**
     * Método que introduce un valor en la pila
     */
    public void push (T element) {
        Node<T> aux = new Node <T>(element, top);
        top=aux;
        N++;
    }//Cierre del método

    /**
     * Método que devuelve el valor top de la pila
     * En caso de que la pila está vacía, muestra un error
     * @return Elemento top de la pila
     */
   public T top() throws EmptyStackException{
	   T element = null;
	   try {
		   element = (T) top.getElement();
	   } catch (EmptyStackException e) {
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
    * Método que comprueba si una pila está vacía
    * @return Toma el valor booleano False si la pila contiene algún valor y True si está vacía
    */
    public boolean isEmpty () {
    	boolean isEmpty = (top == null);
        return isEmpty;
    }//Cierre del método
	/**
	 *
	 */
	public String toString() {
		String values = "";
		Node <T> Nodoaux = top;
		if(isEmpty()) {
			return "La pila está vacía";
		}else {
			while(Nodoaux!=null) {
				values+=Nodoaux;
				Nodoaux = Nodoaux.getNext();
			}
		}
		return values;
	}//Cierre del método
}//Cierre de la clase
