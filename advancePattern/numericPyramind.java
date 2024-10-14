public class numericPyramind {
    public static void main(String[] args) {
        int n=5;
        //row
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            } 
            //number
            for(int j=1; j<=i; j++){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
    }    
}
