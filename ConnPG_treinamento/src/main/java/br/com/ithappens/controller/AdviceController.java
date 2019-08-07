package br.com.ithappens.controller;

import br.com.ithappens.utils.MensagemException;
import br.com.ithappens.utils.exceptions.EmpresaNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
@Slf4j
public class AdviceController extends ResponseEntityExceptionHandler {

  @ExceptionHandler(EmpresaNotFoundException.class)
  public ResponseEntity interceptaEmpresaNotFound(EmpresaNotFoundException e) {
    log.trace(e.getMessage(), e.getCause());
    MensagemException ms = new MensagemException(HttpStatus.NOT_FOUND.value(), e.getMessage());
    return new ResponseEntity(ms, HttpStatus.NOT_FOUND);
  }

}
