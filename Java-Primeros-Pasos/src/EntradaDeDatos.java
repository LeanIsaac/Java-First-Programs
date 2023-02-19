import java.util.Scanner; //BIBLIOTECA

public class EntradaDeDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su Nombre: ");
		String name = sc.nextLine();
		System.out.println("Ingrese su Edad: ");
		String edad = sc.nextLine();
		System.out.println("Que lenjuage de programacion maneja: ");
		String lenguaje = sc.nextLine();
		
		System.out.println("Hola " + name + ", Su edad es " + edad + " Y su lenguaje es " + lenguaje);
		
		sc.close();
		
		/*
		int age = Integer.parseInt(edad); 				// convierte un STRING al tipo de dato INT
		age = age + 50;
		System.out.println(age);*/
		
		
		
		
		
	}//FIN METODO PRINCIPAL // FIN DEL SCOPE
}
