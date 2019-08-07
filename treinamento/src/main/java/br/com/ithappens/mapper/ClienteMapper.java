package br.com.ithappens.mapper;

import br.com.ithappens.model.Cliente;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClienteMapper {

  List<Cliente> buscaClientes();

  boolean salvar(@Param("cli") Cliente cliente);
}
