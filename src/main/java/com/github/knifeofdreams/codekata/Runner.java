package com.github.knifeofdreams.codekata;

import crackingthecodinginterview.ArraysAndStrings;

public class Runner {

  public static void main(String[] args) {
    var practice = new ArraysAndStrings();

    System.out.println(practice.hasOnlyUniqueCharacters("Abcdefg"));
    System.out.println(practice.isPermutation("abcdefg", "gfehcab"));
    System.out.println(practice.URLify("abc def gh"));
    System.out.println(practice.isPermutationOfPalindrome("veerargr fdsf"));
  }
}
