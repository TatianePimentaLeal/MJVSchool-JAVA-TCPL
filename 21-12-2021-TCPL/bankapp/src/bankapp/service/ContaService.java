package bankapp.service;

import bankapp.model.Conta;
import bankapp.model.Historico;

public class ContaService {
	public void depositar (Conta conta, double valorDepositado ) {
		conta.setSaldo(conta.getSaldo() + valorDepositado);
		conta.getHistoricos().add(new Historico("20/12", valorDepositado, "DEPOSITO"));
	}
	public void sacar (Conta conta, double valorDepositado ) {
		conta.setSaldo(conta.getSaldo() - valorDepositado);
		conta.getHistoricos().add(new Historico("20/12", valorDepositado, "SAQUE"));
	}
	public void exibirExtrato(Conta conta) {
		System.out.println("Exibindo histórico da conta: xxxx");
		for(Historico hst: conta.getHistoricos()) {
			System.out.println(hst.getData() 
					+ "-" + hst.getTipoOperacao()
					+ "-" + hst.getValor());
		}
	}
}
