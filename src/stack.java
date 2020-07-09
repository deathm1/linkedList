import java.util.*;
public class stack {

    //Implementation of stack using Java Linked list
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sizeOfStack = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0; i<sizeOfStack; i++){
            list.add(sc.nextInt());
        }




        //Displaying the elements of the linked list
        //Use the iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();




        //Prints the elements in last in first out
        for(int i=list.size()-1; i!=-1; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Adding elements in between the list
        //This shows the flexibility of linked list
        int index = sizeOfStack/2;
        list.add(index,100);

        //Prints the elements in last in first out
        for(int i=list.size()-1; i!=-1; i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();




        list.addLast(144);
        list.addFirst(225);
        for(int i=list.size()-1; i!=-1; i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}
