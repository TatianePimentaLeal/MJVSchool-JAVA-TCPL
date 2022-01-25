package mjv.desafiofinalmjvtcpl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_telefone")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String telefone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Telefone(Integer id, String telefone) {
		this.id = id;
		this.telefone = telefone;
	}
	
	public Telefone() {

	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", telefone=" + telefone + "]";
	}


	
	
}
