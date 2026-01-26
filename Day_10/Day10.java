import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Hollow rectangle
        System.out.println(" ");
        System.out.print("Enter row: ");
        int x1 = sc.nextInt();
        System.out.print("Enter column: ");
        int y1 = sc.nextInt();
        for (int i=1; i<=x1; i++){
            for (int j=1; j<=y1; j++){
                if (i==1 || i==x1 || j==1 || j==y1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 2nd - Star plus
        System.out.println(" ");
        System.out.print("Enter n(2): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=x2; j++){
                if (i==(x2-1)/2+1 || j==(x2-1)/2+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
