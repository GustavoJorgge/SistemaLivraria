import java.util.Scanner;
public class Livraria_main {

	public static void main(String[] args) {		
		Livros livro = new Livros();//nom_Livro -> objeto
		
		int aux=0;
		int ind=0;
		String nome, autor, genero;		
		Scanner ler = new Scanner (System.in);
		//Declaração e instanciação/iniciação do objeto		
		
		
		
		
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
					
					livro.setNome(nome); //recebendo nomes
					livro.setAutor(autor);//recebendo autor
					livro.setGenero(genero);// recebendo tema	
					break;
				case 2:
					break;
				case 3:		
					System.out.printf("--------LISTA--------\n");
					System.out.printf("Titulo: %s\n",livro.getNome());
					System.out.printf("Autor: %s\n",livro.getAutor());
					System.out.printf("Genero: %s\n",livro.getGenero());
					break;
				case 4:
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
			System.out.printf("4 - SAIR\n");
			System.out.printf("DIGITE SUA ESCOLHA:");
			
			escolha = ler.nextInt();
			
			return escolha;
	}//metodo
			
}//class
