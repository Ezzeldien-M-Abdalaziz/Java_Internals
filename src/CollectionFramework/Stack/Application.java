package CollectionFramework.Stack;

import CollectionFramework.List.Guest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Application {

    public static void main(String[] args) {

        Deque<String> messageStack = new ArrayDeque<>();

        messageStack.push("Message 1");
        messageStack.push("Message 2");
        messageStack.push("Message 3");
        messageStack.push("Message 4");

        print(messageStack);

        System.out.println(messageStack.pop());
        System.out.println(messageStack.pop());
        System.out.println(messageStack.peek());

        print(messageStack);

    }


    public static void print(Deque<String> deque) {
        System.out.format("%n---Deque Contents---%n");

        int x = 0;
        for (String msg : deque) {
            System.out.format("%x : %s %s %n", x++, msg , x== 1? "(Top)" :"");

        }
        System.out.println("");
    }
}
