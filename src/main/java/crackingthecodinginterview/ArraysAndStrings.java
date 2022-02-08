package crackingthecodinginterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraysAndStrings {

  public boolean hasOnlyUniqueCharacters(String str) {
    Set<Character> setOfChars = new HashSet<>();

    for (int i = 0; i < str.length(); i++) {
      setOfChars.add(str.charAt(i));
    }

    return str.length() == setOfChars.size();
  }

  public boolean isPermutation(String s1, String s2) {
    HashMap<Character, Integer> map = new HashMap<>();

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

  public String URLify(String str) {
    StringBuilder sb = new StringBuilder();

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
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {
      char lowercaseChar = Character.toLowerCase(str.charAt(i));

      if (map.containsKey(lowercaseChar)) {
        map.put(lowercaseChar, map.get(lowercaseChar) + 1);
      } else {
        map.put(lowercaseChar, 1);
      }
    }

    int amountOfOddValues = 0;

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
    str = str.toLowerCase();
    int count = 0;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      count += 1;
      if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
        sb.append(str.charAt(i));
        sb.append(count);
        count = 0;
      }
    }

    if (sb.length() >= str.length()) {
      return str;
    }

    return sb.toString();
  }

  public boolean stringRotation(String s1, String s2) {
    StringBuilder sb = new StringBuilder(s1);
    sb.append(s1);

    if (s1.length() == 0 && s2.length() == 0) {
      return true;
    }

    if (sb.indexOf(s2) == -1) {
      return false;
    }
    return true;
  }
}
