package com.swacorp.rpa.utils;

public class LoggingException extends Exception {

  private static final long serialVersionUID = 4343742812285214227L;

  public LoggingException(String errorMessage) {
    super(errorMessage);
  }

  public LoggingException(Throwable exception) {
    super(exception);
  }
}
