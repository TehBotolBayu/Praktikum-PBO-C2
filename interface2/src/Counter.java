public class Counter implements sop {

    public static int count = 0;

    public static void add() {
        count++;
    }

    public static void show() {
        try {
            System.out.println(count);
        } catch (Exception e) {
        }
    }

    @Override
    public void pembukaan() {
        System.out.println("buka");
    }

    @Override
    public void utama() {
        System.out.println("utama");
    }

    @Override
    public void penutup() {
        System.out.println("tutup");
    }

}