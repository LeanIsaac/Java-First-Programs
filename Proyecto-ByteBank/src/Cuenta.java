
 class Cuenta { //OBJETO
	 //ATRIBUTOS
	 double saldo;
	 int agencia;
	 int numero;
	 String titular;
	 
	 void depositar(double valor) {
		 //this = este objeto = cuenta // hace referencia al objeto cuenta
		 this.saldo += valor;
	 }
}