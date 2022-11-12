import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;

public class Zoom {

    private int[][] img;

    public void setImg (int[][] img) {

        // prüft, ob leere Arrays übergeben werden
        if (img == null || img.length == 0) {
            System.out.println("null-Referenz oder ein leeres Array gefunden.");
            System.exit(0);
        }

        // prüft, ob Werte innerhalb des Wertebereichs
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                if (img[i][j] < 0 || img[i][j] > 7) {
                    System.out.println("Array enthält Wert außerhalb des Wertebereichs [0,7].");
                    System.exit(0);
                }
            }
        }

        // prüft, ob Array NxN groß
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                if (img.length != img[i].length) {
                    System.out.println("Array ist nicht NxN groß.");
                    System.exit(0);
                }
            }
        }

        this.img = img;
    }

    public int[][] zoom (int f) {

        int[][] imgZoom = new int[img.length*f][img.length*f];

        for (int i = 0; i < imgZoom.length; i++) {

        }

        return imgZoom;
    }



}
