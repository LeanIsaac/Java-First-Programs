
public class TestFuncional {
	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		
		diego.setNombre("Diego ");
		diego.setDocumento("41 622 302");
		diego.setSalario(2200);
		
		System.out.println(diego.getNombre() + diego.getDocumento());
		System.out.println("Salario: $" + diego.getSalario());
		System.out.println("Bonificación: $" + diego.getBonificacion());
	}
}	