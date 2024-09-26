package banco;

import java.util.List;

public class Banco {
	
	private String nome;
	List<Conta> contas;

	public Banco(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}