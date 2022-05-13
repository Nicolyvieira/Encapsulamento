
public class Produto {
	//ATRIBUTOS
		private String nome;
		private int codigo, quantidadeComprada, quantidadeVenda, novaQuantidadeVenda;
		private double precoCusto, precoVenda, margemLucro;
		
		//MÉTODOS GET E SET
		public String getNome() {
			return this.nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getCodigo() {
			return this.codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		
		public double getPrecoCusto() {
			return this.precoCusto;
		}
		public void setPrecoCusto(double precoCusto) {
			this.precoCusto = precoCusto;
		}
		
		public double getPrecoVenda() {
			return this.precoVenda;
		}
		public void setPrecoVenda(double precoVenda) {
			this.precoVenda = precoVenda;
		}
		
		public double getMargemLucro() {
			return this.margemLucro;
		}
		public void setMargemLucro(double margemLucro) {
			this.margemLucro = margemLucro;
		}
		
		//MÉTODO SEM PARÂMETRO E SEM RETORNO
		public void exibirDados() {
			System.out.println("\nDados do Produto\n");
			System.out.println("Nome: "+this.nome);
			System.out.println("Código: "+this.codigo);
			System.out.println("Custo: "+this.precoCusto);
			System.out.println("Margem de lucro: "+this.margemLucro);
		}
		
		//MÉTODO COM PARÂMETRO E SEM RETORNO
		public void atribuirExibir(String nome, int codigo, double precoCusto, double margemLucro) {
			this.nome = nome;
			this.codigo = codigo;
			this.precoCusto = precoCusto;
			this.margemLucro = margemLucro;
			
			System.out.println("\nDados do Produto\n");
			System.out.println("Nome: "+this.nome);
			System.out.println("Código: "+this.codigo);
			System.out.println("Custo: "+this.precoCusto);
			System.out.println("Margem de lucro: "+this.margemLucro);
		}
		
		//MÉTODO SEM PARÂMETRO E COM RETORNO
		public double calcularPrecoVenda() {
			return this.precoVenda = (this.precoCusto / 100 * this.margemLucro) + this.precoCusto;
		}
		
		//MÉTODO COM PARÂMETRO E COM RETORNO
		public int registrarEntrada(int quantidadeComprada, int quantidadeVenda) {
			this.quantidadeComprada = quantidadeComprada;
			this.quantidadeVenda = quantidadeVenda;
			
			System.out.println("Quantidade de produtos comprados: "+this.quantidadeComprada);
			
			return this.novaQuantidadeVenda = this.quantidadeVenda - this.quantidadeComprada;
		}
		
		public int registrarSaida(int quantidadeVenda, int quantidadeComprada) {
			this.quantidadeVenda = quantidadeVenda;
			this.quantidadeComprada = quantidadeComprada;
			
			System.out.println("Quantidade de produtos disponíveis para venda: "+this.quantidadeVenda);
			
			if(this.quantidadeComprada > this.quantidadeVenda) {
				System.out.println("Não há produtos suficientes para esta venda!");
			}else {
				System.out.println("Nova quantidade de produtos disponíveis para venda: "+this.novaQuantidadeVenda);
			}
			
			return this.quantidadeVenda;
		}
		
		public double definirPrecoVenda(double precoVenda) {
			this.precoVenda = precoVenda;
			
			if(this.precoVenda < this.precoCusto){
				System.out.println("O valor da venda está menor que o valor do custo do produto!");
			}else if(this.quantidadeComprada < this.quantidadeVenda){
				System.out.println("Preço da venda: "+this.precoVenda);
			}
			
			return this.precoVenda;
		}
		
	}

