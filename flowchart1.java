import java.util.Scanner;
public class flowchart1 {
    public static void main(String[] args) {
        Scanner absen19 = new Scanner(System.in);
        double bil1, bil2, bil3;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = absen19.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = absen19.nextDouble();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = absen19.nextDouble();

        if ((bil1 > bil2) && (bil1 > bil3)) {
            System.out.println("Bilangan terbesar adalah: " + bil1);
        } else if ((bil2 > bil1) && (bil2 > bil3)) {
            System.out.println("Bilangan terbesar adalah: " + bil2);
        } else {
            System.out.println("Bilangan terbesar adalah: " + bil3);
        }

    }
}
