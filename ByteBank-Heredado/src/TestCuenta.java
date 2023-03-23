
public class TestCuenta {
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(11, 11);
		cc.depositar(2000);

		CuentaAhorros ca = new CuentaAhorros(22, 22);
		ca.depositar(200);
		
		cc.transferir(1000, ca);
		
		System.out.println("Cuenta Corrienta: $" + cc.getSaldo());
		System.out.println("Cuenta Ahorros: $" + ca.getSaldo());
	}
}
