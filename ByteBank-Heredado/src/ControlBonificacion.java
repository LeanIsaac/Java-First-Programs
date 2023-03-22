
public class ControlBonificacion {
	
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Calculo actual: " + this.suma);
		return this.suma;
	}
}

//Mismo nombre en los tres casos, arguento de tipo diferente se lo conoce como sobrecarga de metodo