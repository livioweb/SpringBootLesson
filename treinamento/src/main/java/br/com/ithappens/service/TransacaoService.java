package br.com.ithappens.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Size;

@Service
public class TransacaoService {

  public void transacaoProgramatica() {

  }

  @Transactional()
  public void transacaoDeclarativa() {

  }
}
