import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên của bạn: ");
        String hoTen = scanner.nextLine();
        
        System.out.println("Họ và tên của bạn là: " + hoTen);
        
        scanner.close();
    }
}