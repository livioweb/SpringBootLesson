package br.com.ithappens.service;

import br.com.ithappens.mapper.ClienteMapper;
import br.com.ithappens.model.Cliente;
import br.com.ithappens.utils.exceptions.ClienteNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

  private ClienteMapper clienteMapper;

  public ClienteService(ClienteMapper clienteMapper) {
    this.clienteMapper = clienteMapper;
  }

  public List<Cliente> listarClientes() {
    List<Cliente> clientes = clienteMapper.buscaClientes();
    if (clientes == null || clientes.isEmpty()) {
      throw new ClienteNotFoundException("Sem cliente");
    }
    return clientes;
  }

  public boolean salvarCliente(Cliente cliente) {
    return clienteMapper.salvar(cliente);
  }


}
