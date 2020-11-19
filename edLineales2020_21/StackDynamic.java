package edLineales2020_21;

/**
 * Esta clase crea una pila est�tica
 */
public abstract class StackDynamic <T> implements Stack <T>{
	private int N;	//Tama�o de la pila
    private Node<T> top = null;	// Creaci�n de top

    /**
     * M�todo que crea una pila din�mica
     * @param N Tama�o de la pila
     * @param top top
     */
    public StackDynamic () {
        N = 0;
        top = new Node <T>();
    }//Cierre del m�todo

    /**
     * M�todo que elimina y devuelve el valor top de la pila
     * En caso de que la pila est� vac�a, muestra un error
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
    		System.out.println ("La pila est� vac�a");
    	}
        return element;
   }//Cierre del m�todo


    /**
     * M�todo que introduce un valor en la pila
     */
    public void push (T element) {
        Node<T> aux = new Node <T>(element, top);
        top=aux;
        N++;
    }//Cierre del m�todo

    /**
     * M�todo que devuelve el valor top de la pila
     * En caso de que la pila est� vac�a, muestra un error
     * @return Elemento top de la pila
     */
   public T top() throws EmptyStackException{
	   T element = null;
	   try {
		   element = (T) top.getElement();
	   } catch (EmptyStackException e) {
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
    	boolean isEmpty = (top == null);
        return isEmpty;
    }//Cierre del m�todo
	/**
	 *
	 */
	public String toString() {
		String values = "";
		Node <T> Nodoaux = top;
		if(isEmpty()) {
			return "La pila est� vac�a";
		}else {
			while(Nodoaux!=null) {
				values+=Nodoaux;
				Nodoaux = Nodoaux.getNext();
			}
		}
		return values;
	}//Cierre del método
}//Cierre de la clase
