package ej5.sandwiches;

public class SubteWay {
	public static void main(String[] args) {
		
		Director director = new Director();
		
		//Crear sandwich clasico
		director.setBuilder(new ClasicoBuilder());
		Sandwich clasico = director.armarSandwich();
		System.out.println("El sandwich clasico cuesta: " + clasico.calcularPrecio());
		
		//Crear sandwich vegano
		director.setBuilder(new VeganoBuilder());
		Sandwich vegano = director.armarSandwich();
		System.out.println("El sandwich vegano cuesta: " + vegano.calcularPrecio());
	}
}
