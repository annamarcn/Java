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
    Node current = this.head;

    if (this.head.data == node.data) {
      this.head.next = this.head;
      return this.head;

    } else {
      current.next = current.next.next;
    }
    return this.head;
  }

  @Override
  public String toString() {
    var linkedList = new StringBuilder();
    var node = head;

    while (node != null) {
      linkedList.append(node.data + " -> ");
      node = node.next;
    }
    return linkedList.toString();
  }
}

class Node {
  int data;
  Node next;

  Node(int d) {
    this.data = d;
  }
}
