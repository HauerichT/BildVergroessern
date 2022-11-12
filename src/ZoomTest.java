public class ZoomTest {
    public static void main(String[] args) {

        // Testbild 1
        int[][] testbild1 = {{1,7,0},{1,0,3},{0,2,1}};
        Zoom zoom1 = new Zoom();
        zoom1.setImg(testbild1);

        System.out.println("Testbild1 f=2:");
        ausgabe(zoom1.zoom(2));

        System.out.println();

        System.out.println("Testbild1 f=3:");
        ausgabe(zoom1.zoom(3));

        System.out.println();

        // Testbild 2
        int[][] testbild2 = {{1,0,2},{4,2,4},{2,0,1}};
        Zoom zoom2 = new Zoom();
        zoom2.setImg(testbild2);

        System.out.println("Testbild2 f=2:");
        ausgabe(zoom2.zoom(2));

        System.out.println();

        System.out.println("Testbild2 f=3:");
        ausgabe(zoom2.zoom(3));
    }

    // Methode zum printen der vergrößerten Bilder
    public static void ausgabe(int[][] img) {
        for (int[] ints : img) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}