public class Day02 {
    public static void main(String[] args) {
        // 1st
        System.out.println(" ");
        double x = 5, y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        // 2nd - Area of Circle
        System.out.println(" ");
        double r = 9;
        double a = Math.PI*r*r;
        System.out.println(a);

        // 3rd HW - Volume of sphere
        System.out.println(" ");
        double r1 = 3.5;
        double v = 4/3*Math.PI*r1*r1*r1;
        System.out.println(v);

        // 4rth - Total surface area of cuboid
        System.out.println(" ");
        double l, b, h, ans;
        l = 2.5;
        b = 5;
        h = 7.8;
        ans = 2 * (l * b + b * h + h * l);
        System.out.println(ans);

        // 5th - Variable naming rule
        // Rule 1 - Can start with _ , alphabets and $
        // Rule 2 - Numbers accepted but in middle and end
        // Rule 3 - No any special characters allowed expect _ and $
        // Rule 4 - Spaces and commas are not allowed in variable
    }
}
