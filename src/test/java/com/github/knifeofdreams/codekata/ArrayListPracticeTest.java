package com.github.knifeofdreams.codekata;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ArrayListPracticeTest {

  private ArrayListPractice practice = new ArrayListPractice();

  /*
  For now you can use one test per method. Change the input parameters of the method here to see how the output changes when you run the test.
  In production we have several unit test per method, the one unit test per method is only to make it faster for now.
  The Given, When, Then structure is the structure of a unit test. Given a certain context, when something happens, then I expect the result to be this. You don't have to use the comments, they are only here to guide you at the beginning.
  We'll talk about unit tests later, for now don't worry too much about them.
  */
  @Test
  public void add() {
    // Given
    var list = new ArrayList<Integer>(List.of(2, 3));

    // When
    practice.add(list, 8);
    var actual = practice.add(list, 3);

    // Then
    List<Integer> expected = List.of(2, 3, 8, 3);
    assertEquals(expected, actual);
  }

  @Test
  public void get() {
    // Given
    var practice = new ArrayListPractice();
    var list = new ArrayList<>(List.of(5, 4, 2));

    // When
    var result = practice.contains(list, 1);

    // Then
    assertFalse(result);
  }

  @Test
  public void removeDuplicatesRemovesDuplicatesFromUnsortedList() {
    var list = new ArrayList<>(List.of(1, 3, 2, 3, 1, 1, 3, 4));

    var expected = List.of(1, 3, 2, 4);

    assertEquals(expected, practice.removeDuplicates(list));
  }

  @Test
  public void findLongestIncreasingSequenceReturnsZeroForEmptyList() {
    var emptyList = new ArrayList<Integer>(List.of());
    assertEquals(0, practice.findLongestIncreasingSequence(emptyList));
  }
}
