package br.com.ithappens.service;

import br.com.ithappens.model.Empresa;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpresaServiceTest {

  @Autowired
  EmpresaService empresaService;

  @Test
  public void getEmpresas() {
    List<Empresa> empresas = empresaService.empresas();
    empresas.forEach(System.out::println);
    Assertions.assertThat(empresas).size().isEqualTo(2);
  }

  @Test
  public void getEmpresa() {
    Empresa empresa = empresaService.empresa(1L);
    System.out.println(empresa);
  }

}
