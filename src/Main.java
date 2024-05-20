import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco("Banco Santander", new ArrayList<Conta>());

		Cliente cliente = new Cliente("Venilton");

		Conta cc = new ContaCorrente(cliente);
		Conta poupanca1 = new ContaPoupanca(cliente);

		cliente = new Cliente("Jaziel");
		Conta poupanca = new ContaPoupanca(cliente);

		banco.addConta(cc);
		banco.addConta(poupanca1);
		banco.addConta(poupanca);

		for (Conta c : banco.getContas()) {
			c.imprimirExtrato();
		}

		cc.depositar(100);
		cc.transferir(100, poupanca);

		for (Conta c : banco.getContas()) {
			c.imprimirExtrato();
		}

		System.out.println(String.format("CONTAS DO CLIENTE:  %s", "Jaziel"));
		for (Conta c : banco.getContas("Jaziel")) {
			c.imprimirExtrato();
		}

		System.out.println(String.format("CONTAS DO CLIENTE:  %s", "Venilton"));
		for (Conta c : banco.getContas("Venilton")) {
			c.imprimirExtrato();
		}

	}

}
