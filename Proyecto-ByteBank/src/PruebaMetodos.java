
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		
		cuenta.saldo = 400;
		cuenta.depositar(400);
		
		System.out.println(cuenta.saldo);
		

	}

}
