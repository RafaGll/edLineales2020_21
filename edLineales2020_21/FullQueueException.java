package edLineales2020_21;
/**
 * Clase que define la excepci�n FullQueueException
 */
public class FullQueueException extends RuntimeException {
	public FullQueueException (String error){
		super(error);
	}
}
