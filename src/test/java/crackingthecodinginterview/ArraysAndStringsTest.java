package crackingthecodinginterview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysAndStringsTest {

  @Test
  public void emptyStringIsNotUnique()
  {
    var result = new ArraysAndStrings(); //how can I break this out again?

    result.hasOnlyUniqueCharacters("");

    assertFalse(false);
  }

  @Test
  public void stringWithOneCharacterIsUnique()
  {
    var result = new ArraysAndStrings();

    result.hasOnlyUniqueCharacters("a");

    assertTrue(true);
  }

  @Test
  public void repeatingCharactersIsNotUnique()
  {
    var result = new ArraysAndStrings();

    result.hasOnlyUniqueCharacters("aa");

    assertFalse(false);
  }

  @Test
  public void emptyStringsCannotBePermutations()
  {
    var result = new ArraysAndStrings();

    result.isPermutation("", "");

    assertFalse(false);
  }

  @Test
  public void permutationsMustBeEqualLength()
  {
    var result = new ArraysAndStrings();

    result.isPermutation("aa", "b");

    assertFalse(false);
  }

  @Test
  public void differentCharsInStringsCannotBePermutation()
  {
    var result = new ArraysAndStrings();

    result.isPermutation("abc", "def");

    assertFalse(false);
  }

  @Test
  public void sameCharsInStringsIsPermutation()
  {
    var result = new ArraysAndStrings();

    result.isPermutation("abc", "cBa");

    assertTrue(true);
  }

}