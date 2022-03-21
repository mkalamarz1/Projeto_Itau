import java.util.ArrayList;

public class ListarClientes {
	
	public void listar(ArrayList<CadastrarClientes> cadastrar) {
		for (CadastrarClientes cad : cadastrar ) {
			System.out.println("ag: " + cad.getAgencia() + " conta: " + cad.getConta() + " nome: " + cad.getNome() + " email: " + cad.getEmail() + " telefone: " + cad.getTelefone() + " saldo: " + cad.getSaldo());
		}
	}

}
