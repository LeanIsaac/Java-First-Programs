
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		
		//cuenta.saldo = 400;
		miCuenta.depositar(400);
		
		System.out.println("Saldo depositado en mi cuenta: $" + miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println("Retiro de mi cuenta: $100, saldo actual $" + miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		System.out.println("Cuenta de Jimena: $" + cuentaDeJimena.getSaldo());
		cuentaDeJimena.transferir(400, miCuenta);
		System.out.println("Transferencia de Jimena: $400, a mi cuenta");
		
		System.out.println("Saldo en la cuenta de Jimena: $" + cuentaDeJimena.getSaldo());
		System.out.println("Mi Cuenta: $" + miCuenta.getSaldo());

	}

}
