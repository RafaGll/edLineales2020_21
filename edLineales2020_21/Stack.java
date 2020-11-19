package edLineales2020_21;

/**
 * Interfaz para la creaci�n de pilas est�ticas y din�micas
 */
interface Stack <T> {
    public T pop ();
    public T top ();
    public void push (T element);
    public boolean isEmpty ();
    public int Size ();
	public String toString();
}
