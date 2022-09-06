package basics.UC5;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNode();
        myLinkedList.popFirst();
        myLinkedList.printMyNode();
    }
}
