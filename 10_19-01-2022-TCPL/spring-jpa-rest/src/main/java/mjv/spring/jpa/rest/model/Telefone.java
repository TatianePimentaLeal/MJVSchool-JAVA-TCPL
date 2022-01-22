package mjv.spring.jpa.rest.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//ao tentar fazer um Entity e Table, como Entity exige um @Id e não precisava no requisito eu fiz um embeddable

@Embeddable
public class Telefone {
	
	@Column(name = "DDD", nullable = false, length = 5)
	private Integer ddd;
	
	@Column(name = "telefone", nullable = false, length = 12)
		private Integer numero;

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
