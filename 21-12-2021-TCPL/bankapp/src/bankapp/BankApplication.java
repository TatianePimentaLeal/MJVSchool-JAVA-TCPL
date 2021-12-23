package bankapp;

import bankapp.model.Conta;
import bankapp.repository.ContaRepository;
import bankapp.service.ContaService;

public class BankApplication {
	public static void main(String[] args) {
		exemplo2();
	}
	private static void exemplo2() {
		ContaRepository repository = new ContaRepository();
		
		Conta contaGleyson = new Conta();
		contaGleyson.setNomeCorrentista("GLEYSON");
		contaGleyson.setNumero("7688-9");
		repository.adicionarConta(contaGleyson);
		
		Conta contaDani = new Conta();
		contaDani.setNomeCorrentista("DANI SANTOS");
		contaDani.setNumero("1287-5");
		
		repository.adicionarConta(contaDani);
		
		Conta [] contas = repository.getContas();
		for(int i=0; i< contas.length ; i=i+1 ) {
			
			Conta contAtual = contas[i];
			System.out.println(contAtual);
		
		}
	}
	private static void exemplo1() {
		Conta contaGleyson = new Conta();
		
		System.out.println(contaGleyson);
		
		ContaService terminal = new ContaService();
		terminal.depositar(contaGleyson, 50.0);
		System.out.println("Saldo Atual:" +contaGleyson.getSaldo());
		
		terminal.sacar(contaGleyson, 10.0);
		terminal.sacar(contaGleyson, 12.0);
		terminal.depositar(contaGleyson, 7.0);
		
		terminal.exibirExtrato(contaGleyson);
		
		System.out.println("Novo Atual:" +contaGleyson.getSaldo());
	}
}
