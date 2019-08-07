package br.com.ithappens.mapper;

import br.com.ithappens.model.Endereco;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EnderecoMapper {

  List<Endereco> buscarEnderecos(@Param("cliente") Long idCliente);

}
