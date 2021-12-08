package com.github.knifeofdreams.codekata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayPracticeTest {

  @Test
  public void testMethod() {
    var practice = new ArrayPractice();
    var result = practice.testMethod();

    assertEquals(1, result);
  }
}
