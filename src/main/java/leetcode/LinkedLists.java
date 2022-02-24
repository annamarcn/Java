package leetcode;

public class LinkedLists {
  Node head;

  public void add(int data) {
    // if empty
    if (this.head == null) {
      this.head = new Node(data);
    }
    // if not empty
    else {
      Node newNode = new Node(data);
      newNode.next = this.head;
      this.head = newNode;
    }
  }
}

class Node {
  int data;
  Node next;

  Node(int d) {
    this.data = d;
  }
}
