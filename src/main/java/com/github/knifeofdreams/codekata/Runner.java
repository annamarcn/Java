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
    practice.add(map, "London", 2);
    practice.add(map, "Uppsala", 3);
    System.out.println(practice.addIfAbsent(map, "Semeltown", 4));
    System.out.println(practice.get(map, "Stockholm"));
    System.out.println("True if value exists in the map, false if it doesnt: " + practice.contains(map, "Stockholm"));
    System.out.println(practice.size(map));
    //System.out.println(practice.clear(map));
    System.out.println(practice.removeByKey(map, "Stockholm"));

    practice.add(map, "Budapest", 3);
    // BUG: removeByValue doesn't consider duplicate values at the moment
    System.out.println(practice.removeByValue(map, 3));
    System.out.println(practice.replace(map, "Göteborg", 3));
    System.out.println(practice.replaceIf(map, "Göteborg", 3, 12));
    System.out.println(practice.keys(map));
    System.out.println(practice.values(map));
    // Add the rest of the tests here. I'll write tests for the last two exercises.

    TrickyObject trickyObj1 = new TrickyObject("1");
    TrickyObject trickyObj2 = new TrickyObject("2");
    TrickyObject trickyObj3 = new TrickyObject("3");
    TrickyObject trickyObj4 = new TrickyObject("4");

    // BUG: count of objects is not correct with this implementation
    List<TrickyObject> trickyObjects = List.of(trickyObj1, trickyObj3, trickyObj2, trickyObj2, trickyObj2, trickyObj1, trickyObj4);
    System.out.println(practice.countInList(trickyObjects));

    // The following result should be true
   System.out.println(practice.isPangram("thequickbrownfoxjumpsoverthelazydog"));

    // The following result should be false
    //System.out.println(practice.isPangram("JuditIsATroll"));
  }
}
