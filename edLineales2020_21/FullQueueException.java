package edLineales2020_21;
/**
 * Clase que define la excepción FullQueueException
 * Esta excepción será llamada cuando la cola esté llena
 */
public class FullQueueException extends RuntimeException {
	public FullQueueException (String error){
		super(error);
	}
}
