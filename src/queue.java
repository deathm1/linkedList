import java.util.*;

public class queue {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int sizeOfTheQueue = Integer.parseInt(sc.nextLine());

        //Our queue in a linked list presentation
        LinkedList<String> queue = new LinkedList<String>();

        for (int i = 0; i<sizeOfTheQueue; i++){
            queue.addFirst(sc.nextLine());
        }

        Iterator <String> iterator = queue.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        for (int i=0; i<sizeOfTheQueue; i++){
            int token = i +1;
            System.out.print("Token : "+token+" Member: "+queue.getLast() + "  | ");
            queue.removeLast();

            System.out.print("Queue : ");
            Iterator <String> iterator11 = queue.iterator();
            while (iterator11.hasNext()){
                System.out.print(iterator11.next() + " ");
            }
            System.out.println();
        }




    }
}
