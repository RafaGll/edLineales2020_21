package edLineales2020_21;

public class Ejemplos {

	public static void main(String[] args) {
		Persona jose = new Persona("José Pérez", 22);
		Persona lucia = new Persona("Lucía Rodríguez", 41);
		Persona sebas = new Persona("Sebastian Sánchez", 41);
		Persona marta = new Persona("Marta Benavides", 35);
		Persona pedro = new Persona("Pedro Gil", 9);
		Persona ana = new Persona("Ana Sanz", 14);


		StackStatic<Persona> pila = new StackStatic<Persona>(Persona[].class);
		//StackDynamic<Persona> pila = new StackDynamic<Persona>(Persona[].class);
		pila.push(jose);
		pila.push(lucia);
		pila.push(sebas);
		pila.push(marta);
		pila.push(pedro);
		pila.push(ana);

		System.out.println(pila.toString());
		pila.pop();
		System.out.println(pila.toString());
		
		QueueStatic<Persona> cola = new QueueStatic<Persona>(Persona[].class);
		//QueueDynamic<Persona> cola = new QueueDynamic<Persona>(Persona[].class);
		cola.enqueue(jose);
		cola.enqueue(lucia);
		cola.enqueue(sebas);
		cola.enqueue(marta);
		cola.enqueue(pedro);
		cola.enqueue(ana);
		
		System.out.println(cola.front());
		cola.dequeue();
		System.out.println(cola.toString());
		
		ListStatic<Persona> lista = new ListStatic<Persona>(Persona[].class);
		//ListDynamic<Persona> lista = new ListDynamic<Persona>(Persona[].class);
		cola.enqueue(jose);
		cola.enqueue(lucia);
		cola.enqueue(sebas);
		cola.enqueue(marta);
		cola.enqueue(pedro);
		cola.enqueue(ana);
		
		
		

		
	}

}
