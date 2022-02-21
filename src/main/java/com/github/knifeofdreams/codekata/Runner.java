package com.github.knifeofdreams.codekata;

import crackingthecodinginterview.ArraysAndStrings;

public class Runner {

  public static void main(String[] args) {
    var practice = new ArraysAndStrings();

    /*
     print("select some designpattern to test")
     int result = GET_USER_INPUT

     switch(GET_USER_INPUT)

     case BUILDER:
         builderPatternRunner();
     case FACTORY:
         factoryPatternRunner();
    */

    System.out.println(practice.hasOnlyUniqueCharacters("Abcdefg"));
    System.out.println(practice.isPermutation("abcdefg", "gfehcab"));
    System.out.println(practice.URLify("abc def gh"));
    System.out.println(practice.isPermutationOfPalindrome("anna"));
    System.out.println(practice.stringCompression("aaaaaaabbbbbcccccddddd"));
  }
}
