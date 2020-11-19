package edLineales2020_21;
/**
 * Clase que define la excepción FullListException
 * Esta excepción será llamada cuando la lista esté llena
 */
public class FullListException extends RuntimeException {
	public FullListException (String error){
		super(error);
	}
}
