import java.util.*;
public class table {
    public static void main(String[] args) {
        System.out.println("ente a nubmer to Print table");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int n = new Scanner(System.in).nextInt();
        //call fucntion to print table
        printTable(n);
    }
    public static void printTable(int digit){
        for(int i=1; i<=10; i++){
            System.out.println(digit+" * "+i+" = "+digit*i);
        }
    }
}

