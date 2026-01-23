import java.util.Scanner;

public class Day06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1st - AP : 2,5,8,11...n term   nth term = a + (n-1)d
        System.out.println(" ");
        System.out.print("Enter the term value: ");
        int n = sc.nextInt();
        System.out.printf("AP upto %d term:",n);
        for (int i=2; i<=2+(n-1)*3; i+=3){
            System.out.print(" "+i);
        }

        // 2nd - Second method
        System.out.println(" \n");
        System.out.print("Enter the term value: ");
        int n1 = sc.nextInt();
        int a = 2, d = 3;
        System.out.printf("AP upto %d term:",n1);
        for (int i=1; i<=n; i++){
            System.out.print(" "+a);
            a += d;
        }

        // 3rd - HW : 99,95,91,87 .... last (+ve) number
        System.out.println(" \n");
        System.out.println("HW:");
        for (int i=99; i>=0; i-=4){
            System.out.print(i+" ");
        }

        // 4rth - GP : 1,2,4,8,...n term    nth term = a.2 ke power r-1 where r is common ration
        System.out.println(" \n");
        System.out.print("Enter the term value: ");
        int n2 = sc.nextInt();
        int a2 = 1, r2 = 2;
        System.out.printf("GP upto %d term:",n2);
        for (int i=1; i<=n2; i++){
            System.out.print(" "+a2);
            a2 *= r2;
        }

        // 5th - HW
        System.out.println(" \n");
        System.out.print("Enter the term value: ");
        int n3 = sc.nextInt();
        int n4 = n3;
        for (int i=1; i<=n3; i++){
            System.out.println(i+" "+n4);
            n4 -= 1;
        }

        // 6th - Alphabets with their ASCII value
        System.out.println(" ");
        for (int i=65; i<=90; i+=1){
            System.out.print((char) i+" "+i+" | ");
        }

        // 7th - Number is composite or prime
        System.out.println(" \n");
        System.out.print("Enter number: ");
        int x3 = sc.nextInt();
        if (x3<=1){
            System.out.println("Neither prime nor composite");
        }else {
            boolean isComposite = false; // flag concept
            for (int i=2; i<=Math.sqrt(x3); i++){
                if (x3%i==0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite){
                System.out.println("It is composite number");
            }else {
                System.out.println("It is prime number");
            }
        }
    }
}
