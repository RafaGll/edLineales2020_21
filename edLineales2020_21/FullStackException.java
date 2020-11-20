package edLineales2020_21;
/*
 * Clase que define la excepción FullStackException.
 * Esta excepción será llamada cuando la pila esté llena
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 30/10/2020
 * @version 1.0
 */
public class FullStackException extends ArrayIndexOutOfBoundsException {
	private static final long serialVersionUID = 1L;

	public FullStackException (String error){
		super(error);
	}
}
