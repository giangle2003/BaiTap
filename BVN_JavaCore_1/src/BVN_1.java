import java.util.Scanner;

public class BVN_1 {
    public static void main(String[] args) {
        float a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số a : ");
        a = input.nextFloat();
        System.out.println("Nhập số b : ");
        b = input.nextFloat();
        System.out.println("Nhập số c : ");
        c = input.nextFloat();

        float sum = a + b + c;
        System.out.println("a + b + c = " + sum);

        float max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Max : " + max);
    }
}
