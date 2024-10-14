import java.util.*;
public class sumOfN {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int sum = 0;
        for(int i=0; i<=number; i++){
            int sumOfNatural = sum+=i;
            System.out.println(sumOfNatural);
        }
    }
}
