package br.com.andraDev.test.java;

import br.com.andraDev.main.java.Counter;
import br.com.andraDev.main.java.exception.InvalidParamException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CounterTest {
  
  @Test
  void testValidParams() throws InvalidParamException  {
    // Captures the output that normally goes to the console into a variable
    PrintStream originalOut = System.out;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    
    Counter.count(3, 7);
    
    // Resets the capture variable so any other output goes into the console as expected
    System.setOut(originalOut);
    
    String expectedOutput = "Printing number 1\nPrinting number 2\nPrinting number 3\nPrinting number 4\n";
    assertEquals(expectedOutput, outContent.toString());
  }
  
  @Test
  void testInvalidParams() throws InvalidParamException {
    InvalidParamException thrown = assertThrows(
        InvalidParamException.class,
        () -> Counter.count(10, 5)
    );
    
    assertEquals("The second param should be greater than the first one.", thrown.getMessage());
  }
  
  @Test
  void testEqualParams() throws InvalidParamException {
    InvalidParamException thrown = assertThrows(
        InvalidParamException.class,
        () -> Counter.count(5, 5)
    );
    
    assertEquals( "The second param should be greater than the first one.", thrown.getMessage());
  }
  
  @Test
  void testValidNegativeParams() throws InvalidParamException {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    
    Counter.count(-5, 0);
    
    System.setOut(originalOut);
    
    String expectedOutput = "Printing number 1\nPrinting number 2\nPrinting number " +
        "3\nPrinting number 4\nPrinting number 5\n";
    assertEquals(expectedOutput, outContent.toString());
  }
  
  @Test
  void testInvalidNegativeParams() {
    InvalidParamException thrown = assertThrows(
        InvalidParamException.class,
        () -> Counter.count(5, -10)
    );
    
    assertEquals( "The second param should be greater than the first one.", thrown.getMessage());
  }
}
