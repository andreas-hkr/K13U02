public class Main {
    public static void main(String[] args) {
        // Skapa en klass som kan representerar en position  (latitud / longitud)
        // Latitud  = grader, minuter, sekunder och nord/syd-riktning
        // Longitud = grader, minuter, sekunder och öst/väst-riktning
        //
        // Landvetter = latitud = 57°39'47" N    longitud = 12°16'58" Ö

        Position landvetter = new Position();
        landvetter.latGra = 57;
        landvetter.latMin = 39;
        landvetter.latSek = 47;
        landvetter.latNord = true;

        landvetter.longGra = 12;
        landvetter.longMin = 16;
        landvetter.longSek = 58;
        landvetter.longOst = true;


    }
}

class Position {
    int latGra, latMin, latSek;
    boolean latNord;
    int longGra, longMin, longSek;
    boolean longOst;
}