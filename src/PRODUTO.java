
public class PRODUTO {

	// Atributos
	String nome;
	String marca;
	float custo;
	float venda;

	// Construtor padrão (sem parametro)
	PRODUTO() {

	}

	PRODUTO(String nome, String marca, float custo, float venda) {
		this.nome = nome;
		this.marca = marca;
		this.custo = custo;
		this.venda = venda;
	}
	// Método para calcular o lucro

	float lucro() {
		return venda - custo;
	}

	// Método para exibir as informações do produto
	void exibirInformacoes() {
		System.out.printf("Nome: %s%n", nome);
		System.out.printf("Marca: %s%n", marca);
		System.out.printf("Preço de Custo: R$%.2f%n", custo);
		System.out.printf("Preço de Venda: R$%.2f%n", venda);
		System.out.printf("Lucro: R$%.2f%n", lucro());
	}

	// Método principal para testar a classe
	public static void main(String[] args) {
		// Criando objetos da classe Produto

		PRODUTO produto1 = new PRODUTO("Celular", "Iphone 7 plus", 2000.00f, 2700.00f);

		// Exibindo as informações e o lucro dos produtos
		System.out.println();
		produto1.exibirInformacoes();
	}

}
