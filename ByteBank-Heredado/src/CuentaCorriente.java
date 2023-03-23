
public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//SOBREESCRITURA DE METODOS
	//No borrar la anotacion
	//anotacion que indica que este metodo esta siendo sobre-escrito de la clase padre, y no es nuevo
	@Override 
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
}
