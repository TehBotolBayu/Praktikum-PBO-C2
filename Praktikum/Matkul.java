package Praktikum;

public class Matkul {
    private String nama;
    private int jumlah;

    public Matkul(String name, int jumlah){
        this.nama = name;
        this.jumlah = jumlah;
    }

    private void show (){
        System.out.println("Darah abangku tersisa : " + this.nama + this.jumlah);
    }

    protected void show2 () {
        show();
    }
}

class MatkulLanjut extends Matkul {
    public MatkulLanjut(String name, int jumlah) {
        super(name, jumlah);
    }

    protected void show3 () {
       show2();
    }
}
