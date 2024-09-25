import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PESSOA {
	// ATRIBUTOS
	public String nome; // Nome da pessoa
	public double altura; // Altura da pessoa em metros
	public LocalDate dt_nascimento; // Data de nascimento da pessoa
	public String email; // Email da pessoa
	public String sobrenome; // Sobrenome da pessoa

	// Construtor padrão sem parâmetros
	public PESSOA() {
	}

	// Construtor completo que inicializa todos os atributos
	public PESSOA(String nome, double altura, String email, LocalDate dt_Nascimento, String sobrenome) {
		this.nome = nome; // Inicializa o nome
		this.altura = altura; // Inicializa a altura
		this.dt_nascimento = dt_nascimento; // Inicializa a data de nascimento
		this.email = email; // Inicializa o email
		this.sobrenome = sobrenome; // Inicializa o sobrenome
	}

	// Construtor que recebe apenas o nome
	public PESSOA(String nome) {
		this.nome = nome; // Inicializa o nome
		this.sobrenome = ""; // Sobrenome inicialmente vazio
		this.altura = 0; // Altura padrão é 0
		this.dt_nascimento = null; // Data de nascimento inicialmente nula
		this.email = emailInserido(); // Chamando o método para atribuir um email padrão
	}

	// Método que retorna um email padrão
	public String emailInserido() {
		return "email@exemplo.com"; // Substitua por uma lógica real se necessário
	}

	// Métodos getters e setters para acessar e modificar os atributos

	// Getter para nome
	public String getnome() {
		return nome; // Retorna o nome
	}

	// Setter para nome
	public void setnome(String nome) {
		this.nome = nome; // Define o nome
	}

	// Getter para sobrenome
	public String getsobrenome() {
		return sobrenome; // Retorna o sobrenome
	}

	// Setter para sobrenome
	public void setsobrenome(String sobrenome) {
		this.sobrenome = sobrenome; // Define o sobrenome
	}

	// Getter para altura
	public double getaltura() {
		return altura; // Retorna a altura
	}

	// Setter para altura
	public void setaltura(double altura) {
		this.altura = altura; // Define a altura
	}

	// Getter para data de nascimento
	public LocalDate getdt_nascimento() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Formata a data de nascimento se não for nula
		String dt_nascFormatada = (dt_nascimento != null) ? dt_nascimento.format(formatter) : "Não informada";
		return dt_nascimento; // Retorna a data de nascimento
	}

	// Setter para data de nascimento
	public void setdt_nascimento(LocalDate dt_nascimento) {
		this.dt_nascimento = dt_nascimento; // Define a data de nascimento
	}

	// Getter para email
	public String getemail() {
		return email; // Retorna o email
	}

	// Setter para email
	public void setemail(String email) {
		this.email = email; // Define o email
	}
}
