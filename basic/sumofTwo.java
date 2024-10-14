import java.util.*;
public class sumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First Number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        
        int sum = calculate(a,b);
        System.err.println("sum of aand b : "+ sum);
    }

    public static int calculate(int num1, int num2){
        return num1+num2;
    }
}
