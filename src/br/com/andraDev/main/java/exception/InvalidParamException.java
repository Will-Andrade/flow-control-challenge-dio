package br.com.andraDev.main.java.exception;

public class InvalidParamException extends RuntimeException {
  public InvalidParamException() {
    super("The second param should be greater than the first one.");
  }
}
