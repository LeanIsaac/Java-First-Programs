
public class CrearCuenta {

	public static void main(String[] args) {
		
		Cuenta primeraCuenta= new Cuenta();
		Cuenta segundaCuenta = new Cuenta();
		
		primeraCuenta.depositar(2500);
		primeraCuenta.depositar(450); // un metodo (despositar) es igual a una funcion??
		//primeraCuenta.titular.nombre = "Leandro Marecos"; //NO COMPILA
		
		segundaCuenta.depositar(3432);
		//segundaCuenta.titular.nombre = "Isaac Brizuela"; //NO COMPILA
		
		//System.out.println("Titular: "+ primeraCuenta.titular + ", Saldo $"+ primeraCuenta.saldo);
		System.out.println("Saldo $"+ primeraCuenta.getSaldo());
		System.out.println();
		//System.out.println("Titular: "+ segundaCuenta.titular + ", Saldo $"+ segundaCuenta.saldo);
		System.out.println("Saldo $"+ segundaCuenta.getSaldo());
		
		
		
		
		
		
		
	}//FIN METODO PRINCIPAL - FINAL DEL SCOPE
}
