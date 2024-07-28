
import DoublyLinkedList.DoublyLinkedList;
import LinkedList.LinkedList;

public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    linkedlist();
    doublyLinkedList();
  }

  public static void doublyLinkedList() {
    DoublyLinkedList myDLinkedList = new DoublyLinkedList(7);
    myDLinkedList.append(5);
    myDLinkedList.printList();
  }

  public static void linkedlist() {
    LinkedList myLinkedList = new LinkedList(4);
    myLinkedList.printList();
  }
}