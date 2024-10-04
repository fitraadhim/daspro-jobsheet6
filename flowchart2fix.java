import java.util.Scanner;
public class flowchart2fix {
    public static void main(String[] args) {
        Scanner absen19 = new Scanner(System.in);
        float diskon;
        String jenisBuku;
        int jumlahBuku;

        System.out.print("Masukkan jenis buku (kamus/novel/komik): ");
        jenisBuku = absen19.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = absen19.nextInt();

            if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = 0.10f;
                if (jumlahBuku > 2) {
                    diskon += 0.02f;
                System.out.println("Total diskon: " + diskon);
                }

            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = 0.07f;
                if (jumlahBuku > 3) 
                    diskon += 0.02f;
                else 
                   diskon += 0.01f;
            
            System.out.println("Total diskon: " + diskon);

            } else  {
            if (jumlahBuku > 3)
            diskon = 0.05f;
            else    
            diskon = 0f;
                System.out.println("Total diskon: " + diskon);
            }     
    }  
}


