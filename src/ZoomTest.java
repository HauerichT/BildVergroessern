public class ZoomTest {
    public static void main(String[] args) {

        int[][] testbild = {{1,0},{0,2}};
        int f = 2;

        Zoom zoom = new Zoom();
        zoom.setImg(testbild);
        ausgabe(zoom.zoom(f));
    }

    public static void ausgabe(int[][] img) {
        for ( int i = 0; i < img.length; i++ ) {
            for ( int j = 0; j < img[i].length; j++ ) {
                System.out.print( img[i][j] + " ");
            }
            System.out.println();
        }
    }
}