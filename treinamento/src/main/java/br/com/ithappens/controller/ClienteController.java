package br.com.ithappens.controller;

import br.com.ithappens.model.Cliente;
import br.com.ithappens.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

  private final ClienteService clienteService;

  public ClienteController(ClienteService clienteService) {
    this.clienteService = clienteService;
  }

  @GetMapping
  public ResponseEntity listarClientes() {
    List<Cliente> clientes = clienteService.listarClientes();
    return ResponseEntity.ok(clientes);
  }

  @PostMapping
  public ResponseEntity salvarCliente(@RequestBody Cliente cliente) {
    Boolean resultado = clienteService.salvarCliente(cliente);
    //String strResultado = resultado == true ? "Salvo com sucesso" : "Nao salvo";
    return ResponseEntity.ok(resultado);
  }

}
