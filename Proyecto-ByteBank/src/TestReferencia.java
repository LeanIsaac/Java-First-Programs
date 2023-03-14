
public class TestReferencia {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		
		diego.setNombre("Diego");
		diego.setDocumento("213123");
		diego.setTelefono("1123232");
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.setAgencia(22);
		cuentaDeDiego.setTitular(diego);
		
		System.out.println(cuentaDeDiego.getTitular().getDocumento());
		System.out.println(cuentaDeDiego.getTitular().getNombre());

	}

}
