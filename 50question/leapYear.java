import java.util.*;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any year to check leap year");
        int year = sc.nextInt();
        validateLeapYear(year);
    }  
    
    //function to calculate leap year
    public static void validateLeapYear(int year){
        if(year%4==0){
            System.out.println("leap Year");

        }
        else{
            System.out.println("not a Leap year");
        }

    }
}
