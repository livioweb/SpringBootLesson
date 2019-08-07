package br.com.ithappens.mapper;

import br.com.ithappens.model.Empresa;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpresaMapper {

  List<Empresa> empresas();

  Boolean InsertEmpresa(@Param("empresa") Empresa empresa);

  Boolean DeleteEmpresa(Integer id);

  Boolean UpdateEmpresa(@Param("empresa") Empresa empresa, Integer id);
}
