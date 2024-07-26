import LinkedList.LinkedList;

public class Main {
     public static void main(String[] args) {
        System.out.println("hello world");
        linkedlist();

     }

      public static void linkedlist() {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.append(5);
        myLinkedList.append(9);
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();


       
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
      }

}