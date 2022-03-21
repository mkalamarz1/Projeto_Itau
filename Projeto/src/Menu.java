import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CadastrarClientes> cadastrar = new ArrayList();
		int opcao;
		do {
		
		System.out.println("1 - Cadastrar Clientes");
		System.out.println("2 - Listar Clientes");
		System.out.println("3 - Gravar em arquivo texto");
		System.out.println("4 - Consultar arquivo texto");
		System.out.println("5 - Sair");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a opção desejada");
		opcao=entrada.nextInt();
		
		switch(opcao) {
		case 1:
			CadastrarClientes criar = new CadastrarClientes();
			try {
				System.out.println("Qual é o número da sua agência? ");
				criar.setAgencia(entrada.nextInt());
				
				System.out.println("Qual é o número da conta? ");
				criar.setConta(entrada.nextInt());
				
				System.out.println("Qual é o seu nome? ");
				criar.setNome(entrada.next());
				
				System.out.println("Qual é o seu e-mail? ");
				criar.setEmail(entrada.next());
				
				System.out.println("Seu número contato? ");
				criar.setTelefone(entrada.nextLong());
				
				System.out.println("Quantos saldo");
				criar.setSaldo(entrada.nextDouble());
				
				cadastrar.add(criar);
			}catch(InputMismatchException errorString) {
				System.out.println("");
				System.out.println("Não pode o nome completo. Digite apenas o primeiro nome");
				System.out.println("");
			}			
			break;
			
		case 2:
			ListarClientes lista = new ListarClientes();
			lista.listar(cadastrar);
			break;
			
		case 3:
			GravarArquivo grava = new GravarArquivo();
			try {
				grava.criarArquivo(cadastrar);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
		case 4:
			ConsultarArquivo cons = new ConsultarArquivo();
			cons.consulta();
			break;
			
		case 5:
			System.out.println("Sair");
			break;
			
		default:
			System.out.println("Opção inválida");
		}
	
	}while(opcao<5 ||opcao==0||opcao>5);

	}

}
