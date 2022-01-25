package mjv.desafiofinalmjvtcpl.model;

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
	
	private String profissao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Profissao(Integer id, String profissao) {
		this.id = id;
		this.profissao = profissao;
	}

	public Profissao() {

	}

	@Override
	public String toString() {
		return "Profissao [id=" + id + ", profissao=" + profissao + "]";
	}

	
}
