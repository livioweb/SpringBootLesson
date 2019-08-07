package br.com.ithappens.model;

import lombok.*;

@Data
@EqualsAndHashCode(of = "cnpj")
@AllArgsConstructor
public class Empresa {
  private Long id;
  private String nome;
}
