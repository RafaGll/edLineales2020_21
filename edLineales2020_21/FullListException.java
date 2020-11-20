package edLineales2020_21;
/**
 * Clase que define la excepción FullListException.
 * Esta excepción será llamada cuando la lista esté llena
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 13/11/2020
 * @version 1.0
 */
public class FullListException extends RuntimeException {
	public FullListException (String error){
		super(error);
	}
}
