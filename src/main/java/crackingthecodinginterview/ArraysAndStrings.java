package crackingthecodinginterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraysAndStrings {

  public boolean hasOnlyUniqueCharacters(String str)
  {
    Set<Character> setOfChars = new HashSet<Character>();

    for(int i = 0; i < str.length(); i++)
    {
      setOfChars.add(str.charAt(i));
    }

    if(str.length() == setOfChars.size())
    {
      return true;
    }
    return false;
  }

  public boolean isPermutation(String s1, String s2)
  {
    HashMap<Character, Integer> map = new HashMap<>();

    //Test 1: are they the same length?
    if(s1.length() != s2.length())
    {
      return false;
    }

    for(int i = 0; i < s1.length(); i++)
    {
      map.put(s1.charAt(i), i);
    }

    for(int j = 0; j < s2.length(); j++)
    {
        if(map.containsKey(s2.charAt(j)))
        {
          map.remove(s2.charAt(j));
        }
    }
    return map.isEmpty();
  }


}

