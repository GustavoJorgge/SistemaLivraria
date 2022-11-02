public class Livros {		
	String nome;	
	String autor;
	String tema;	
	
	Livros(){
		
	}
	
	Livros(String nome, String autor, String tema){
		this.nome = nome;
		this.autor = autor;
		this.tema = tema;
	}	

	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getNome() {
		return nome;
	}
	
	void setAutor(String autor) {
		this.autor = autor;
	}
	
	String getAutor() {
		return autor;
	}
	
	void setTema(String tema) {
		this.tema = tema;
	}
	
	String getTema() {
		return tema;
	}		
	
}
