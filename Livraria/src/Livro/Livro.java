package Livro;

public class Livro {
	private String nom_Livro;
	private int cod_Livro;
	private String nom_autor;
	private String tema;
	
	public Livro(String nom_Livro, int cod_Livro, String nom_autor, String tema) {
		super();
		this.nom_Livro = nom_Livro;
		this.cod_Livro = cod_Livro;
		this.nom_autor = nom_autor;
		this.tema = tema;
	}

	public String getNom_Livro() {
		return nom_Livro;
	}

	public void setNom_Livro(String nom_Livro) {
		this.nom_Livro = nom_Livro;
	}

	public int getCod_Livro() {
		return cod_Livro;
	}

	public void setCod_Livro(int cod_Livro) {
		this.cod_Livro = cod_Livro;
	}

	public String getNom_autor() {
		return nom_autor;
	}

	public void setNom_autor(String nom_autor) {
		this.nom_autor = nom_autor;
	}
	
	
}
