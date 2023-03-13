
public class TestReferencia {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		
		diego.setNombre("Diego");
		diego.setDocumento("213123");
		diego.setTelefono("1123232");
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.setAgencia(22);
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.titular.getDocumento());
		System.out.println(cuentaDeDiego.titular.getNombre());

	}

}
