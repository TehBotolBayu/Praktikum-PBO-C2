public class App {

    public static void main(String[] args) throws Exception {
        Counter.add();
        Counter.show();

        try {
            int a = 0;
            int b = 5;
            int c = b/a;
            System.out.println("berhasil");
        } catch (Exception e) {
            System.out.println("error");
        }
        finally {
            System.out.println("selsai");
        }

        System.out.println("lanjut");
    }
}
