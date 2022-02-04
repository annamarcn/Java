package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysAndStringsLeetTest {
  private ArraysAndStringsLeet result = new ArraysAndStringsLeet();

  @Test
  public void emptyAllowedStringMeansZeroConsistentStrings() {
    assertEquals(0, result.numberOfConsistentStrings("", List.of("aa", "b")));
  }

  @Test
  public void emptyWordsArrayMeansZeroConsistentStrings() {
    assertEquals(0, result.numberOfConsistentStrings("abc", List.of()));
  }

  @Test
  public void oneEmptyWordsStringIsNotCountedAsConsistent() {
    assertEquals(2, result.numberOfConsistentStrings("abc", List.of("a", "", "b")));
  }

  @Test
  public void onlyConsistentStringsAreCounted() {
    assertEquals(
        2, result.numberOfConsistentStrings("abc", List.of("aabc", "tyeu", "cbbaaa", "test")));
  }

  @Test
  public void noConsistentStringsReturnsZero() {
    assertEquals(0, result.numberOfConsistentStrings("abc", List.of("nhyy", "ktr", "prw")));
  }

  @Test
  public void countsNumberOfConsistentStringsIndependentOfCapitalization() {
    assertEquals(2, result.numberOfConsistentStrings("abc", List.of("Abbc", "cbBa", "trty")));
  }

  @Test
  public void emptyArrayHasZeroUniqueElements() {
    assertEquals(0, result.numberOfUniqueElements(List.of()));
  }

  @Test
  public void onlyUniqueElementsAreCounted() {
    assertEquals(18, result.numberOfUniqueElements(List.of(1, 1, 5, 5, 10, 2, 1, 2)));
  }
}
