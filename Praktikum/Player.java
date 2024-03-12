package Praktikum;

public class Player {

    String name;
    int HP;
    int MP;
    int SPD;
    int DEF;
    float CRT;
    int poin;
    
    public Player(String name, int HP, int MP, int SPD, int DEF, float CRT){
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.SPD = SPD;
        this.DEF = DEF;
        this.CRT = CRT;
    }

    void TakeDamage (int damage){
        this.HP -= damage;

        System.out.println("Darah abangku tersisa : " + this.HP);
    }

    void tambahpoin(int poinBaru) {
        this.poin += poinBaru;
    }

    void kalah() {
        if (this.HP <= 0 ){
            System.out.println("Sudah kalah abangkuh");
        } else {
            System.out.println("lanjut abangku");
        }
    }

    void menang() {
        if (this.poin > 5000){
            System.out.println(" Menang abangkuh 🔥");
        } else {
            System.out.println(" semangat abangkuh 🔥");

        }

    }

}
