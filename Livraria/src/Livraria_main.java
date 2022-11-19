import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Livraria_main {

	public static void main(String[] args) {		
		Scanner ler = new Scanner (System.in);
		
		int aux=-1;		
		String nome, autor, genero;
		int cod=0001;
				
		ArrayList<Livros> livros = new ArrayList(); // Criando a lista de Objetos
				
		for( int i = 0 ; aux != 4 ; i++ ) {
			aux = exibirMenu(aux);
			switch(aux) {			
				case 1:						
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
					break;
				case 3:		
					System.out.printf("--------LISTA--------\n");					
					for( int j = 0 ; j < livros.size(); j++) {						
						Livros temp = livros.get(j);
						System.out.printf("Cod Livro: %d \n", temp.getCod());
						System.out.printf("Nome: %s \n",temp.getNome());
						System.out.printf("Autor: %s \n",temp.getAutor());
						System.out.printf("Genero: %s \n",temp.getGenero());
					}
					break;
				case 4:
					break;
							
				default:
			}//switch
		}//for
	}//main
	
	//metodo para exibir o menu
	static int exibirMenu(int aux) {
			
			int escolha;
			Scanner ler = new Scanner(System.in);
			
			System.out.printf("-------MENU-------\n");
			System.out.printf("1 - CADASTRAR\n");
			System.out.printf("2 - CONSULTAR\n");
			System.out.printf("3 - LISTAR\n");		
			System.out.printf("4 - SAIR\n");
			System.out.printf("DIGITE SUA ESCOLHA:");
			
			escolha = ler.nextInt();
			
			return escolha;
	}//metodo para exibir o Menu
	
	static void ListarLivros() {
		
	}
}//class
