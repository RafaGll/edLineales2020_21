package edLineales2020_21;
/**
 * Clase que define la excepción FullQueueException.
 * Esta excepción será llamada cuando la cola esté llena
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 6/11/2020
 * @version 1.0
 */
public class FullQueueException extends RuntimeException {
	public FullQueueException (String error){
		super(error);
	}
}
