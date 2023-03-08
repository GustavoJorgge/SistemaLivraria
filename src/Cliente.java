/*
 * Beneficios da herança
 * Evita repetição de codigo
 * Facilita a manutenção do programa
 * ------------------------------------
 * Quando uma classe herda de outra classe ela ganha
 * todos os atributos e metodos da classe herdada
 */
public class Cliente extends Pessoa{	
	
	private int cod;
	
	public Cliente(String nome, int anoNasc, int cod) {
		super(nome, anoNasc);
		this.cod = cod;
	}
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
}
