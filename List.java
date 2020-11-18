package edLineales2020_21;

/**
 * Interfaz para la creaci�n de listas est�ticas y din�micas
 */
public interface List <T> {
    public void add(T element);
    public boolean isEmpty();
    public boolean exists(T element);
    public int Size();
    public T get(int n);
    public void put(T element, int n);
    public void remove(int n);
    public int locate(T element);
}