import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ConsultarArquivo {
	public void consulta() {
		
		String mostra="";
		String nomeArq="C:\\dados.txt"; 
		String linha="";
		
		File arq = new File(nomeArq);
		
		if(arq.exists()) {
			mostra="Arquivo -"+nomeArq+" aberto com sucesso";
			mostra+=" tamanho do arquivo "+Long.toString(arq.length())+" bytes";
			System.out.println(mostra);
			
			try {
				FileReader reader = new FileReader(nomeArq);
				BufferedReader leitor = new BufferedReader(reader);
				
				while(true) {
					linha=leitor.readLine();
					System.out.println(linha);
					if(linha==null)
						break;
				}
			} catch (Exception erro) {
				System.out.println(mostra+"arquivo");
			}
			
		}
	}	
}


