package crackingthecodinginterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraysAndStrings {

  // Method to decide if a string has all unique characters.
  public boolean hasOnlyUniqueCharacters(String str) {
    Set<Character> setOfChars = new HashSet<>();

    for (int i = 0; i < str.length(); i++) {
      setOfChars.add(str.charAt(i));
    }

    return str.length() == setOfChars.size();
  }

  // Method to decide if, given two strings, one string is permutation of the other.
  // alternative solution: sort both strings, are they the same?
  public boolean isPermutation(String s1, String s2) {
    HashMap<Character, Integer> map = new HashMap<>();

    // Test 1: are they the same length?
    if (s1.length() != s2.length()) {
      return false;
    }

    for (int i = 0; i < s1.length(); i++) {
      map.put(Character.toLowerCase(s1.charAt(i)), i);
    }

    for (int j = 0; j < s2.length(); j++) {
      if (map.containsKey(Character.toLowerCase(s2.charAt(j)))) {
        map.remove(Character.toLowerCase(s2.charAt(j)));
      }
    }
    return map.isEmpty();
  }

  // Method to URLify string, i.e. replaces all spaces in string with '%20'.

  public String URLify(String str) {

    StringBuilder sb = new StringBuilder(); // whats the difference between this and StringBuffer?

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        sb.append("%20");
      } else {
        sb.append(str.charAt(i));
      }
    }

    return new String(sb);
  }

  public boolean isPermutationOfPalindrome(String str) {

    // Palindrome has at most 1 odd character, all else are even. Check if there's more than 1 odd
    // chars in map.
    Map<Character, Integer> map = new HashMap<>();
    int count = 1;

    for (int i = 0; i < str.length(); i++) {
      if (map.containsKey(Character.toLowerCase(str.charAt(i)))) {
        count = map.get(Character.toLowerCase(str.charAt(i))); // if the map already contains the key, increase count.
        count++;
      }
      map.put(Character.toLowerCase(str.charAt(i)), count); // otherwise add it
    }

    int amountOfOddValues =
        0; // if there's more than 1 odd value in the map, that means it's not a palindrome.

    for (char c : map.keySet()) {

      if (map.get(c) % 2 == 1) {
        if (amountOfOddValues == 1) {
          return false;
        }
        amountOfOddValues++;
      }
    }

    return true;
  }

  public String stringCompression(String str) {
    int count = 1;
    StringBuilder sb = new StringBuilder();

    if (str.length() <= 1) {
      return str;
    }

    for(int i = 0; i < str.length() - 1; i++)
    {
      if(str.charAt(i) != str.charAt(i+1))   //why doesn't it enter this loop for the last characters (see runner)?
      {
        sb.append(str.charAt(i));
        sb.append(count);
        count = 1;
      }
      else
      {
        count++;
      }
    }

    if(sb.length() >= str.length())
    {
      return str;
    }

    return sb.toString();
  }

  public boolean stringRotation(String s1, String s2)
  {
     StringBuilder sb = new StringBuilder(s1);

     sb.append(s1);

     if(s1.length() == 0 && s2.length() == 0)
     {
       return true;
     }

     if(sb.indexOf(s2) == -1)
     {
       return false;
     }
     return true;
  }

  }
