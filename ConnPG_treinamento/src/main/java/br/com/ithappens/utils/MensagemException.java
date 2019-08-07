package br.com.ithappens.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MensagemException {
  private Integer codigo;
  private String mensagem;


}
