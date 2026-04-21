package UTS;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner suku = new Scanner(System.in);   
        System.out.print("Masukkan Jumlah Suku Fibonacci : ");
        int n = suku.nextInt();
        
        System.out.print("Deret Fibonacci hingga Suku ke-" + n + " adalah ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i));
            if (i < n) {
                System.out.print(" ");
            }
        }
        suku.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}