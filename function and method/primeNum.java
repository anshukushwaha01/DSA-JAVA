import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to prime or not");
        int n=sc.nextInt();

        System.out.println(calculatePrime(n));
        // calculatePrime(n);

    }
    public static String calculatePrime(int num) {
        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                return "is not a prime number";
            }
        }
        return "is a Prime number";
    }
}
