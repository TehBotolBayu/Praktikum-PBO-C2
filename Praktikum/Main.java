package Praktikum;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;

 class Mahasiswa{
    public String nim;
    public String nama;
    public int umur;

    public Mahasiswa(String nim, String nama, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
    }

    public void sapa() {
        System.out.println("Hai");
    }

    public int satu() {
        return 1;
    }
}

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

    public static void tambah(ArrayList<Mahasiswa> unmul) throws IOException{
        String nama, nim;
        int umur;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        String namainp = br.readLine();
        String niminp = br.readLine();
        int umurinp = Integer.parseInt(br.readLine());

        Mahasiswa baru = new Mahasiswa(namainp, niminp, umurinp);

        unmul.add(baru);
    }

    public static void hapus(ArrayList<Mahasiswa> unmul) throws IOException{
        int index;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        index = Integer.parseInt(br.readLine());
        unmul.remove(index);
    }

    public static void main(String[] args) throws IOException{

        ArrayList<Mahasiswa> unmul = new ArrayList<>();
        boolean jalan = true;
        Scanner input = new Scanner(System.in);
        while(jalan){
            System.out.println("1. Tampilkan mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.println("3. Tambah mahasiswa");
            System.out.println("4. keluar");
    
            // menu = input.nextInt();
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
                default:
                    input.close();
                    jalan = false;
                    break;
            }
        }
    }
}

