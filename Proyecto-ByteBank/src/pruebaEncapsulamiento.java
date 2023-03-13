
public class pruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Juan");
		cliente.setTelefono("11 4123-1242");
		
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getTelefono());
		
		cuenta.setTitular(cliente);
		
		System.out.println(cuenta.getTitular().getNombre());
	}
}
