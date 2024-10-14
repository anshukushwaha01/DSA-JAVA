import java.util.*;
public class que7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Starting point2");
        int start = sc.nextInt();
        System.out.println("enter ending point");
        int ending = sc.nextInt();

        findPosNegZero(start,ending);

    }

    // function to find positive negative and zero 
    public static void findPosNegZero(int st,int end){
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=st; i<=end; i++){
            if(i<0){
                System.out.println("negative"); 
                 positive +=i;
                 
            }
            else if (i>0) {
                System.out.println("positive");
                negative +=i;
            }
            else{
                System.out.println("zero");
                zero +=i;
            }
        }
    }
}
