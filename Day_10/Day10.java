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
        System.out.print("Enter n(2+odd): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            for (int j=1; j<=x2; j++){
                if (i==x2/2+1 || j==x2/2+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 3rd - Challenge Triangle
        System.out.println(" ");
        System.out.print("Enter n(3) columns: ");
        int x3 = sc.nextInt();
        int y3 = (x3+1)/2;
        int z3 = (int) Math.ceil((double) x3/2);
        for (int i=1; i<=y3; i++){
            for (int j=1; j<=x3; j++){
                if (j>=z3-(i-1) && j<=z3+(i-1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 4rth - HW - Star Cross
        System.out.println(" ");
        System.out.print("Enter n(4+odd): ");
        int x4 = sc.nextInt();
        for (int i=1; i<=x4; i++){
            for (int j=1; j<=x4; j++){
                if (i==j || (i+j)==x4+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }

        // 5th - Floyd's Triangle
        System.out.println(" ");
        System.out.print("Enter n(5): ");
        int x5 = sc.nextInt();
        int y5 = 1; // helper
        for (int i=1; i<=x5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(y5+" ");
                y5++;
            }
            System.out.println(" ");
        }

        // 6th - Binary Triangle
        System.out.println(" ");
        System.out.print("Enter n(6): ");
        int x6 = sc.nextInt();
        for (int i=1; i<=x6; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2 == 0){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
            System.out.println(" ");
        }

        // 7th - Odd Number Triangle
        System.out.println(" ");
        System.out.print("Enter n(7): ");
        int x7 = sc.nextInt();
        for (int i=1; i<=x7; i++){
            int y7 = 1;
            for (int j=1; j<=i; j++){
                System.out.print(y7+" ");
                y7 += 2;
            }
            System.out.println(" ");
        }

        // 8th - Star Triangle Vertically Flipped
        System.out.println(" ");
        System.out.print("Enter n(8): ");
        int x8 = sc.nextInt();
        for (int i=1; i<=x8; i++){
            for (int j=1; j<=x8; j++){
                if ((i+j)>x8){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
