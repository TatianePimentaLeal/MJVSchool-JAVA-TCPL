package mjv.desafiofinalmjvtcpl.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	//@Column
	//private String email;
	
	@Column(name = "cpf_cnpj", nullable = false, length = 20)
	private String cpf;
		
	@Column(name = "data_nasc", length = 15)
	private LocalDate dataNascimento;
	
	@ManyToOne()
	@JoinColumn(name = "telefone_id")
	private Telefone telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tel_tipo", columnDefinition = "char(8)")
	private TelefoneTipo telefoneTipo;
	//MANTIDO O STRING DEVIDO AO ORDINAL NAO PERMITIR MUDANÇA DA ORDEM DOS ENUMS, NEM DEIXA INSERIR ENUMS NO MEIO DA LISTA SE NECESSARIO
	
	@ManyToOne()
	@JoinColumn(name = "profissao_id")
	private Profissao profissao;
	
	@Embedded
	private FaixaSalarial faixaSalarial;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gênero", columnDefinition = "char(1)")
	private Sexo sexo;
	//MANTIDO O STRING DEVIDO AO ORDINAL NAO PERMITIR MUDANÇA DA ORDEM DOS ENUMS, NEM DEIXA INSERIR ENUMS NO MEIO DA LISTA SE NECESSARIO
	
	@Enumerated
	private Escolaridade escolaridade;
	
	@Embedded
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

	//public String getEmail() {
	//return email;
	//}

	//public void setEmail(String email) {
	//this.email = email;
	//}

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

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public TelefoneTipo getTelefoneTipo() {
		return telefoneTipo;
	}

	public void setTelefoneTipo(TelefoneTipo telefoneTipo) {
		this.telefoneTipo = telefoneTipo;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public FaixaSalarial getFaixaSalarial() {
		return faixaSalarial;
	}

	public void setFaixaSalarial(FaixaSalarial faixaSalarial) {
		this.faixaSalarial = faixaSalarial;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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

	public Cadastro(Integer id, String nome, String cpf, LocalDate dataNascimento, Telefone telefone,
			TelefoneTipo telefoneTipo, Profissao profissao, FaixaSalarial faixaSalarial, Sexo sexo,
			Escolaridade escolaridade, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.telefoneTipo = telefoneTipo;
		this.profissao = profissao;
		this.faixaSalarial = faixaSalarial;
		this.sexo = sexo;
		this.escolaridade = escolaridade;
		this.endereco = endereco;
	}
	
	public Cadastro() {
		
	}

	public Cadastro(Object id2, String nome2, String cpf2, Object dataNascimento2, int i, Object telefoneTipo2,
			String string, int j, Object sexo2, Object escolaridade2, Object endereco2) {
		// TODO Auto-generated constructor stub
	}
}

