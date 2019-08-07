package br.com.ithappens.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Endereco {
  @JsonIgnore
  private String bairro;
  private String logradouro;
}
