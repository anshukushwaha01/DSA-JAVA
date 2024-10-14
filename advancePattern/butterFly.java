public class butterFly{
    public static void main(String[] args){
        int n=5;
        //upper part
        for(int i=1; i<=n; i++){
            //first part (1) star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //second part (2) star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }        
            System.out.println();
        }

        //lower part
        for(int i=n; i>=1; i--){
            //first part (1) star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //second part (2) star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }        
            System.out.println();
        }
        
    }
}