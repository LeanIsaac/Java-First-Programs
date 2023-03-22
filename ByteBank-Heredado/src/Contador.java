
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
 *	la referencia puede cambiar, y ahí es donde entra el polimorfismo;
 *	el polimorfismo permite utilizar referencias más genéricas para comunicarse con un objeto;
 *	el uso de referencias más genéricas permite desacoplar sistemas.
 *	En el siguiente vídeo, hablaremos sobre cómo se comportan los constructores en la herencia.
*/