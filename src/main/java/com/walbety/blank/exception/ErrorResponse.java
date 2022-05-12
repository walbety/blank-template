package com.walbety.blank.exception;

public class ErrorResponse {
  private int code;
  private String statusMessage;
  private String error;

  public ErrorResponse(int code, String statusMessage, String error) {
    this.code = code;
    this.statusMessage = statusMessage;
    this.error = error;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
