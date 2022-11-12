public class Zoom {

    // Initialisiert Variable img
    private int[][] img;

    // Methode zum befüllen der Variable img
    public void setImg (int[][] img) {

        // prüft, ob leere Arrays übergeben werden
        if (img == null || img.length == 0) {
            System.out.println("null-Referenz oder ein leeres Array gefunden.");
            System.exit(0);
        }

        for (int[] ints : img) {
            for (int anInt : ints) {

                // prüft, ob Werte innerhalb des Wertebereichs
                if (anInt < 0 || anInt > 7) {
                    System.out.println("Array enthält Wert außerhalb des Wertebereichs [0,7].");
                    System.exit(0);
                }

                // prüft, ob Array NxN groß
                if (img.length != ints.length) {
                    System.out.println("Array ist nicht NxN groß.");
                    System.exit(0);
                }
            }
        }

        // setzt den Wert der Variablen img
        this.img = img;
    }

    // vergrößert das Array um Faktor f
    public int[][] zoom (int f) {

        // erzeugt neues vergrößertes Array mit
        int[][] imgZoom = new int[img.length*f][img.length*f];

        // row und column zähler
        int row = 0;
        int column = 0;

        // prüft, ob f größer als 1 ist
        if (f <= 1) {
            System.out.println("f ist nicht größer als 1.");
            System.exit(0);
        }
        else {
            // weist imgZoom die faktorisierte Anzahl der passenden Werte hinzu
            for (int[] ints : img) {
                for (int z = 0; z < f; z++) {
                    for (int j = 0; j < img[0].length; j++) {
                        for (int k = 0; k < f; k++) {
                            imgZoom[row][column] = ints[j];
                            column++;
                        }
                    }
                    column = 0;
                    row++;
                }
            }
        }

        // gibt das neue Bild zurück
        return imgZoom;
    }



}
