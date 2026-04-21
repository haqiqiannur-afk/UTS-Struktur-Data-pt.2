# Fungsi Rekrusif
Fungsi rekursif adalah teknik pemrograman di mana sebuah fungsi memanggil dirinya sendiri secara langsung maupun tidak langsung untuk menyelesaikan masalah. Fungsi ini memecah masalah kompleks menjadi sub-masalah yang lebih kecil, mengulangi proses hingga mencapai kondisi berhenti (base case) agar tidak terjadi perulangan tak terbatas.

Untuk UTS part 2 pada mata kuliah Struktur Data ini, kita disuruh untuk membuat deret Fibonacci dengan menggunakan fungsi rekrusif. </br>
</br> </br>

## Deskripsi tugas
Barisan Fibonacci  0, 1, 1, 2, 3, 5, 8, 13, 21, …. Dapat dinyatakan secara rekursif sebagai berikut:
<img width="294" height="128" alt="2" src="https://github.com/user-attachments/assets/157b1bbe-a247-4c29-93f2-9c8ac7edd53e" />
buat sebuah program Java yang dapat mencetak deret Fibonacci hingga suku ke-n menggunakan pendekatan rekursif
</br> </br>

## Code
```
package UTS;
import java.util.Scanner;

public class Fungsi_Rekrusif {
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
```
</br> </br>

## Output
Jika user memasukkan n = 7
<img width="588" height="246" alt="Screenshot 2026-04-21 133453" src="https://github.com/user-attachments/assets/b99dea31-018f-403d-b276-13b09113378b" />

Jika user memasukkan n = 9
<img width="624" height="227" alt="Screenshot 2026-04-21 133513" src="https://github.com/user-attachments/assets/18a75174-28d6-478a-89b3-cb89995ace5c" />

Jika user memasukkan n = 15
<img width="835" height="263" alt="Screenshot 2026-04-21 133536" src="https://github.com/user-attachments/assets/ff7dbc15-b512-40e8-8a1f-77724bed5148" />
