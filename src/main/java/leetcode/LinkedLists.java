package leetcode;


public class LinkedLists {
  Node head;

  public void add(int data) {
    // if empty
    if (this.head == null) {
      this.head = new Node(data);
    }
    // if not empty, add to the start of the list
    else {
      Node newNode = new Node(data);
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  public Node delete(Node node) {
    Node currentNode = this.head;

    if (this.head.data == node.data) {
      this.head.next = this.head;
      return this.head;

    } else {
      currentNode.next = currentNode.next.next;
    }
    return this.head;
  }
}

class Node {
  int data;
  Node next;

  Node(int d) {
    this.data = d;
  }
}
