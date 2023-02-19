
public class Matriz {

	public static void main(String[] args) {
		
		/* VERSION 01
		for(int fila=0; fila <= 10 ;fila++) {
			for(int columna = 0; columna <= 10;columna++) {
				if(columna > fila) {
					break;
				}
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}*/
		
		//VERSION 02
		for(int fila=0; fila <= 10 ;fila++) {
			for(int columna = 0; columna < fila; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	}//FIN METODO MAIN // FIN SCOPE
}
