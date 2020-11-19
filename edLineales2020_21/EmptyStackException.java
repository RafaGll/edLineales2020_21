package edLineales2020_21;
/**
 * Clase que define la excepción EmptyStackException
 */
public class EmptyStackException extends RuntimeException {
	public EmptyStackException (String error){
		super(error);
	}
}