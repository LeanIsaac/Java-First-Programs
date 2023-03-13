//Entidad Cuenta
 class Cuenta { //OBJETO
	 //ATRIBUTOS
	 private double saldo; //encapsulando saldo
	 private int agencia;
	 private int numero;
	 Cliente titular = new Cliente();
	 //Cliente titular = new Cliente();
	 
	 void depositar(double valor) {
		 //this = este objeto = cuenta // hace referencia al objeto cuenta
		 this.saldo += valor;
	 }
	 
	 //public = modificador de acceso
	 public boolean retirar(double valor) {
		 if(this.saldo >= valor) {
			 this.saldo -= valor;
			 return true;
		 }
		 return false;
	}
	 
	 public boolean transferir(double valor, Cuenta cuenta) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	 
	 //Getter
	 public double getSaldo(){
		 return this.saldo;
	 }
	 
	 //Setter
	 public void setAgencia(int nuevaAgencia){
		 if(nuevaAgencia > 0) {			 
			 this.agencia = nuevaAgencia;
		 }
		 else {
			 System.out.println("No estan permitidos valores negativos");
		 }
	 }
	 
	 public int getAgencia() {
		return agencia;
	}
	 
	 public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	 
	 public Cliente getTitular() {
		return titular;
	}
	 
}//FIN