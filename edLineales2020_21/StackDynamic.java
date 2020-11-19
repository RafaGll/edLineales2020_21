package edLineales2020_21;

/**
 * Esta clase crea una pila estática
 */
public abstract class StackDynamic <T> implements Stack <T>{
	private int N;	//Tamaño de la pila
    private Node<T> top = null;	// Creación de top

    /**
     * Constructor de pilas dinámicas
     * @param N La variable N almacena el tamaño de la pila (Se iniciaiza a 0)
     * @param top top
     */
    public StackDynamic () {
        N = 0;
        top = new Node <T>();
    }//Cierre del constructor

    /**
     * Método que devuelve el valor top de la pila y lo elimina 
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
     * @param aux Nodo auxiliar en el que se introducirá el elemento antes de pasarlo a top
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
    * @return <ul>
    *          <li>true: La pila está vacia</li>
    *          <li>false: La pila contiene algún valor</li>
    *          </ul>
    */
    public boolean isEmpty () {
    	boolean isEmpty = (top == null);
        return isEmpty;
    }//Cierre del método
	
	/**
     * Método que imprime todos los valores de la pila o indica que está vacía
     * @param values Parametro en el que se almacenarán los valores 
     * @param aux Nodo auxiliar para sacar uno a uno cada valor de la pila
     * @return Valores de la pila
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
