package edLineales2020_21;
/**
 * Clase que define la excepción EmptyStackException
 * Esta excepción será llamada cuando la pila esté vacía
 */
public class EmptyStackException extends RuntimeException {
	public EmptyStackException (String error){
		super(error);
	}
}
