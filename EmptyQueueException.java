package edLineales2020_21;
/*
 * Clase que define la excepci�n EmptyQueueException
 */
public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException (String error){
		super(error);
	}
}
