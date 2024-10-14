import java.util.*;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();

        greeting(msg);
    }

    public static void greeting(String msg){
        System.out.println(msg);
    }
}