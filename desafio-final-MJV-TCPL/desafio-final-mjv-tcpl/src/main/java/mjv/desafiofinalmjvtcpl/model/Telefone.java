package mjv.desafiofinalmjvtcpl.model;

import javax.persistence.Column;
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
	
	@Column(name = "DDD", nullable = false, length = 5)
	private Integer ddd;
	
	@Column(name = "numero_tel", nullable = false, length = 12)
	private Integer numeroTel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(Integer numeroTel) {
		this.numeroTel = numeroTel;
	}
	
	
}
