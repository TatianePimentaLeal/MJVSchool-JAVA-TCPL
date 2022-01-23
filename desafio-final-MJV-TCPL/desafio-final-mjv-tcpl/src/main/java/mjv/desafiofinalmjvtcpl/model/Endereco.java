package mjv.desafiofinalmjvtcpl.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	@Column(length = 50)
	private String logradouro;
	
	@Column(length = 10)
	private String numero;
	
	@Column(length = 50)
	private String bairro;
	
	@Column(length = 50)
	private String cidade;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
