package com.github.knifeofdreams.codekata;

import java.util.ArrayList;
    import java.util.List;

public class Runner {

  public static void main(String[] args) {
    var practice = new ArrayListPractice();

    List<Integer> integers = List.of(4, 2, 3, 5, 1);
    ArrayList<Integer> integerList = new ArrayList<>(integers);

    //
    System.out.println(practice.add(integerList, -12));

    //get item at index n, unless it's out of bounds
    int item = practice.get(integerList, -3);
    if (item >= 0) {
      System.out.println(item);
    }else{
      System.out.println("The index is out of bounds.");
    }

    //remove item at index n, inform if it's out of bounds
    int removedItem = practice.remove(integerList, -1);
    if (removedItem != -1) {
      System.out.println("The item you removed is = " + removedItem);
    }else{
      System.out.println("The index is out of bounds");
    }

    /*
    System.out.println(practice.contains(integerList, 0));
    System.out.println(practice.indexOf(integerList, 0));
    System.out.println(practice.size(integerList));
    System.out.println(practice.doubleValues(integerList));
    System.out.println(practice.evenNumbers(integerList));
    System.out.println(practice.shuffle(integerList));
    System.out.println(practice.removeDuplicates(integerList));
    System.out.println(practice.findLongestIncreasingSequence(integerList));
    System.out.println(practice.sort(integerList));
     */
  }

}