package Classes;

public class Mahasiswa {
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