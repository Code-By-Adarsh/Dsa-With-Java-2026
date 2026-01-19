public class Day03 {
    public static void main(String[] args) {

        // 1st - BODMAS
        // *,/,% > + and -
        // In *,/ and % follows left-to-right

        // 2nd - +=, -=, *=
        // x += == x = x + 1
        // x -= == x = x - 1
        // x *= == x = x * 1

        // 3rd - x++ , ++x , x-- , --x
        int x = 10;
        System.out.println(x++); // 10
        System.out.println(x); // 11
        System.out.println(++x); // 12

        // 4rth
        System.out.println(" ");
        int x1 = 10;
        int y1 = x1++;
        System.out.println(x1+" "+y1);

        // 5th - Relational Operator
        System.out.println(" ");
        System.out.println(6.0==6);
    }
}
