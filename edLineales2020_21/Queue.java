package edLineales2020_21;

/**
 * Interfaz para la creación de colas estáticas y dinámicas
 */
public interface Queue <T> {
	public void enqueue(T element);
	public T dequeue();
	public T front();
	public boolean isEmpty();
	public int size();
	public String toString();
}
