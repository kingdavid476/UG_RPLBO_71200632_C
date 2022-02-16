import java.util.*;
public class main {
    public static void main(String[] args) {
        Mobil M_71200632 = new Mobil();
        PejalanKaki P_71200632 = new PejalanKaki();
        Scanner inp = new Scanner(System.in);
        System.out.println("1 = Hijau");
        System.out.println("2 = Kuning");
        System.out.println("3 = Merah");
        System.out.println("Masukkan kode lampu lalu lintas : ");
        int lampu = inp.nextInt();
        if (lampu == 1){
            M_71200632.jalan();
            P_71200632.menunggu();
        }else if (lampu == 2){
            M_71200632.kurangiKecepatan();
            P_71200632.bersiap();
        }else if (lampu == 3){
            M_71200632.berhenti();
            P_71200632.menyebrang();
        }else {
            System.out.println("Kode lalu lintas tidak valid")
        }
    }
}
