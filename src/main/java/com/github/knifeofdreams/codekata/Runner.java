package com.github.knifeofdreams.codekata;

import java.util.ArrayList;
    import java.util.List;

public class Runner {
  public static void main(String[] args) {
    var practice = new ArrayListPractice();
    List<Integer> integers = List.of(4, 2, 3, 4, 5, 2, 4, 1, 2, 3, 4, 7, 5);
    ArrayList<Integer> integerList = new ArrayList<>(integers);

    //
    System.out.println(practice.add(integerList, -12));

    // get item at index n, unless it's out of bounds
    System.out.println("The item at the index is: " + practice.get(integerList, 1));

    // remove item at index n, inform if it's out of bounds
    System.out.println("The index you removed is: " + practice.remove(integerList, 2));

    // check if list contains item at index n
    System.out.println("Check if list contains item at the index: " + practice.contains(integerList, -2));

    // return index of item if it's in the list, otherwise return -1
    System.out.println("Index of the item if it's in the list (otherwise -1): " + practice.indexOf(integerList, 24352534));

    // return size of list

    System.out.println("The size of the list is: " + practice.size(integerList));


    //System.out.println("New list with doubled values: " + practice.doubleValues(integerList));

    //System.out.println("New list with only even values: " + practice.evenNumbers(integerList));

    //System.out.println(practice.shuffle(integerList));

    //System.out.println("Same list, but without duplicates = " + practice.removeDuplicates(integerList));

    //System.out.println("Longest consecutive increasing sequence is of size = " + practice.findLongestIncreasingSequence(integerList));

    //System.out.println("Sorted list = " + practice.sort(integerList));

      }

  }
