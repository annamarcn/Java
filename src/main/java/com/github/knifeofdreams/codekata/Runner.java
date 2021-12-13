package com.github.knifeofdreams.codekata;


public class Runner {

  public static void main(String[] args) {
    var practice = new ArrayPractice();
    // This is the minimal compiling code. Construct the array with integers inside to test your solutions.
    int[] array = new int[0];

    System.out.println(practice.add(array, 0));
    System.out.println(practice.get(array, 0));
    System.out.println(practice.remove(array, 0));
    System.out.println(practice.contains(array, 0));
    System.out.println(practice.indexOf(array, 0));
    System.out.println(practice.size(array));
    System.out.println(practice.doubleValues(array));
    System.out.println(practice.evenNumbers(array));
    System.out.println(practice.removeDuplicates(array));
    System.out.println(practice.findLongestIncreasingSequence(array));
    System.out.println(practice.sort(array));
  }
}
