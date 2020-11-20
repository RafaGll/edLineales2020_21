package edLineales2020_21;

public class Ejemplos {

	public static void main(String[] args) {
		Persona jose = new Persona("José Pérez", 22);
		Persona lucia = new Persona("Lucía Rodríguez", 41);
		Persona sebas = new Persona("Sebastian Sánchez", 41);
		Persona marta = new Persona("Marta Benavides", 35);
		Persona pedro = new Persona("Pedro Gil", 9);
		Persona ana = new Persona("Ana Sanz", 14);

		System.out.println("----Para las pilas----");
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

		System.out.println("----Para las colas----");
		QueueStatic<Persona> cola = new QueueStatic<Persona>(Persona[].class);
		//QueueDynamic<Persona> cola = new QueueDynamic<Persona>(Persona[].class);
		cola.enqueue(jose);
		cola.enqueue(lucia);
		cola.enqueue(sebas);
		cola.enqueue(marta);
		cola.enqueue(pedro);
		cola.enqueue(ana);

		System.out.println(cola.toString());
		cola.dequeue();
		System.out.println(cola.toString());

		System.out.println("----Para las listas----");
		ListStatic<Persona> lista = new ListStatic<Persona>(Persona[].class);
		//ListDynamic<Persona> lista = new ListDynamic<Persona>(Persona[].class);
		lista.add(jose);
		lista.add(lucia);
		lista.add(sebas);
		lista.add(marta);
		lista.add(pedro);
		lista.add(ana);
		
		
		System.out.println(lista.toString());
		lista.remove(2); // lista.remove(2) corresponde al tercer elemento
		System.out.println(lista.toString());
		int posicion=lista.locate(pedro);
		System.out.println("Posición de Pedro Gil: "+posicion);
		Persona arancha = new Persona("Arancha Leco", 58);
		lista.put(arancha, posicion+1);
		System.out.println(lista.toString());





	}

}
