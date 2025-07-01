class LL {
    Node head;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;// therefore whernever a node is created size gets incremented ..
        }
    }

    void printList() {
        if (head == null) {
            System.out.println("The linked list is empty..>> 0");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    int getSize() {
        // int count=0;
        // if(head==null){
        // System.out.println("Empty Linked List.");
        // return count;
        // }
        // Node temp=head;
        // while(temp!=null){
        // count++;
        // temp=temp.next;
        // }
        // return count;

        // OR

        return this.size;
    }

    void addPosition(int data, int pos) {
        int i = 0;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (pos != 0) {
            Node currNode = head;
            Node prevNode = null;

            while (currNode.next != null && i < pos) {
                prevNode = currNode;
                currNode = currNode.next;
                i++;
            }
            prevNode.next = newNode;
            newNode.next = currNode;

        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    void insertATSortAsc(int data) {
        Node newNode = new Node(data);
        Node currNode = head;
        if (currNode == null || currNode.data > data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        while (currNode.next != null && currNode.next.data < data) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    void insertATSortDsc(int data) {
        Node newNode = new Node(data);
        Node currNode = head;
        if (currNode == null || currNode.data < data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        while (currNode.next != null && currNode.next.data > data) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("this is an empty list ..");
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Linked list is empty.");
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    Boolean Search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void DeleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        size--;
        head = head.next;

    }

    void DeleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
        }

        Node currNode = head;
        Node prevNode = null;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        size--;

    }

    void DeleteElement(int data) {
        if (head == null) {// when linked list has no elements !
            System.out.println("Linked List is empty!");
            return;
        }

        if (head.data == data && head.next == null) {// when LL has first element as the data and the LL has no other
                                                     // elements.
            head = null;
            size--;
            return;
        }
        if (head.data == data) {// when first element has data with other elements
            head = head.next;
            size--;
            return;
        }
        // when the element is somewhere in between or at the end
        Node currNode = head;
        Node prevNode = null;

        while (currNode != null && currNode.data != data) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        if (currNode == null) {
            System.out.println("Element " + data + " not found!");
            return;
        }

        prevNode.next = currNode.next;
        size--;

    }
    void DeleteElements(int data) {
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }
        //for removing all matching head nodes
        while(head!=null && head.data==data){
            head=head.next;
            size--;
        }
        //removing matching nodes from the rest of the list.

        Node currNode = head;
        Node prevNode = null;
        while(currNode!= null){
            if(currNode.data==data){
                prevNode.next=currNode.next;
                currNode=currNode.next;
                size--;
            }
            else{
                prevNode=currNode;
                currNode=currNode.next;
            }
        }
    }
    void DeleteElementPos(int position) {
        int i=0;
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }

        Node currNode = head;
        Node prevNode = null;

        while(currNode.next!= null && i<position){
            currNode=currNode.next 
        
        }
    }
}

class SingleLL {
    public static void main(String[] args) {
        LL list = new LL();
        // System.out.println(list.getSize());
        // list.printList();
        list.addFirst(11);
        list.addFirst(44);
        list.addFirst(33);
        // // list.printList();
        list.addLast(44);
        list.addLast(55);
        list.printList();
        // System.out.println(list.getSize());
        // System.out.println(list.Search(33));
        // list.addPosition(66,2);
        // list.insertATSortAsc(88);
        // list.insertATSortAsc(55);
        // list.insertATSortAsc(25);
        // list.insertATSortAsc(15);
        // list.insertATSortAsc(95);

        // list.insertATSortDsc(88);
        // list.insertATSortDsc(55);
        // list.insertATSortDsc(25);
        // list.insertATSortDsc(15);
        // list.insertATSortDsc(95);
        // list.DeleteFirst();
        // list.DeleteLast();
        // list.printList();
        // list.DeleteElement(95);
        // list.printList();
        list.DeleteElements(44);
        list.printList();

    }
}