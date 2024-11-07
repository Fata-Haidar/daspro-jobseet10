import java.util.Scanner;
public class Tugasjobsheet10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double[] totalR = new double[10] ;
       double[] totalP = new double [6];
        int[][] survei = new int[10][6];
        double totalS=0;
        
        
        System.out.println("Masukkan nilai survei (1-5):");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                do {
                    System.out.print("Masukkan nilai pertnayaan ke-" + (j + 1) + ": ");
                    survei[i][j] = sc.nextInt();
                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
        }

        

        for (int k = 0; k < survei.length; k++) {
            
            for (int l = 0; l < survei[0].length; l++) {
                totalR[k] += survei[k][l];

            }
            
        }

       
       
        for (int p = 0; p < survei[0].length; p++) {
           
            for (int r = 0; r < survei.length; r++) {
                totalP[p] += survei[r][p];
                totalS+=survei[r][p];
            }
           
        }
        for (int x = 0; x < survei.length; x++) {
                totalR[x] /=6;

            System.out.println("Rata-rata responden ke-" +(x+1)+ ": "+totalR[x]);
        }
        for (int q = 0; q < survei[0].length; q++) {
            
                totalP[q] /=10;

   
            System.out.println("Rata-rata Pertanyaan ke-" +(q+1)+ ": "+totalP[q]);
        }

        
       
        totalS /=60;
        System.out.println("Rata-rata keseluruhan :" + totalS);
    
    }
}
