package edLineales2020_21;
/**
 * Clase que define la excepción EmptyStackException.
 * Esta excepción será llamada cuando la pila esté vacía
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 30/10/2020
 * @version 1.0
 */
public class EmptyStackException extends RuntimeException {

	public EmptyStackException (String error){
		super(error);
	}
}
