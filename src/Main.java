import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		// Criando objetos da classe Pessoa usando diferentes construtores

		// Usando o construtor completo
		PESSOA pessoa1 = new PESSOA();
		pessoa1.setnome("João");
		pessoa1.setsobrenome("Oliveira");
		pessoa1.setaltura(1.68);
		pessoa1.setdt_nascimento(LocalDate.of(1990, 3, 15));
		pessoa1.setemail("joao.oliveira@email.com");

		System.out.println("Nome " + pessoa1.getnome());
		System.out.println("Sobrenome: " + pessoa1.getsobrenome());
		System.out.println("Altura: " + pessoa1.getaltura());
		System.out.println("Data de Nacimento: " + pessoa1.getdt_nascimento());
		System.out.println("Email: " + pessoa1.getemail());
	}
}
