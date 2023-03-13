
public class PruebaAcceso {
	//public = prueba de acceso
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(400);
		miCuenta.retirar(300); 
		miCuenta.setAgencia(2);
		
		System.out.println(miCuenta.getSaldo());
		System.out.println(miCuenta.getAgencia());
	}
}
