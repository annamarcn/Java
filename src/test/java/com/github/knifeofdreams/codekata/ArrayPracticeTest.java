package com.github.knifeofdreams.codekata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayPracticeTest {

  public void get() {
    var practice = new ArrayPractice();
    int[] list = new int[0];
    var result = practice.get(list, 0);

    assertEquals(0, result);
  }
}
