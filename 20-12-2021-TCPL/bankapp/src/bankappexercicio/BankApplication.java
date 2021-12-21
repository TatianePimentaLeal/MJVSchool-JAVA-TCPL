package bankappexercicio;

import bankapp.model.Conta;
import bankapp.service.ContaService;

public class BankApplication {

	public static void main(String[] args) {
		
		Conta contaLucca = new Conta();
		Conta contaDominic = new Conta();
		Conta contaMayara = new Conta();
		
		//ContaService terminal = new ContaService();
		
		//terminal.depositar(contaLucca, 50.0);
		//terminal.depositar(contaDominic, 40.0);
		//terminal.depositar(contaMayara, 70.0);
		
		//System.out.println(contaLucca.getSaldo());
		//System.out.println(contaDominic.getSaldo());
		//System.out.println(contaMayara.getSaldo());
		
		ContaService terminal = new ContaService();
		terminal.sacar(contaLucca, 20.0);
		terminal.sacar(contaDominic, 60.0);
		terminal.sacar(contaMayara, 100.0);
		
		System.out.println(contaLucca.getSaldo());
		System.out.println(contaDominic.getSaldo());
		System.out.println(contaMayara.getSaldo());


	}

}
