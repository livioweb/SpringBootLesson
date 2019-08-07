package br.com.ithappens.utils.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(reason = "Empresa Não achada", code = HttpStatus.NOT_FOUND)
public class EmpresaNotFoundException extends RuntimeException {

  public EmpresaNotFoundException() {
    super();
  }

  public EmpresaNotFoundException(String message) {
    super(message);
  }
}
