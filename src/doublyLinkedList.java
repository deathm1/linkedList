public class doublyLinkedList{



    //create node
    class Node{
        int data;
        Node previous;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }


    //Represent the head and tail of the doubly linked list
    Node head = null;
    Node tail = null;

    public void addNode(int data){

        //Create a new node
        Node newNode = new Node(data);


        if(head == null){
            //Both head and tail will point to newNode
            head = newNode;
            tail = newNode;

            //head's previous will point to null
            head.previous = null;
            //tail's next will point to null, as it is the last node of the list
            tail.next = null;
        }

        else{
            //current tail
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;

            //newNode will become new tail
            tail = newNode;

            // ^^new nodes current tail
            //As it is last node, tail's next will point to null
            tail.next = null;
        }

    }

    public void display(){
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Prints each node by incrementing the pointer.
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args){
        doublyLinkedList dList = new doublyLinkedList();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        //Displays the nodes present in the list
        dList.display();
    }
}