package br.com.ithappens.controller;

import br.com.ithappens.model.Empresa;
import br.com.ithappens.service.EmpresaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/empresas")
@AllArgsConstructor
public class EmpresaController {

  EmpresaService empresaService;

  @GetMapping
  public ResponseEntity empresas() {
    List<Empresa> empresas = empresaService.empresas();
    return ResponseEntity.ok(empresas);
  }


  @PostMapping
  public ResponseEntity empresas(@RequestBody Empresa empresa) {

    //System.out.println("Passei Aqui" + empresa.getNome());
    //log.debug("Passei Aqui" + empresa.getNome());

    empresaService.insertEmpresa(empresa);
    return ResponseEntity.ok("OK");

  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity empresas(@PathVariable Integer id) {
    Boolean deletou = empresaService.deleteEmpresa(id);
    if (deletou) {
      return ResponseEntity.ok("OK");
    }
    return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Erro ao deletar");
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity empresas(@RequestBody Empresa empresa, @PathVariable Integer id) {

    Boolean alterou = empresaService.updateEmpresa(empresa, id);
    return ResponseEntity.ok("Empresa" + empresa);
  }


}
