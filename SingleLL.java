class LL{
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;//therefore whernever a node is created size gets incremented ..
        }
    }
    void printList(){
     if(head==null){
        System.out.println("The linked list is empty..>> 0");
        return;
     }
     Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+"=>");
        temp=temp.next;
      }
      System.out.println("null");
    }
    int getSize(){
        // int count=0;
        // if(head==null){
        //     System.out.println("Empty Linked List.");
        //     return count;
        // }
        // Node temp=head;
        // while(temp!=null){
        //  count++;
        //  temp=temp.next;
        // }
        // return count;

        // OR 

        return this.size;
    }
    void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            System.out.println("this is an empty list ..");
            head=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;

    }
    void addLast(int data){
        Node newNode=new Node (data);
        if(head==null){
            System.out.println("Linked list is empty.");
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    Boolean Search(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
    return false;
    }
     
}
class SingleLL{
public static void main(String[]args){
    LL list=new LL();
    System.out.println(list.getSize());
    list.printList();
    list.addFirst(11);
    list.addFirst(22);
    list.addFirst(33);
    list.printList();
    list.addLast(44);
    list.addLast(55);
    list.printList();
    System.out.println(list.getSize());
    System.out.println(list.Search(33));
    

}
}