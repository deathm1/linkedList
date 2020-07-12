import java.util.*;

public class stackUsingQueue {


    //reff : https://www.geeksforgeeks.org/implement-a-stack-using-single-queue/


    Queue<Integer> queue = new LinkedList<Integer>();

     void pushOperation(int payload){


        queue.add(payload);


        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element
        for (int i = 0; i < queue.size(); i++)
        {
            // this will add front element into
            // rear of queue
            int x = queue.remove();
            queue.add(x);
        }


    }


    int popOperation(){
        if(queue.isEmpty()){
            System.out.println("No elements");
            return 404;
        }
        int x = queue.remove();
        return x;
    }

    int top(){
        if (queue.isEmpty()) {
            return 404;
        }
        return queue.peek();
    }


    boolean isEmpty()
    {
        return queue.isEmpty();
    }


    public static void main(String[] args){
        stackUsingQueue stackUsingQueue = new stackUsingQueue();

        stackUsingQueue.pushOperation(10);
        stackUsingQueue.pushOperation(20);
        System.out.println("Top element :" + stackUsingQueue.top());
        stackUsingQueue.popOperation();
        stackUsingQueue.pushOperation(30);
        stackUsingQueue.popOperation();
        System.out.println("Top element :" + stackUsingQueue.top());

    }
}
