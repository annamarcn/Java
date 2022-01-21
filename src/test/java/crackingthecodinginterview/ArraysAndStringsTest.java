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
    assertTrue(result.isPermutationOfPalindrome("carerac"));
  }

  @Test
  public void isPermutation()
  {
    assertTrue(result.isPermutationOfPalindrome("carerac"));
  }

  @Test
  public void stringIsPermutationOfPalindrome()
  {
    assertTrue(result.isPermutationOfPalindrome("carerac"));
  }

  @Test
  public void palindromeIsPermutationRegardlessOfCapitalization()
  {
    assertTrue(result.isPermutationOfPalindrome("cArerac")); //why does this work out of the box - I haven't done "toLowerCase" in this method?
  }


  @Test
  public void emptyStringStaysTheSame()
  {
    assertEquals("", result.stringCompression(""));
  }

  @Test
  public void stringWithOneCharRemainsUnchanged()
  {
    assertEquals("a", result.stringCompression("a"));
  }


  @Test
  public void repeatingCharsAreRepresentedByNumbers()
  {
    assertEquals("a2b1c5a3", result.stringCompression("aabcccccaaa"));
  }

  @Test
  public void repeatingCharsAreRepresentedByNumbersRegardlessOfCapitalization()
  {
    assertEquals("a2b1c5a3", result.stringCompression("aAbcCcccaaa"));
  }

  @Test
  public void originalStringIsReturnedIfCompressedStringLongerThanOriginalString()
  {
    assertEquals("aaaabcdde", result.stringCompression("aaaabcdde"));
  }

  @Test
  public void compressedStringIsReturnedIfShorterThanOriginalString()
  {
    assertEquals("aaaaaabccddee", result.stringCompression("a6b1c2d2e2"));
  }

}