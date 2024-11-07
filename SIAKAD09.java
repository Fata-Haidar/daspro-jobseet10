import java.util.Scanner;

public class SIAKAD09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah siswa: ");
        int p = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int c = sc.nextInt();
        
        
        int[][] nilai = new int[p][c];

       
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Inputkan nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + (totalPerSiswa / nilai[i].length)); 
        }

        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + (totalPerMatkul / nilai.length)); 
        }

       
    }
}