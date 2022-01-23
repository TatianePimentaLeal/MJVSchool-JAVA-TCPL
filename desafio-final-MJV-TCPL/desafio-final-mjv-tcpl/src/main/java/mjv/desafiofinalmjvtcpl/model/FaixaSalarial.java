package mjv.desafiofinalmjvtcpl.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FaixaSalarial {
	
	@Column(length = 50)
	private Double valorMinimo;
	
	@Column(length = 50)
	private Double valorMaximo;

	public Double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(Double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public Double getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(Double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
	
	
}
