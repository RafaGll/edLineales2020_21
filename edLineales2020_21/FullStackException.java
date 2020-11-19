package edLineales2020_21;
/*
 * Clase que define la excepción FullStackException
 * Esta excepción será llamada cuando la pila esté llena
 */
public class FullStackException extends RuntimeException {
	public FullStackException (String error){
		super(error);
	}
}
