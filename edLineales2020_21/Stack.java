package edLineales2020_21;

/**
 * Interfaz para la creación de pilas estáticas y dinámicas
 */
interface Stack <T> {
    public T pop ();
    public T top ();
    public void push (T element);
    public boolean isEmpty ();
    public int Size ();
	public String toString();
}
