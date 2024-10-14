import java.util.*;

public class ageMagurement {
    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();
        if (age < 18) {
            System.out.println(age + " You are minor");
        } else {
            System.out.println("You can get Licence");
        }
    }
}
