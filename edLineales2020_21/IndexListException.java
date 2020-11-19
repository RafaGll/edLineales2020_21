package edLineales2020_21;

/**
 * Clase que define la excepción IndexListException
 * Esta excepción será llamada cuando el indice introducido (index) tome un valor no valido para esta lista 
 */
public class IndexListException extends RuntimeException {
	public IndexListException (String error){
		super(error);
	}
}

