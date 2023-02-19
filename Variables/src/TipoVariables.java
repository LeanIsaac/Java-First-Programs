import java.io.InputStream;
import java.util.Scanner;

public class TipoVariables {
	
	public static void main(String[] args) {//METODO PRINCIPAL
		
		System.out.println("New Test, ''Cobras un Sueldo?''");
		System.out.println();
		
		double sueldo;
		int age = 27;
		
		InputStream stream = System.in; //guardamos en stream un objeto mantenido por Java, en una variable de clase in de la clase System. Este Objeto InputStream es como un flujo de datos que viene del teclado.
		Scanner scanner = new Scanner(stream); // Objeto Scanner, usando como parámetro un flujo de datos. Esto es posible gracias a que Scanner tiene un constructor que acepta objetos InputStream.   
		System.out.println("Ingrese su nombre: ");
		
		String name = scanner.next(); //Bloquea la ejecución en espera de una entrada finalizada con un retorno. La función next(), retorna el string ingresado antes del retorno.
		scanner.close();
		
		
		if(age > 18 && age < 65) {
			sueldo  = 2490.53;
			System.out.println("Hola " + name +", Cobras un sueldo de: " + sueldo);
		}
		else {
			System.out.println("Hola " + name + ", no cobras ningun sueldo");
		}
		
//		long prueba = 122222222222L; L <- (especifico el tipo LONG)
//		short numChico = 13555;
//		byte numeroAunMasPequenio = 15;
//		float numeroDecimalPequenio = 2.5F; F <- (especifico el tipo Flotante)
	
	}//FIN METODO MAIN // FIN SCOPE PRINCIPAL
}
