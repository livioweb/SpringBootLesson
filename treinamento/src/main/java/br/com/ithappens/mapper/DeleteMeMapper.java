package br.com.ithappens.mapper;

import br.com.ithappens.model.DeleteMe;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DeleteMeMapper {

  DeleteMe recuperar();

}