package crackingthecodinginterview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysAndStringsTest {
  private ArraysAndStrings result = new ArraysAndStrings(); //why does it have to be "private" ? This is only going to be accessed from methods inside this class, and doesn't need to be visible from outside.

  @Test
  public void emptyStringIsUnique()
  {
    assertTrue(result.hasOnlyUniqueCharacters(""));
  }

  @Test
  public void stringWithOneCharacterIsUnique()
  {
    assertTrue(result.hasOnlyUniqueCharacters("a"));
  }

  @Test
  public void repeatingCharactersAreNotUnique()
  {
    assertFalse(result.hasOnlyUniqueCharacters("aa"));
  }

  @Test
  public void repeatingMixedCharactersAreNotUnique()
  {
    assertFalse(result.hasOnlyUniqueCharacters("baca"));
  }

  @Test
  public void emptyStringsCannotBePermutations()
  {
    assertTrue(result.isPermutation("", ""));
  }

  @Test
  public void permutationsMustBeEqualLength()
  {
    assertFalse(result.isPermutation("aa", "b"));
  }

  @Test
  public void differentCharsInStringsCannotBePermutation()
  {
    assertFalse(result.isPermutation("abc", "def"));
  }

  @Test
  public void sameCharsInStringsIsPermutation()
  {
    assertTrue(result.isPermutation("abc", "cba"));
  }

  @Test
  public void sameCharsInStringsIsPermutationRegardlessOfCapitalization()
  {
    assertTrue(result.isPermutation("abc", "cBa"));
  }

  @Test
  public void emptyStringStaysUnchanged()
  {
    assertEquals("", result.URLify(""));
  }

  @Test
  public void stringWithoutSpacesStaysUnchanged()
  {
    assertEquals("aabc", result.URLify("aabc"));
  }

  @Test
  public void spacesAreReplacedWithPercentage20()
  {
    assertEquals("abc%20def", result.URLify("abc def"));
  }

  @Test
  public void isPalindrome()
  {
    assertTrue(result.isPermutationOfPalindrome("Tomato otamot"));
  }

  @Test
  public void isPermutation()
  {
    assertTrue(result.isPermutationOfPalindrome("oTmato otamot"));
  }

}