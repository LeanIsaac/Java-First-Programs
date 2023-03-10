
public class CrearCuenta {

	public static void main(String[] args) {
		
		Cuenta primeraCuenta= new Cuenta();
		Cuenta segundaCuenta = new Cuenta();
		
		primeraCuenta.saldo = 2500;
		primeraCuenta.depositar(450); // un metodo (despositar) es igual a una funcion??
		primeraCuenta.titular = "Leandro Marecos";
		
		segundaCuenta.saldo = 3432;
		segundaCuenta.titular = "Isaac Brizuela";
		
		System.out.println("Titular: "+ primeraCuenta.titular + ", Saldo $"+ primeraCuenta.saldo);
		System.out.println();
		System.out.println("Titular: "+ segundaCuenta.titular + ", Saldo $"+ segundaCuenta.saldo);
		
		
		
		
		
		
		
	}//FIN METODO PRINCIPAL - FINAL DEL SCOPE
}
