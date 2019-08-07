package br.com.ithappens.controller;

import br.com.ithappens.service.EmpresaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
@AllArgsConstructor
public class EmpresaController {

  EmpresaService empresaService;

  @GetMapping
  public ResponseEntity empresas(){

  }


}
