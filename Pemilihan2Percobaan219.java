import java.util.Scanner;

public class Pemilihan2Percobaan219 {
    public static void main(String[] args) {
        Scanner absen19 = new Scanner(System.in);
        int menu, harga;
        String member;
        double total_bayar, diskon;
        
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = absen19.nextInt();
        absen19.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = absen19.nextLine();
        System.out.println("------------------------------------");
            if (member.equalsIgnoreCase("y")) {
                diskon = 0.10;
                System.out.println("besar diskon = 10%.");
                if (menu == 1) {
                    harga = 14000;
                    System.out.println("Harga Ricebowl = " +harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bunding = " + harga);
            } else {
                System.out.println("Masukkan menu dengan benar");
                return;
            }
        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar); }
        else if (member.equalsIgnoreCase("n")) {
                if (menu == 1) {
                    harga = 3000;
                    System.out.println("Harga Ricebowl = " + harga);
                } else if (menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice Tea = " + harga);
                } else if (menu == 3) {
                    harga = 15000;
                    System.out.println("Harga Bundling = " + harga);
                } else  {                    
                    System.out.println("Masukkan menu dengan benar");
                    return;
                }

                System.out.println("Total bayar = " + harga);
                
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("------------------------------------");
        
    }
}
