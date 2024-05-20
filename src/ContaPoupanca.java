
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, char tipo) {
		super(cliente, 'P');
	}

	public ContaPoupanca(Cliente cliente) {
		super(cliente, 'P');
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
