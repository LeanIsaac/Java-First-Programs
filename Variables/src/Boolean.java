
public class Boolean {

	public static void main(String[] args) {
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condicion es: " + esPareja);
		
		if(puedeEntrar) {
			System.out.println("Sea bienvenido");
		}
		else {
			System.out.println("Usted no esta permitido a " + "entrar");
		}
	
	}//FIN METODO MAIN // FIN SCOPE PRINCIPAL
}
