import java.util.Scanner;

public class greeting {
    public static void main(String args[]) {
        Scanner btn = new Scanner(System.in);
        int button = btn.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Salam");
                break;
        }
    }
}
