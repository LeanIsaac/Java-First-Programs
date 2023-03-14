
public class PruebaConstructores {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();//INSTANCIA 1
		Cuenta cuenta2 = new Cuenta();//INSTANCIA 2
		
		//cuenta.setAgencia(2);
		
		//System.out.println(cuenta.getAgencia());
		System.out.println(Cuenta.getTotal());
	}
}
