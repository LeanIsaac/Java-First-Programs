import java.util.Scanner; //BIBLIOTECA

public class EntradaDeDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su Nombre: ");
		String name = sc.nextLine();
		System.out.println("Ingrese su Edad: ");
		String edad = sc.nextLine();
		System.out.println("Que lenjuage de programacion es tu favorito? ");
		String lenguaje = sc.nextLine();
		
		int age = Integer.parseInt( edad );				// convierte un STRING al tipo de dato INT
		
		System.out.println("Cuantos lenguajes manejas? ");
		int cantDeLeng = sc.nextInt();
		
		if( cantDeLeng >= 3 ) {
			System.out.println("Eres Full-Stack");
		}
		else {
			System.out.println("No Eres Full-Stack");
		}
		
		if ( age < 18 ) {
			System.out.println("Hola " + name + ", Eres menor de Edad");
		}
		else {			
			System.out.println("Hola " + name + ", Su edad es " + edad + " Y su lenguaje de programacion Favorito es " + lenguaje);
		}
	
		sc.close();
		
		
	}//FIN METODO PRINCIPAL // FIN DEL SCOPE
}
