package leetcode;

public class LinkedLists {
  Node head;

  public void add(int data) {
    // if empty
    if (head == null) {
      head = new Node(data);
    }
    // if not empty, add to the start of the list
    else {
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
    }
  }

  public void delete(Node node) {
    node.data = node.next.data;
    node.next = node.next.next;
  }

  public Node middleNode(Node node) {
    int count = 0;
    int middle;
    Node current = node;

    while (current != null) {
      count++;
      current = current.next;
    }

    if (count % 2 == 0) {
      middle = (count / 2) + 1;
    } else {
      middle = (int) ((count * 0.5) + 0.5);
    }

    for (int i = 1; i <= middle; i++) {
      node = node.next;
    }

    return node;
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
