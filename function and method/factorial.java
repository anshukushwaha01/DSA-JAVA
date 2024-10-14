import java.util.*; // for taking user input

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        calculateFactorial(n);
    }

    public static void calculateFactorial(int num) {
        if (num < 2 || num == 0) {
            System.out.println("Majak nhi");
            return;
        }
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
        return;
    }
}
