
public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente(); //Polimorfismo
		funcionario.setNombre("Lena");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jime");
		
		funcionario.setSalario(2000);
		gerente.setSalario(1000);
		
	}
}

//Las referencias de tipos de clases mas genéricos referencian objetos más especificos