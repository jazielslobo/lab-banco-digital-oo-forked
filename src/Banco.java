import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome, List<Conta> contas) {
		this.nome = nome;
		if (contas != null) {
			this.contas = contas;
		} else {
			this.contas = new ArrayList();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public List<Conta> getContas(Cliente cliente) {
		return this.contas.stream()
                .filter(c -> c.getCliente().getNome().equals(cliente.getNome()))
                .collect(Collectors.toList());
	}

	public List<Conta> getContas(String nome) {
		return this.contas.stream()
                .filter(c -> c.getCliente().getNome().equals(nome))
                .collect(Collectors.toList());
	}

	public void addConta(Conta c) {
		this.contas.add(c);
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
