package com.walbety.blank.exception;

import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException {
  private HttpStatus httpStatus;
  private String error;

  public BusinessException(String error, String message) {
    super(message);
    this.error = error;
    this.httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
  }

  public BusinessException(HttpStatus status, String error, String message) {
    this(error, message);
    this.httpStatus = HttpStatus.UNPROCESSABLE_ENTITY;
  }

  public HttpStatus getHttpStatus() {
    return this.httpStatus;
  }

  public String getError() {
    return this.error;
  }
}
