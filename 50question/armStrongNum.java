import java.util.*;

public class armStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();

        calculateArmstrongNum(number);
    }

    public static void calculateArmstrongNum(int num) {
        String n = String.valueOf(num); 
        int nx = n.length(); 
        int temp = 0;
        for (int i = 0; i < nx; i++) { 
            int digit = Character.getNumericValue(n.charAt(i)); 
            temp += Math.pow(digit, nx); 
        }

        if (temp == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
