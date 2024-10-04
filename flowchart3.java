import java.util.Scanner;
public class flowchart3 {
    public static void main(String[] args) {
        Scanner absen19 = new Scanner(System.in);
        String kategori, merk;
        byte ukuran;

        System.out.print("Silahkan Masukan Merk = ");
        merk = absen19.nextLine();
        System.out.print("Silahkan Masukan Kategori = ");
        kategori = absen19.nextLine();
        System.out.print("Silahkan Masukan Ukuran = ");
        ukuran = absen19.nextByte();
        float harga;

        if (merk.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
            if (ukuran <= 40) {
            if (ukuran >= 36) {
                harga = 800000;
                System.out.println("Harga = " + harga);
                } else {
                System.out.println("Ukuran tersebut tidak ada");
                }
                } else {
                    System.out.println("Ukuran tersebut tidak ada");
                }
        } else if (kategori.equalsIgnoreCase("High Top")) {
            if (ukuran >= 40) {
            if (ukuran <= 44) {
                    harga = 1200000;
                    System.out.println("Harga = " + harga);
            } else {
                        System.out.println("Ukuran tersebut tidak ada");
                    }
            } else {
                    System.out.println("Ukuran tersebut tidak ada");
                }
            } else {
                System.out.println("Tidak ada kategori tersebut");
            }
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman")) {
            if (ukuran <= 41) {
            if (ukuran >= 36) {
                harga = 1000000;
                System.out.println("Harga = " + harga);
            } else {
                System.out.println("Ukuran tersebut tidak ada");
                }
            } else System.out.println("Ukuran tersebut tidak ada");
                
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuran <= 44) {
                    if (ukuran >= 41) {
                        harga = 1500000;
                        System.out.println("Harga = " + harga);
                    } else {
                        System.out.println("Ukuran tersebut tidak ada");
                    }
                } else {
                    System.out.println("Ukuran tersebut tidak ada");
                }
            } else {
                System.out.println("Tidak ada kategori tersebut");
            }
        } else if (merk.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuran <= 40) {
                if (ukuran >= 36) {
                    harga = 750000;
                    System.out.println("Harga = " + harga);
                } else {
                    System.out.println("Ukuran tersebut tidak ada");
                }
                } else {
                    System.out.println("Ukuran tersebut tidak ada");
                }
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuran <= 44) {
                if (ukuran >= 41) {
                    harga = 1000000;
                    System.out.println("Harga = " + harga);
                } else {
                    System.out.println("Ukuran tersebut tidak ada");
                }
                } else {
                System.out.println("Ukuran tersebut tidak ada");
                }
                } else {
                System.out.println("Kategori tersebut tidak ada");
                }
                } else {
            System.out.println("Merk tersebut tidak ada");
        }
    }
}
    
