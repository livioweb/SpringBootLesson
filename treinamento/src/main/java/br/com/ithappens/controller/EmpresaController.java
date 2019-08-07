package br.com.ithappens.controller;

import br.com.ithappens.model.Empresa;
import br.com.ithappens.service.EmpresaService;
import br.com.ithappens.utils.exceptions.EmpresaNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

  @GetMapping(value = "/{id}")
  public ResponseEntity empresa(@PathVariable("id") Long id) {
    Empresa empresa = empresaService.empresa(id);
    return ResponseEntity.ok(empresa);
  }

  @PostMapping
  public ResponseEntity addEmpresa(@RequestBody Empresa empresa) {
    empresaService.add(empresa);
    return ResponseEntity.ok().build();
  }


}
