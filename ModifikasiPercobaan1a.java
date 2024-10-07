import java.util.Scanner; 

public class ModifikasiPercobaan1a { 
public static void main(String[] args) { 
Scanner absen26 = new Scanner(System.in); 
int tahun; 
System.out.print("Masukkan Tahun: "); 
tahun = absen26.nextInt(); 

if ((tahun % 4) == 0) {
if ((tahun % 100) != 0) 
System.out.println("Tahun Kabisat");
else if((tahun % 400 == 0)) 
System.out.println("Tahun Kabisat"); 
} else {
System.out.println("Bukan Tahun Kabisat"); }
}
}
