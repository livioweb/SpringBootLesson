package br.com.ithappens.service;

import br.com.ithappens.mapper.EmpresaMapper;
import br.com.ithappens.model.Empresa;
import br.com.ithappens.utils.exceptions.EmpresaNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.HystrixCommands;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {

  private EmpresaMapper empresaMapper;

  @Autowired
  public EmpresaService(EmpresaMapper empresaMapper) {
    this.empresaMapper = empresaMapper;
  }

  public List<Empresa> empresas() {
    return empresaMapper.empresas();
  }

  public Boolean insertEmpresa(Empresa empresa) {
    return empresaMapper.InsertEmpresa(empresa);
  }

  public Boolean deleteEmpresa(Integer id) {
    return empresaMapper.DeleteEmpresa(id);
  }

  public Boolean updateEmpresa(Empresa empresa, Integer id) {
    return empresaMapper.UpdateEmpresa(empresa, id);
  }

}
