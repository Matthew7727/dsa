
import DoublyLinkedList.DoublyLinkedList;
import LinkedList.LinkedList;
import Stack.Stack;

public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    // linkedlist();
    //doublyLinkedList();
    stack();
  }

  public static void stack() {
    Stack myStack = new Stack(4);

    myStack.push(5);
    myStack.push(65);

    
    myStack.getHeight();
    myStack.printTop();
    myStack.printStack();

    System.out.println("popped: " + myStack.pop().value);
  }

  public static void doublyLinkedList() {
    DoublyLinkedList myDLinkedList = new DoublyLinkedList(7);
    myDLinkedList.append(5);
    myDLinkedList.append(8);
    myDLinkedList.append(78);
    myDLinkedList.insert(2, 3);
    myDLinkedList.insert(2, 4);
    myDLinkedList.remove(1);
    myDLinkedList.printList();

  }

  public static void linkedlist() {
    LinkedList myLinkedList = new LinkedList(4);
    myLinkedList.printList();
  }
}