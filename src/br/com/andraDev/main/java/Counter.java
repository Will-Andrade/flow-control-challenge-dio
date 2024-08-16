package br.com.andraDev.main.java;

import br.com.andraDev.main.java.exception.InvalidParamException;

import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the first parameter.");
    int firstParam = input.nextInt();
    
    System.out.println("Enter the second parameter.");
    int secondParam = input.nextInt();
    
    try {
      count(firstParam, secondParam);
    }catch (InvalidParamException exception) {
      System.out.println(exception.getMessage());
    }
    
  }
  
  public static void count(int firstParam, int secondParam) throws InvalidParamException {
    if (firstParam > secondParam) {
      throw new InvalidParamException();
    }
    
    if (firstParam == secondParam) {
      throw new InvalidParamException();
    }

    int count = secondParam - firstParam;

    for (int number = 1; number <= count; number++) {
      System.out.println(STR."Printing number \{number}");
    }
  }
}
