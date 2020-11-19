package edLineales2020_21;
/**
 * Clase que define la excepción EmptyQueueException
 * Esta excepción será llamada cuando la cola esté vacía
 */
public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException (String error){
		super(error);
	}
}
