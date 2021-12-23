package bankapp.model;

public class Historico {
	private String data;
	private Double valor;
	private String tipoOperacao;
	
	public Historico() {
		
	}
	
	public Historico(String data, Double valor, String tipoOperacao) {
		this.data = data;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
	}
	public String getData() {
		return data;
	}
	public Double getValor() {
		return valor;
	}
	public String getTipoOperacao() {
		return tipoOperacao;
	}
	
	
	
	//20/12/21-SAQUE-100
	//20/12/21-DEPOSITO-50
	//20/12/21-TRANSFERENCIA-30
	
	
}
