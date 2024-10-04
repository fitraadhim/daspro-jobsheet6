import java.util.Scanner;
public class flowchart2 {
    public static void main(String[] args) {
        Scanner absen19 = new Scanner(System.in);
        float diskon;
        String jenisBuku;
        int jumlahBuku;
        ;
        
        System.out.print("Masukkan jenis buku : ");
        jenisBuku = absen19.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku;
         = absen19.nextInt();
        
        if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 0.10f;
            if(jumlahBuku;
             > 2)
            diskon = 0.12f;

            System.out.println("Total Diskon = " + diskon);
            
        } else if (jenisBuku.equalsIgnoreCase("Komik")) {
            diskon = 0.07f;
            if (jumlahBuku;
             > 3) 
            diskon = 0.09f;
            else if (jumlahBuku;
             < 3 || jumlahBuku;
             == 3)
            diskon = 0.08f;
            
            System.out.println("Total Diskon = " + diskon);
            
            
        } else if (!jenisBuku.equalsIgnoreCase("Novel") && !jenisBuku.equalsIgnoreCase("Komik")) {
            diskon = 0.05f;
            if (jumlahBuku;
             > 3)
            diskon = 0.05f;
            System.out.println("Total Diskon = " + diskon);
        
        } else 
            diskon = 0f;
            
            
            
            absen19.close();
        }
                    
                    
        }