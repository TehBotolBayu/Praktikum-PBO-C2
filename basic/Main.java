
import java.util.ArrayList;
import java.util.Scanner;

import Classes.Buku;
import Classes.Mahasiswa;
import Classes.Matkul;
import Classes.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //pendataan mahasiswa
    public static int menu;

    public static void tampil(ArrayList<Mahasiswa> unmul){
        for(int i = 0; i < unmul.size(); i++){
            System.err.println("Mahasiswa ke "+i);
            System.out.println(unmul.get(i).nama);
            System.out.println(unmul.get(i).nim);
            System.out.println(unmul.get(i).umur);
        }
    }

    public static void tampilBuku(ArrayList<Buku> buku){
        for(int i = 0; i < buku.size(); i++){
            System.err.println("buku ke "+i);
            System.out.println(buku.get(i).getNama());
            System.out.println(buku.get(i).getPenulis());
            System.out.println(buku.get(i).getNoBuku());
        }
    }

    public static void tambah(ArrayList<Mahasiswa> unmul) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String namainp = br.readLine();
        String niminp = br.readLine();
        int umurinp = Integer.parseInt(br.readLine());

        Mahasiswa baru = new Mahasiswa(namainp, niminp, umurinp);
        unmul.add(baru);
    }

    public static void tambahMatkul(ArrayList<Matkul> matakuliah) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String namainp = br.readLine();
        int jumlahinp = Integer.parseInt(br.readLine());

        Matkul baruMatkul = new Matkul(namainp, jumlahinp);

        matakuliah.add(baruMatkul);
    }

    public static void tambahBuku(ArrayList<Buku> buku) throws IOException{
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String namainp = br.readLine();
        String penulis = br.readLine();
        String nomorBuku = br.readLine();

        Buku baruBuku = new Buku();
        baruBuku.setNama(namainp);
        baruBuku.setPenulis(penulis);
        baruBuku.setNoBuku(nomorBuku);

        buku.add(baruBuku);
    }

    public static void hapus(ArrayList<Mahasiswa> unmul) throws IOException{
        int index;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        index = Integer.parseInt(br.readLine());
        unmul.remove(index);
    }

    public static void nerimaDamage(Player mage) {
        mage.TakeDamage(20);
    }

    public static void buatPlayerJadiKalah (Player mage){
        mage.kalah();
    }

    public static void buatPlayerJadiMenang (Player mage){
        mage.menang();
    }

    public static void nambahpoin (Player mage){
        mage.tambahpoin(2000);
    }

    public static void main(String[] args) throws IOException{
        Player mage = new Player("Farrel", 120, 500, 3, 50, 40);

        ArrayList<Mahasiswa> unmul = new ArrayList<>();
        ArrayList<Matkul> matakuliah = new ArrayList<>();
        ArrayList<Buku> buku = new ArrayList<>();
        boolean jalan = true;
        Scanner input = new Scanner(System.in);
        while(jalan){
            System.out.println("1. Tampilkan mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.println("3. Tambah mahasiswa");
            System.out.println("4. keluar");
            System.out.println("5. damage player");
            System.out.println("6. kalah player");
            System.out.println("7. meanng player");
            System.out.println("8. tambah poin player");
            System.out.println("9. Tambah matkul");
            System.out.println("10. Tambah buku");
            System.out.println("11. Tampilkan buku");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    tampil(unmul);
                    break;
                case 2:
                    hapus(unmul);
                    break;
                case 3:
                    tambah(unmul);
                    break;
                case 5:
                    nerimaDamage(mage);
                    break;
                case 6:
                    buatPlayerJadiKalah(mage);
                    break;
                case 7:
                    buatPlayerJadiMenang(mage);
                    break;
                case 8:
                    nambahpoin(mage);
                    break;
                case 9:
                    tambahMatkul(matakuliah);
                    break;
                case 10:
                    tambahBuku(buku);
                    break;
                case 11:
                    tampilBuku(buku);
                        break;
                default:
                    input.close();
                    jalan = false;
                    break;
            }
        }
    }
}

