import java.util.Scanner;

public class MaxInteger {
    static void FindMax(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thu 1:");
        int x = scanner.nextInt();
        System.out.println("Nhap so thu 2:");
        int y = scanner.nextInt();
        System.out.println("Nhap so thu 3");
        int z = scanner.nextInt();
        if (x > y && x > z) {
            System.out.printf("%d la so lon nhat", x);
        }
        else if (y > x && y > z) {
            System.out.printf("%d la so lon nhat", y);
        }
        else
            System.out.printf("%d la so lon nhat", z);
        
    }
}
