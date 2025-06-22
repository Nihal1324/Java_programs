 class LL{
    Node head;
            class Node{
                int data;
                Node next;
                Node(int data){
                    this.data=data;
                    this.next=next;
                }
            }
                void printList(){
                    if(head == null){//if there is no data in the linked list...
                        System.out.println("The list is empty >>> 0");
                        return;

                    }
                }

                void addFirst(int data){
                    Node newNode=new Node(data);
                    if(head==null){//if there is no data in the linked list...
                        head=newNode;//newNode is assigned to head ,i.e. this will become the first value;
                        return;
                    }
                    newNode.next=head;//newNode ka next HEAD ko point kerega aur uske baad abb, jo head hai vo new node ko point keraga (i.e., head ban jaga newnode ka head ). 
                    head=newNode;

                }
            }

  class LinkedListPractice{
    public static void main (String [] args){
        LL list=new LL();
        list.printList();
        list.addFirst(111);
        list.addFirst(222);
        list.addFirst(333);
        list.addFirst(444);
        list.addFirst(555);
        list.printList();

    }
  }
