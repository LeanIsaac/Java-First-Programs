/*Una clase abstracta representa un concepto, algo abstracto, y el compilador no permite instanciar un objeto de esa clase. 
Para crear una instancia, es necesario crear primero una clase hija no abstracta.*/
//public abstract class Funcionario {
	
public abstract class Funcionario {
	
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	public Funcionario() {
		
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
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Preparo el metodo para que sea implementado por las clases hijas
	//Este metodo obliga a todas las clases hijas a sobre-escribir este metodo
	public abstract double getBonificacion();
	//{
	//return this.salario * 0.1; //10% del salario
	//return this.salario * 0.05; //5% del salario
	//}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}//FIN
