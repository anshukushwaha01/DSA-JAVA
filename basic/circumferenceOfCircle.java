import java.util.*;

public class circumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        System.out.println(calculateCircum(radius));
    }

    // function to calculate circumference of circle
    public static double calculateCircum(float r) {
        double PI = 3.14159;
        double C = 2*r*PI;
        return C;
    }
}