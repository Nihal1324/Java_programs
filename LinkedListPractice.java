class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    void printList() {
        if (head == null) {// if there is no data in the linked list...
            System.out.println("The list is empty >>> 0");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;

        }
        System.out.println("null");

    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {// if there is no data in the linked list...
            head = newNode;// newNode is assigned to head ,i.e. this will become the first value;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {// if there is no data in the linked list...
            head = newNode;// newNode is assigned to head ,i.e. this will become the first value;
            return;
        }
        newNode.next = head;// newNode ka next HEAD ko point kerega aur uske baad abb, jo head hai vo new
                            // node ko point keraga (i.e., head ban jaga newnode ka head ).
        head = newNode;

    }
    void deleteFirst(){

        while(head==null){
            System.out.println("list is empty!");
            return;
        }
        head= head.next;
        
    }
    void deleteLast(){
        if(head==null){
            System.out.println("list is empty!");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
         Node temp1,temp2;
        temp1=head;
        temp2=head.next;
        while(temp2.next!=null){
            temp2=temp2.next;
            temp1=temp1.next;
        }
        temp1.next=null;

    }
}

class LinkedListPractice {
    public static void main(String[] args) {
        LL list = new LL();
        list.printList();
        list.addFirst(111);
        list.addFirst(222);
        list.addFirst(333);
        list.addFirst(444);
        list.addFirst(555);
        list.addLast(101);
        list.addLast(000);
        list.addLast(101);
        list.addFirst(555);
        list.deleteFirst();
        
        list.deleteLast();

        list.printList();

    }
}
