
//Esta clase (Gerente) extiende de funcionario
//Gerente es un funcionario
public class Gerente extends Funcionario{
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		//return clave == "AluraCursosOnline";
		return clave == this.clave;
	}
	
	//Sobre-escrtura de motodo 
	public double getBonificacion() {
		//[super], de la clase padre (superior) llamá a este metodo
		System.out.println("EJECUNTADO DESDE GERENTE");
		return super.getSalario() + this.getSalario() *0.05; 
	}
	
	

	//PUEDO BORRAR PORQUE GERENTE HEREDA LOS METODOS Y ATRIBUTOS DE LA CLASE FUNCIONARIO
	/*
	private String nombre;
	private String documento;
	private double salario;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public double getBonificacion(){
		return this.salario;
	}*/
	
}
