
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, char tipo) {
		super(cliente,'C');
	}
	
	public ContaCorrente(Cliente cliente) {
		super(cliente,'C');
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
