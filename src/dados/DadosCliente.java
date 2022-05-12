package dados;

import java.util.ArrayList;
import java.util.List;

import modelagem.Funcionario;
import modelagem.Cliente;

public class DadosCliente {

	//Array que contem todos os clientes.
	public List<Cliente> banco_clientes = new ArrayList<>();
	
	//Array que contem todos os funcionarios.
	public List<Funcionario> banco_funcionarios = new ArrayList<>();
	
	//Fun��o para adicionar todo novo funcionario na lista.
	public void armazenar_cliente (Funcionario funcionario) {
		banco_funcionarios.add(funcionario);
	}
	
	//Fun��o para adicionar todo novo cliente.
	public void armazenar_funcionario (Cliente cliente) {
		banco_clientes.add(cliente);
	}

	public List<Cliente> findAll() {
		Cliente cliente = null;
		List<String> clientes = new ArrayList<>();
		for(int i=0; i < banco_clientes.size(); i++) {
			cliente = banco_clientes.get(i);
			clientes.add({cliente.getNome(), cliente.getEmail()});
		}
		cliente = banco_cliente.get();
		return banco_clientes;
	}

}
