import java.util.*;

public class calculateAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int aver = average(a,b,c);
        System.out.println("Average of " + aver);
    }

    public static int average(int n1, int n2, int n3) {
        int total = n1 + n2 + n3;
        int avg = total / 3;
        return avg;
    }
}
