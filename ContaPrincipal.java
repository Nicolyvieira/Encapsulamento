import java.util.Scanner;
public class ContaPrincipal {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ContaSimplificada conta = new ContaSimplificada();
		
		System.out.println("Digite o numero da cont:");
		conta.setNumeroConta(in.nextInt());
		
		System.out.println("Digite o nome do correntista:");
		conta.setNomeCorrentista(in.next());
		
		System.out.println("Digite o saldo da conta:");
		conta.setSaldo(in.nextDouble());
		
		System.out.println("Digite o valor depositado:");
		conta.setValor(in.nextDouble());
		
		System.out.println("Digite o saque solicitado:");
		conta.setSaque(in.nextDouble());
		
		//METODO COM PARAMETRO E SEM RETORNO 
		conta.abreConta(conta.getNumeroConta(), conta.getNomeCorrentista(), conta.getSaldo());
		conta.depositaValor(conta.getValor());
		conta.retiraValor(conta.getsaque());
		
		//METODO COM PARAMETRO E COM RETORNO
		conta.retiraValorRetornaSaldo(conta.getSaldo());
		
		//METODO SEM PARAMETRO E SEM RETORNO
		conta.exibirSaldo();
		
		in.close();
	}

}
