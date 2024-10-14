import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        if (num <= 1) {
            System.out.println("enter Number over then 1");
        }
        for (int i = 2; i <= num-1; i++) {
            if(num % i == 0){
                System.out.println("Not a prime number");
            }
        }
        System.out.println("Prime");
    }
}
