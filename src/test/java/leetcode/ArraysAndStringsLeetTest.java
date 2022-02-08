package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    assertEquals(0, result.sumOfUniqueElements(List.of()));
  }

  @Test
  public void onlyUniqueElementsAreCounted() {
    assertEquals(18, result.sumOfUniqueElements(List.of(10, 4, 10, 9, 5)));
  }

  @Test
  public void noRepeatingElementsAreAllowed() {
    assertEquals(0, result.sumOfUniqueElements(List.of(1, 1, 1, 1, 1)));
  }

  @Test
  public void emptyStringIsNotAnagram() {
    assertFalse(result.isAnagram("", "something"));
  }

  @Test
  public void isAnagramRegardlessOfCapitalization() {
    assertTrue(result.isAnagram("anagram", "nagAram"));
  }

  @Test
  public void repeatingLettersIsAnagramAsLongAsStringsAreEqualLength() {
    assertTrue(result.isAnagram("aaaaa", "aaaaa"));
  }

  @Test // Is this test needed or is it covered already byt the capitalization test above?
  public void isAnagramHappyCase() {
    assertTrue(result.isAnagram("anagram", "nagaram"));
  }

  @Test
  public void emptyStringMeansZeroOccurences() {
    assertEquals(0, result.numWordsWithOneOccurrence(List.of(), List.of("abc")));
  }

  @Test
  public void occurenceIsCountedOnceIndependentOfCapitalization() {
    assertEquals(
        4,
        result.numWordsWithOneOccurrence(
            List.of("anna", "is", "is", "is", "learning", "to", "Code"),
            List.of("Anna", "is", "learning", "to", "code", "code")));
  }

  @Test
  public void emptyArrayDoesntHaveUniqueNumOfOccurrences() {
    assertTrue(result.uniqueNumOfOccurrences(List.of()));
  }

  @Test
  public void arrayWithOneIntegerHasUniqueNumOfOccurrences() {
    assertTrue(result.uniqueNumOfOccurrences(List.of(1)));
  }

  @Test
  public void trueIfDifferentIntegersAppearDifferentNumbersOfTimes() {
    assertTrue(result.uniqueNumOfOccurrences(List.of(1, 2, 2, 1, 1, 3)));
  }

  @Test
  public void falseIfDifferentIntegersAppearSameNumbersOfTimes() {
    assertFalse(result.uniqueNumOfOccurrences(List.of(1, 2)));
  }

  @Test
  public void emptyStringIsNotValid() {
    assertTrue(result.validParentheses(""));
  }

  @Test
  public void bracketsClosedBySameTypeOfBracketsIsValid() {
    assertTrue(result.validParentheses("([])[]{}"));
  }

  @Test
  public void bracketsClosedInWrongOrderIsInvalid() {
    assertFalse(result.validParentheses("))[]{}"));
  }
}
