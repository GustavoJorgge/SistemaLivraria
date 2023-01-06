

public class Pessoa {
	
	public String nome;
	private String cpf;
	public int anoNasc;
	
	public Pessoa(String nome, int anoNasc) {
		
	}

	public String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getCpf() {
		return cpf;
	}
	
	void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	
	public int getAnoNasc() {
		return anoNasc;
	}
	
	void setAnoNasc(int AnoNasc) {
		this.anoNasc = anoNasc;
	}
}
