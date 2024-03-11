import java.util.Scanner;

public class BVN_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = input.nextInt();
        System.out.println("Nhập số b: ");
        int b = input.nextInt();


        while (true) {
            System.out.println("-------------- MENU ----------");
            System.out.println("1. Tính tổng hai số");
            System.out.println("2. Tính hiệu hai số");
            System.out.println("3. Tính tích hai số");
            System.out.println("4. Tính thương hai số");
            System.out.println("0. Thoát");
            System.out.println("--------------------------");
            System.out.println("Nhập lựa chọn của bạn");

            int opt = input.nextInt();

            switch (opt) {
                case 1:
                    int c = a + b;
                    System.out.println("a + b = " + c);
                    break;
                case 2:
                    int d = a - b;
                    System.out.println("a - b = " + d);
                    break;
                case 3:
                    int e = a * b;
                    System.out.println("a * b = " + e);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Không thể chia cho 0");
                    } else {
                        float g = (float) a / b;
                        System.out.println("a / b = " + g);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không phù hợp.Vui lòng chọn lại!!!");
            }
        }
    }
}
