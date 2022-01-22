package mjv.spring.jpa.rest.model;

import javax.persistence.CascadeType;
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
	
	@Column(name = "cpf_cnpj", nullable = false, length = 20)
	private String cpfCnpj;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "sx", columnDefinition = "char(1)")
	private Sexo sexo;
	
	@Embedded
	private Endereco endereco;
	
	@ManyToOne()
	@JoinColumn(name = "prof_id")
	private Profissao profissao;
		
	@Embedded
	private Telefone telefone;

	@Enumerated(EnumType.STRING)
	@Column(name = "tel_tipo", columnDefinition = "char(8)")
	private TelefoneTipo telefoneTipo;
	
	//@Column(name = "emails", nullable = true, length = 50)
	//private String emails;
	
	
	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	//public String getEmails() {
		//return emails;
	//}

	//public void setEmails(String emails) {
		//this.emails = emails;
	//}

}
