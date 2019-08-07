package br.com.ithappens.model;

import lombok.*;

@Data
@EqualsAndHashCode(of = "cnpj")
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
  private Long id;
  private String cnpj;
  private String razao;
}
