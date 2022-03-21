import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GravarArquivo {
	FileWriter arquivo;
	public void criarArquivo(ArrayList<CadastrarClientes>  cadastrar) throws IOException {
		
		try {
			arquivo = new FileWriter("C:\\dados.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		gravarArquivo.printf("Dados dos correntistas "+"%n");
		
		for (CadastrarClientes c:cadastrar) {
		gravarArquivo.printf("ag: " +  c.getAgencia() + " conta: " +  c.getConta() + " nome: " +  c.getNome() + " email: " +  c.getEmail() + " telefone: " +  c.getTelefone() + " saldo: " +  c.getSaldo() + "\n");
		}
		arquivo.close();
		System.out.println("Arquivo gerado na unidade C:\\dados.txt");
	}
}