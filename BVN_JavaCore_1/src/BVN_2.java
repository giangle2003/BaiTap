import java.util.Scanner;

public class BVN_2 {
    public static boolean checkPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //số hoàn hảo là tổng ước = chính nó
    public static boolean checkPerfectNumber(int a) {
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập a : ");
        int a = input.nextInt();

        if (checkPrime(a)) {
            System.out.println(a + " là số nguyên tố!");
        } else {
            System.out.println(a + " không là số nguyên tố!");
        }
        if (checkPerfectNumber(a)) {
            System.out.println(a + " là số hoàn hảo!");
        } else {
            System.out.println(a + " không là số hoàn hảo!");
        }
    }
}
