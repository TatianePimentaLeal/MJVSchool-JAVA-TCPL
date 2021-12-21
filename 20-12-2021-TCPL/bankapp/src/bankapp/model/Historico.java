package bankapp.model;

public class Historico {
	private String data;
	private Double valor;
	private String tipoOperacao;
	
	public Historico(String data, Double valor, String tipoOperacao) {
		super();
		this.data = data;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	
}
