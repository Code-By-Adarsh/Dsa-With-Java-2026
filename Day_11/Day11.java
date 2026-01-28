import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - Star Triangle Vertically Flipped
        System.out.println(" ");
        System.out.print("Enter n(1): ");
        int x1 = sc.nextInt();
        for (int i=1; i<=x1; i++){
            for (int j=1; j<=x1; j++) {
                if (j>=((x1+1)-i)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        // 2nd - Number Triangle Vertically Flipped
        System.out.println(" ");
        System.out.print("Enter n(2): ");
        int x2 = sc.nextInt();
        for (int i=1; i<=x2; i++){
            // Method - 1
            int y2 = 1;
            for (int j=1; j<=x2; j++){
                if (j>=(x2+1)-i){
                    System.out.print(y2+" ");
                    y2++;
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
            /*
            Method - 2
            int y2 = 1;
            for (int j=1; j<=x2; j++){
                if (i+j>x2){
                    System.out.print(y2+" ");
                    y1++;
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
             */
        }

        // 3rd - Star Triangle Vertically Flipped
        // Method - Best
        System.out.println(" ");
        System.out.print("Enter n(3): ");
        int x3 = sc.nextInt();
        for (int i=1; i<=x3; i++){
            for (int j=1; j<=x3-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 4rth - Number Triangle Vertically Flipped (Method - Best)
        System.out.println(" ");
        System.out.print("Enter n(4): ");
        int x4 = sc.nextInt();
        for (int i=1; i<=x4; i++){
            for (int j=1; j<=x4-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        // 5th - Alphabet Triangle Vertically Flipped (Method - Best)
        System.out.println(" ");
        System.out.print("Enter n(5): ");
        int x5 = sc.nextInt();
        for (int i=1; i<=x5; i++){
            for (int j=1; j<=x5-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print((char) (i+64)+" ");
            }
            System.out.println(" ");
        }

        // 6th - Rhombus
        System.out.println(" ");
        System.out.print("Enter n(6): ");
        int x6 = sc.nextInt();
        int y6 = (x6+1)/2;
        for (int i=1; i<=y6; i++){
            for (int j=1; j<=y6-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=y6; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 7th - HW
        System.out.println(" ");
        System.out.print("Enter n(7): ");
        int x7 = sc.nextInt();
        for (int i=1; i<=x7; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=x7-(i-1); j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 8th - Pyramid - 1st Method
        System.out.println(" ");
        System.out.print("Enter n(8): ");
        int x8 = sc.nextInt();
        for (int i=1; i<=x8; i++){
            for (int j=1; j<=x8-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // 9th - Pyramid - 2nd Method
        System.out.println(" ");
        System.out.print("Enter n(9): ");
        int x9 = sc.nextInt();
        int nsp = x9-1; // no.of spaces
        int nst = 1; // no. of stars
        for (int i=1; i<=x9; i++){
            for (int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp -= 1;
            nst += 2;
            System.out.println(" ");
        }
    }
}
