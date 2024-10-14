import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check odd Even");
        int num = sc.nextInt();

        System.out.println(calOddEven(num));
    }    

    // fucntion to calculate odd even
    public static String calOddEven(int n){
        if(n%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
