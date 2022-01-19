package crackingthecodinginterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraysAndStrings {

  //Method to decide if a string has all unique characters.
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

  //Method to decide if, given two strings, one string is permutation of the other.

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

  //Method to URLify string, i.e. replaces all spaces in string with '%20'.

  public String URLify(String str)
  {

    StringBuffer sb = new StringBuffer();

    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) == ' ')
      {
        sb.append("%20");
      }
      else
      {
        sb.append(str.charAt(i));
      }
    }

    String str2 = new String(sb);

    return str2;

    /*char[] cr = new char[str.length()];

    int count = 0;

    for(int i = 0; i < str.length(); i++)
    {
      if(str.charAt(i) == ' ')
      {
        count++;
      }
    }
    count = count * 3;

    char[] newChar = new char[str.length() + count];

    for(int i = 0; i < newChar.length; i++)
    {
      if(newChar[i] == ' ')
      {
        newChar[i] = '%';
        newChar[i+1] = '2';
        newChar[i+2] = '0';
        i = i+3;
      }
    }

    String str2 = new String(newChar);
    return str2;*/
  }

  public boolean isPermutationOfPalindrome(String str)
  {
    boolean isPalindrome = false;
    boolean isPermutation = false;

    for(int i = 0; i < str.length(); i++)
    {
      for(int j = str.length()-1; j >= 0; j--)
      {
        if(str.charAt(i) == str.charAt(j))
        {
          isPalindrome = true;
        }
      }
    }

    StringBuffer sb = new StringBuffer(str);
    sb = sb.reverse();

    String str2 = new String(sb.toString());

    isPermutation = isPermutation(str,str2);

    if(isPermutation == true && isPalindrome == true)
    {
      return true;
    }
    return false;
  }

}

