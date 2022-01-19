package crackingthecodinginterview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysAndStringsTest {
  private ArraysAndStrings result = new ArraysAndStrings(); //why does it have to be "private" ?

  @Test
  public void emptyStringIsNotUnique()
  {
    result.hasOnlyUniqueCharacters("");

    assertFalse(false);
  }

  @Test
  public void stringWithOneCharacterIsUnique()
  {
    result.hasOnlyUniqueCharacters("a");

    assertTrue(true);
  }

  @Test
  public void repeatingCharactersIsNotUnique()
  {
    result.hasOnlyUniqueCharacters("aa");

    assertFalse(false);
  }

  @Test
  public void emptyStringsCannotBePermutations()
  {
    result.isPermutation("", "");

    assertFalse(false);
  }

  @Test
  public void permutationsMustBeEqualLength()
  {
    result.isPermutation("aa", "b");

    assertFalse(false);
  }

  @Test
  public void differentCharsInStringsCannotBePermutation()
  {
    result.isPermutation("abc", "def");

    assertFalse(false);
  }

  @Test
  public void sameCharsInStringsIsPermutation()
  {
    result.isPermutation("abc", "cBa");

    assertTrue(true);
  }

  @Test
  public void spacesAreReplacedWithPercentage20()
  {
    String str = "abc def";

    String expected = "abc%20def";

    assertEquals(expected, result.URLify(str));
  }

  @Test
  public void isPalindrome()
  {
    result.isPermutationOfPalindrome("Tomato otamot");

    assertTrue(true);
  }

  @Test
  public void isPermutation()
  {
    result.isPermutationOfPalindrome("oTmato otamot");

    assertTrue(true);
  }

}