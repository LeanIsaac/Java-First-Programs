
public class Contador extends Funcionario{
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		System.out.println("EJECUNTADO DESDE CONTADOR");
		return 200;
	}
}

/*	
 *  En esta clase aprendimos que:
 *
 *	los objetos no cambian de tipo;
 *	la referencia puede cambiar, y ah� es donde entra el polimorfismo;
 *	el polimorfismo permite utilizar referencias m�s gen�ricas para comunicarse con un objeto;
 *	el uso de referencias m�s gen�ricas permite desacoplar sistemas.
 *	En el siguiente v�deo, hablaremos sobre c�mo se comportan los constructores en la herencia.
*/