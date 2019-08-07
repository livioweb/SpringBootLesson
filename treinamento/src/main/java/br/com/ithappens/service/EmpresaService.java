package br.com.ithappens.service;

import br.com.ithappens.mapper.EmpresaMapper;
import br.com.ithappens.model.Empresa;
import br.com.ithappens.utils.exceptions.EmpresaNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmpresaService {

  private List<Empresa> empresas;

  @Autowired
  public EmpresaService(EmpresaMapper empresaMapper) {
    empresas = new ArrayList<>();
    Empresa e = new Empresa(1L, "12345678978945", "Qualquer razao");
    Empresa e2 = new Empresa(2L, "0000000000", "Outra razao");
    empresas.add(e);
    empresas.add(e2);
  }

  public List<Empresa> empresas() {
    return empresas;
  }

  public Empresa empresa(Long id) {
    Empresa empresa = empresas.stream().filter(e -> id.equals(e.getId())).findFirst().orElse(null);
    if (empresa == null) {
      throw new EmpresaNotFoundException("Nao achou a empresa......");
    }
    return empresa;
  }

  public void add(Empresa empresa) {
    this.empresas.add(empresa);
    empresas.forEach(System.out::println);
  }
}
