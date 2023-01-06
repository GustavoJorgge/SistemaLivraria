import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
public class Livraria_main {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner (System.in);		
		int aux=-1;		
		String nome, autor, genero;
		int cod=1,resp=0;
		double valor;
				
		ArrayList<Livros> livros = new ArrayList(); // Criando a lista de Objetos
		ArrayList<Cliente> clientes = new ArrayList();
		
		do {
			aux = -1;
			aux = exibirMenu(aux);
			switch(aux) {			
				case 1: //CADASTRO				
					System.out.printf("Entre com o nome do livro:");
					nome = ler.nextLine();				
					System.out.printf("Entre com o autor:");
					autor = ler.nextLine();					
					System.out.printf("Entre com o genero do livro:");
					genero = ler.nextLine();
					System.out.printf("Entre com o valor do livro:");
					valor = ler.nextDouble();
					Livros u = new Livros();
					u.setNome(nome);
					u.setAutor(autor);
					u.setGenero(genero);
					u.setCod(cod);
					u.setValor(valor);
					livros.add(u);	
					cod++;
					ler = new Scanner (System.in);
					break;
				case 2:
					CadastrarCliente(clientes);
					break;
				case 3: 					
					ConsultarAutor(livros); // Passando ArrayList como parametro para o metodo Consultar
					break;
				case 4:
					ConsultarTitulo(livros);
					break;
				case 5:	// IMPRIMIR LISTA
					ListarLivros(livros);
					break;
				case 6:
					ListarClientes(clientes);
					break;
				case 7:
					DeletarLivro(livros);			
					break;
				case 8:
					System.out.printf("Até mais!!");
				default:
			}//switch 
		}while(aux!=8);//for
	}//main	
	static int exibirMenu(int aux) {			
			int escolha;
			Scanner ler = new Scanner(System.in);
			
			System.out.printf("-------MENU-------\n");
			System.out.printf("1 - CADASTRAR LIVRO\n");
			System.out.printf("2 - CADASTRAR CLIENTE\n");
			System.out.printf("3 - CONSULTAR POR AUTOR\n");
			System.out.printf("4 - CONSULTAR POR TITULO\n");			
			System.out.printf("5 - LISTAR TODOS OS LIVROS\n");	
			System.out.printf("6 - LISTAR TODOS OS CLIENTES\n");			
			System.out.printf("7 - DELETAR LIVRO\n");
			System.out.printf("8 - SAIR\n");
			System.out.printf("DIGITE SUA ESCOLHA:");			
			escolha = ler.nextInt();
			
			return escolha;
	}//metodo para exibir o Menu
		
	static void ConsultarAutor(ArrayList livros) {
		System.out.printf("--------CONSULTA--------\n");	
		Scanner ler = new Scanner (System.in);
		String consulta;		
		System.out.printf("Entre com o autor deseja consultar:");
		consulta = ler.nextLine();		
				
		for(int i = 0; i < livros.size() ; i++) {
			//Verificando se o autor digitado esta na lista
			//Utilizei a funcao toLowerCase para ignorar letras maiusculas e pesquisar com mais assertividade
			if(((Livros) livros.get(i)).getAutor().toLowerCase().equals(consulta.toLowerCase())) {
				Livros temp = (Livros) livros.get(i);				
				System.out.printf("Cod Livro: %d \n", temp.getCod());
				System.out.printf("Nome: %s \n",temp.getNome());
				System.out.printf("Autor: %s \n",temp.getAutor());
				System.out.printf("Genero: %s \n",temp.getGenero());
				System.out.printf("Preco: %.2f\n",temp.getValor());
			}
		}
	}
	
	static void ConsultarTitulo(ArrayList livros) {
		System.out.printf("--------CONSULTA--------\n");	
		Scanner ler = new Scanner (System.in);
		String consulta;		
		System.out.printf("Entre com o Nome do livro deseja consultar:");
		consulta = ler.nextLine();		
				
		for(int i = 0; i < livros.size() ; i++) {
			//Verificando se o autor digitado esta na lista
			//Utilizei a funcao toLowerCase para ignorar letras maiusculas e pesquisar com mais assertividade
			if(((Livros) livros.get(i)).getNome().toLowerCase().equals(consulta.toLowerCase())) {
				Livros temp = (Livros) livros.get(i);				
				System.out.printf("Cod Livro: %d \n", temp.getCod());
				System.out.printf("Nome: %s \n",temp.getNome());
				System.out.printf("Autor: %s \n",temp.getAutor());
				System.out.printf("Genero: %s \n",temp.getGenero());
				System.out.printf("Preco: %.2f\n",temp.getValor());
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
			System.out.printf("Preco: %.2f \n",temp.getValor());			
		}
	}	
	
	static void DeletarLivro(ArrayList livros) {
		int deletar;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf("--------DELETAR--------\n");
		System.out.printf("Digite o Cod do livro que deseja deletar:");
		deletar = ler.nextInt();
		
		for(int i = 0; i <livros.size() ; i++) {
			Livros temp = (Livros)livros.get(i);
			if(deletar == temp.getCod()) {
				System.out.printf("O livro %s foi Deletado!\n",temp.getNome());
				livros.remove(i);					
			}else if(i==livros.size()){
				System.out.printf("Não Possui Livro com o codigo citado!\n");
			}else {				
			}
			}
	}
	
	static void CadastrarCliente(ArrayList clientes) {
		Scanner ler = new Scanner(System.in);
		String nome;		
		int anoNasc, cod;
		
		ler = new Scanner(System.in);//limpando buffer
		System.out.printf("Entre com o nome do cliente:");
		nome = ler.nextLine();
		ler = new Scanner(System.in);//limpando buffer
		System.out.printf("Entre com ano de Nascimento:");
		anoNasc = ler.nextInt();
		Cliente u = new Cliente(nome, anoNasc, anoNasc);
		u.setNome(nome);
		u.setAnoNasc(anoNasc);
		u.setCod(+1);
		clientes.add(u);
		
	}

	static void ListarClientes(ArrayList clientes) {
		System.out.printf("--------LISTA CLIENTE--------\n");					
		for( int j = 0 ; j < clientes.size(); j++) {						
			Cliente temp = (Cliente) clientes.get(j);						
			System.out.printf("COD: %s \n",temp.getCod());			
			System.out.printf("Nome: %s \n",temp.getNome());
			System.out.printf("Ano de nascimento: %d \n",temp.getAnoNasc());			
		}
	}
}//class
