package br.com.ithappens.utils.exceptions;

public class ClienteNotFoundException extends RuntimeException {
  public ClienteNotFoundException(String mensagem) {
    super(mensagem);
  }
}
