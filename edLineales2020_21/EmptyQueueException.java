package edLineales2020_21;
/**
 * Clase que define la excepción EmptyQueueException.
 * Esta excepción será llamada cuando la cola esté vacía
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 6/11/2020
 * @version 1.0
 */
public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException (String error){
		super(error);
	}
}
