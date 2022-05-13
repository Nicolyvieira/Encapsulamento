import java.util.Scanner;
public class PrincipalProduto {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Produto p = new Produto();
		
		//DECLARAÇÃO DE VARIÁVEIS
		int quantidadeComprada, quantidadeVenda;
		
		//TESTE 1
		System.out.println("Teste 1\n");

		System.out.println("Insira o nome do produto: ");
		p.setNome(in.next());
		
		System.out.println("Insira o código do produto: ");
		p.setCodigo(in.nextInt());
		
		System.out.println("Insira o custo do produto: ");
		p.setPrecoCusto(in.nextDouble());
		
		System.out.println("Insira a quantidade de produtos comprados: ");
		quantidadeComprada = in.nextInt();
		
		System.out.println("Insira a quantidade de produtos disponíveis para venda: ");
		quantidadeVenda = in.nextInt();
		
		System.out.println("Insira a margem de lucro: ");
		p.setMargemLucro(in.nextDouble());
		
		//MÉTODO SEM PARÂMETRO E SEM RETORNO
		p.exibirDados();
		
		//MÉTODO SEM PARÂMETRO E COM RETORNO
		p.calcularPrecoVenda();
		
		//MÉTODO COM PARÂMETRO E COM RETORNO
		p.registrarEntrada(quantidadeComprada, quantidadeVenda);
		p.registrarSaida(quantidadeVenda, quantidadeComprada);
		p.definirPrecoVenda(p.getPrecoVenda());
				
				
		//TESTE 2
		System.out.println("\n\nTeste 2");
		//MÉTODO COM PARÂMETRO E SEM RETORNO
		p.atribuirExibir("Doce de Leite Mimoso", 1212, 25.80, 20);
		
		//MÉTODO SEM PARÂMETRO E COM RETORNO
		p.calcularPrecoVenda();
		
		//MÉTODO COM PARÂMETRO E COM RETORNO
		p.registrarEntrada(70, 40);
		p.registrarSaida(40, 70);
		p.definirPrecoVenda(p.getPrecoVenda());
		
		in.close();
	}
	
}


