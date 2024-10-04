import java.util.Scanner;

public class Pemilihan2percobaan319 {
    public static void main(String[] args) {
        Scanner absen19 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak;
        
            System.out.print("masukkan kategori :");
            kategori = absen19.nextLine();
            System.out.print("Masukkan Besarnya penghasilan : ");
            penghasilan = absen19.nextInt();
                
                if (kategori.equalsIgnoreCase("pekerja")) {
                    if (penghasilan <= 2000000)
                    pajak = 0.1;
                else if (penghasilan <= 3000000)
                    pajak = 0.15;
                else
                    pajak = 0.2;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasilan Bersih : " + gajiBersih);
            } else if (kategori.equals("PEBISNIS")) {
                if (penghasilan <= 2000000)
                    pajak = 0.15;
                else if (penghasilan <= 3500000)
                    pajak = 0.2;
                else 
                    pajak = 0.25;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasilan Bersih : " + gajiBersih);
                
            } else 
                System.out.println("Masukkan kategori salah ");

    }
}
