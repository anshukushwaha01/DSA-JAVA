import java.util.*;
public class table {
    public static void main(String args[]){
        int userInput = new Scanner(System.in).nextInt();
        // for(int i=userInput; i<=userInput*10; i+=userInput){
        //     System.out.println(i);
        for(int i=userInput; i<=10; i++){
            int tableOf = userInput*i;
            System.out.println(tableOf);
        }
    }
}
