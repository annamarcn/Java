package com.github.knifeofdreams.codekata;


import com.github.knifeofdreams.codekata.HashMapPractice.TrickyObject;
import java.util.HashMap;
import java.util.List;

public class Runner {

  public static void main(String[] args) {
    var practice = new HashMapPractice();
    // This is the minimal compiling code. Set up the HashMap in a way that it's suitable to test your solution.
    HashMap<String, Integer> map = new HashMap<>();

    System.out.println(practice.add(map, "Stockholm", 1));
    // Add the rest of the tests here. I'll write tests for the last two exercises.

    TrickyObject trickyObj1 = new TrickyObject();
    TrickyObject trickyObj2 = new TrickyObject();
    TrickyObject trickyObj3 = new TrickyObject();

    List<TrickyObject> trickyObjects = List.of(trickyObj1, trickyObj3, trickyObj2, trickyObj2, trickyObj2, trickyObj1);
    System.out.println(practice.countInList(trickyObjects));

    // The following result should be true
    System.out.println(practice.isPangram("thequickbrownfoxjumpsoverthelazydog"));

    // The following result should be false
    System.out.println(practice.isPangram("JuditIsATroll"));
  }
}
