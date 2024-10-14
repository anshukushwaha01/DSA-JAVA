public class solidRhombus {
    public static void main(String[] args) {
        int n=5; // row
        //rows
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n+1-i; j++){
                System.err.print("  ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }    
}
