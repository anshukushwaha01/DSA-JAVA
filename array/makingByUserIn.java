import java.util.*;
public class makingByUserIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int x=4;

        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
             numbers[i]=sc.nextInt();
        }
        System.out.println();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println( "x founded "+numbers[i]);
            }
        }
    }
    
}
