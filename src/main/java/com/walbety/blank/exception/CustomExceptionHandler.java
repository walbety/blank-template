package com.walbety.blank.exception;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(-9999)
public class CustomExceptionHandler {

  @ExceptionHandler({BusinessException.class})
  public final ResponseEntity<ErrorResponse> handleBusinessExc(BusinessException ex) {
    ErrorResponse response =
        new ErrorResponse(000, ex.getHttpStatus().getReasonPhrase(), ex.getError());
    return ResponseEntity.status(ex.getHttpStatus()).body(response);
  }

  @ExceptionHandler({MethodArgumentNotValidException.class})
  public final ResponseEntity<ErrorResponse> handleMethodArgExc(
      MethodArgumentNotValidException ex) {
    ErrorResponse response =
        new ErrorResponse(001, HttpStatus.UNPROCESSABLE_ENTITY.toString(), "something went wrong");
    return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(response);
  }
}
