package edLineales2020_21;

/**
 * Clase que define la excepción IndexListException.
 * Esta excepción será llamada cuando el indice introducido (index) tome un valor no valido para esta lista 
 *
 * @author Iván Cantalejo, Rafael González y Daniel Martín. Universidad de Castilla la Mancha.
 *
 * @since 14/11/2020
 * @version 1.0
 */
public class IndexListException extends RuntimeException {
	public IndexListException (String error){
		super(error);
	}
}

