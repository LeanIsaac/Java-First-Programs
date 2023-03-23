
public class TestControlBonificacion {
	public static void main(String[] args) {
		
		Funcionario lena = new Contador();
		lena.setSalario(2000);
		
		Gerente jime = new Gerente();
		jime.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		//POLIMORFISRMO
		controlBonificacion.registrarSalario(lena);
		controlBonificacion.registrarSalario(jime);
		controlBonificacion.registrarSalario(alexis);
		
	}
}
