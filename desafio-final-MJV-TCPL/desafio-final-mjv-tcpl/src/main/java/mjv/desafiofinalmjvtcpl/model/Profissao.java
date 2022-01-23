package mjv.desafiofinalmjvtcpl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_profissao")
public class Profissao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nomeProfissao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeProfissao() {
		return nomeProfissao;
	}

	public void setNomeProfissao(String nomeProfissao) {
		this.nomeProfissao = nomeProfissao;
	}
	
	
}
