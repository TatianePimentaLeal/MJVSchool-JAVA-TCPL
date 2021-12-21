package class_diagram_TCPL;

public class Cadastro {
	private int id;
	private String cpf;
	private String nome;
	private String email;
	private String aniversario;
	private String foto;
	public Cadastro(int id, String cpf, String nome, String email, String aniversario, String foto) {
		
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
		this.foto = foto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", aniversario="
				+ aniversario + ", foto=" + foto + "]";
	}
	
}
