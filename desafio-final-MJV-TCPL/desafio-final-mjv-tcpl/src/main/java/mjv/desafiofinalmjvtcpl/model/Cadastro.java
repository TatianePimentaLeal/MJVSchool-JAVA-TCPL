package mjv.desafiofinalmjvtcpl.model;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, length = 20)
	private String cpf;
		
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataNascimento;
	
	private String telefone;
	
	private String profissao;
		
	@Enumerated
	private Escolaridade escolaridade;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride( name = "logradouro", column = @Column(name = "logradouro")),
		@AttributeOverride( name = "numero", column = @Column(name = "numero")),
		@AttributeOverride( name = "bairro", column = @Column(name = "bairro")),
		@AttributeOverride( name = "cidade", column = @Column(name = "cidade"))
	})
	private Endereco endereco;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cadastro(Integer id, String nome, String cpf, LocalDate dataNascimento, String telefone, String profissao,
			Escolaridade escolaridade, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.profissao = profissao;
		this.escolaridade = escolaridade;
		this.endereco = endereco;
	}

	public Cadastro() {

	}

	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", profissao=" + profissao + ", escolaridade=" + escolaridade
				+ ", endereco=" + endereco + "]";
	}
	
	
}

