public class SinglyLinkedList{
    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        Node current = head;
        Node pointer = current.next;
        while(pointer.next != null){
            current = current.next;
            pointer = pointer.next;
        }
        pointer = null;
        current.next = null;
    }

    public void printValues(){
        Node runner = head;
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }

    public Node find(int value){
        Node runner = head;
        while(runner != null){
            if(runner.value == value){
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }

    public void removeAt(int n){
        // if list is empty
        if(head == null){
            return;
        }
        Node current = head;
        Node prev = head;
        int i = 0;
        if(n == 0){ // remove head
            head = head.next;
        }
        while(current.next != null){
            if(i == n){
                prev.next = current.next;
                current = null;
                return;
            } else {
                prev = current;
                current = current.next;
                i++;
            }
        }
    }
}
