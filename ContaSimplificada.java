import java.util.Scanner;
public class ContaSimplificada {
	
	
	//ATRIBUTOS
		private int numeroConta;
		private String nomeCorrentista;
		private double saldo, valor, saque;

		public int getNumeroConta() {
			return this.numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		public String getNomeCorrentista() {
			return this.nomeCorrentista;
		}
		
		public void setNomeCorrentista(String nomeCorrentista) {
			this.nomeCorrentista = nomeCorrentista;
		}
		
		public double getSaldo() {
			return this.saldo;
		}
		
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public double getValor() {
			return this.valor;
		}
		
		public void setValor(double valor) {
			this.valor = valor;
		}
		
		public double getsaque() {
			return this.saque;
		}
		
		public void setSaque(double saque) {
			this.saque = saque;
		}

		//M�TODO COM PAR�METRO E SEM RETORNO
		public void abreConta(int numeroConta, String nomeCorrentista, double saldo) {
			this.numeroConta = numeroConta;
			this.nomeCorrentista = nomeCorrentista;
			this.saldo = saldo;
			
			System.out.println("\nDados da Conta Simplificada\n");
			System.out.println("N�mero da Conta: "+this.numeroConta);
			System.out.println("Nome do Correntista: "+this.nomeCorrentista);
			System.out.println("Saldo: "+this.saldo);
		}
		
		public void depositaValor(double valor) {
			this.valor = valor;
			
			System.out.println("Valor depositado na conta: "+this.valor);
		}
		
		public void retiraValor(double saque) {
			this.saque = saque;
			
			System.out.println("Saque solicitado: "+this.saque);
			
			if(this.saque > this.valor) {
				System.out.println("O saque solicitado � maior que o valor depositado na conta!");
			}
		}
		//M�TODO COM PAR�METRO E COM RETORNO
		public double retiraValorRetornaSaldo(double saldo) {
			return this.saldo = this.valor - this.saque;
		}
		
		//M�TODO SEM PAR�METRO E SEM RETORNO
		public void exibirSaldo() {
			System.out.println("Saldo Atual da Conta: "+this.saldo);
		}
		
	}


