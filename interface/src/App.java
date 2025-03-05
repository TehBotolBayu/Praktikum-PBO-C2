public class App {

    public static class Counter implements sop {
        public static int counter = 0;

        public static void add() {
            counter++;
        }

        public static void show() {
            System.err.println(counter);
        }

        @Override
        public void pembuka() {
            System.err.println("pembuka");
        }

        @Override
        public void utama() {
            System.err.println("utama");
        }

        @Override
        public void penutup() {
            System.err.println("penutup");
        }
    }

    public static void main(String[] args) throws Exception {
        Counter.show();
        Counter.add();
        Counter.show();
        Counter A = new Counter();
        A.pembuka();
    }
}
