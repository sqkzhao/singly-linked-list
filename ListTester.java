public class ListTester{
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();  // 3 4 10 5
        System.out.println(sll.find(4));
        System.out.println(sll.find(1));    // null
        sll.printValues();  // 3 4 10 5
        sll.removeAt(2); // remove 10
        sll.printValues(); // 3 4 5
    }
}