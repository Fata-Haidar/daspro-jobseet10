import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        String nama, next;
        int baris, kolom;
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("-  Menu1:Input data penonton");
            System.out.println("-  Menu2:Tampilkan daftar penonton");
            System.out.println("-  Menu3:Exit");
            System.out.print("Pilih menu (1-3): ");
            char pilihan = sc.next().charAt(0);
            sc.nextLine(); 
            switch (pilihan) {
                case '1':
                while (true) {
                    System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                        System.out.println("Silakan masukkan baris dan kolom yang berbeda.");
                    }
                    else{
                        penonton[baris - 1][kolom - 1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("n")) {
                    break;
                } 
                    }
                } else {
                    System.out.println("Baris atau kolom tidak valid! Harap masukkan nilai yang benar.");
                }
                
    
                
            }
            break;
                

                case '2':
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.print(penonton[i][j]);
                                if (j < penonton[i].length - 1) {
                                    System.out.print(", ");
                                }
                            }if (penonton[i][j] == null) {
                                System.out.print(" ***");
                                if (j < penonton[i].length - 1) {
                                    System.out.print(", ");
                                }
                            }
                        }
                        System.out.println();
                    }
                    System.out.print("Apakah mau kembali ke menu? (y): ");
                next = sc.nextLine();
                if (next.equalsIgnoreCase("y")) {
                    break;}

                case '3':
                    System.out.println("Terima kasih!");
                    
                    return; 

               
            }
        }
    }
}