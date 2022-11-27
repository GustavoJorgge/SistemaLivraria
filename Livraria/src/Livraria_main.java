import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Livraria_main {

	public static void main(String[] args) {		
		Scanner ler = new Scanner (System.in);
		
		int aux=-1, deletar;		
		String nome, autor, genero;
		int cod=0;
				
		ArrayList<Livros> livros = new ArrayList(); // Criando a lista de Objetos
		
		for( int i = 0 ; aux != 5 ; i++ ) {
			aux = exibirMenu(aux);
			switch(aux) {			
				case 1: //CADASTRO				
					System.out.printf("Entre com o nome do livro:");
					nome = ler.nextLine();				
					System.out.printf("Entre com o autor:");
					autor = ler.nextLine();					
					System.out.printf("Entre com o genero do livro:");
					genero = ler.nextLine();					
					Livros u = new Livros();
					u.setNome(nome);
					u.setAutor(autor);
					u.setGenero(genero);
					u.setCod(cod);
					livros.add(u);	
					cod++;
					break;
				case 2: 					
					ConsultarLivro(livros); // Passando ArrayList como parametro para o metodo Consultar
					break;
				case 3:	// IMPRIMIR LISTA
					ListarLivros(livros);
					break;
				case 4:
					System.out.printf("--------DELETAR--------\n");
					System.out.printf("Digite o Cod do livro que deseja deletar:");
					deletar = ler.nextInt();
					
					for(int j = 0; j < livros.size() ; j++) {
						Livros livro1 = livros.get(j);
						if(livro1.getCod()== deletar) {
							livros.remove(deletar);	
							System.out.printf("Livro Deletado!\n");
						}else {
							System.out.printf("Não Possui Livro com o codigo\n");
						}
						}				
					break;							
				default:
			}//switch
		}//for
	}//main	
	static int exibirMenu(int aux) {			
			int escolha;
			Scanner ler = new Scanner(System.in);
			
			System.out.printf("-------MENU-------\n");
			System.out.printf("1 - CADASTRAR\n");
			System.out.printf("2 - CONSULTAR\n");
			System.out.printf("3 - LISTAR\n");		
			System.out.printf("4 - DELETAR\n");
			System.out.printf("5 - SAIR\n");
			System.out.printf("DIGITE SUA ESCOLHA:");
			
			escolha = ler.nextInt();
			
			return escolha;
	}//metodo para exibir o Menu
	
	
	static void ConsultarLivro(ArrayList livros) {
		Scanner ler = new Scanner (System.in);
		String consulta;		
		System.out.printf("Entre com o autor deseja consultar:");
		consulta = ler.nextLine();		
				
		for(int i = 0; i < livros.size() ; i++) {				
			if(((Livros) livros.get(i)).getAutor().toLowerCase().equals(consulta.toLowerCase())) {
				Livros livro1 = (Livros) livros.get(i);
				
				System.out.printf("Cod Livro: %d \n", livro1.getCod());
				System.out.printf("Nome: %s \n",livro1.getNome());
				System.out.printf("Autor: %s \n",livro1.getAutor());
				System.out.printf("Genero: %s \n",livro1.getGenero());
			}
		}
	}
	
	static void ListarLivros(ArrayList livros) {
		System.out.printf("--------LISTA--------\n");					
		for( int j = 0 ; j < livros.size(); j++) {						
			Livros temp = (Livros) livros.get(j);						
			System.out.printf("Cod Livro: %d \n", temp.getCod());
			System.out.printf("Nome: %s \n",temp.getNome());
			System.out.printf("Autor: %s \n",temp.getAutor());
			System.out.printf("Genero: %s \n",temp.getGenero());
		}
	}	
	
}//class
