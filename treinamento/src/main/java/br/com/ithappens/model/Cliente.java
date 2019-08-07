package br.com.ithappens.model;

import lombok.Data;

import java.util.List;

@Data
public class Cliente {
  private Integer codigo;
  private String nome;
  private List<Endereco> enderecos;
}
