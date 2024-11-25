package ro.ugal.facultate;

import java.util.ArrayList;
import java.util.List;

public class Facultate {
    public static void main(String[] args) {
        List<Termopane> termopaneList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            termopaneList.add(new Termopane("Material" + i, i + 1, "TipSticla" + i));
        }

        List<TermopanIzolantTermic> izolantList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            izolantList.add(new TermopanIzolantTermic("Material" + i, i + 1, "TipSticla" + i, i * 1.1));
        }

        List<TermopanReflectorizant> reflectorizantList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            reflectorizantList.add(new TermopanReflectorizant("Material" + i, i + 1, "TipSticla" + i, "Film" + i));
        }

        System.out.println("Instante Termopane:");
        for (Termopane termopan : termopaneList) {
            System.out.println(termopan);
        }

        System.out.println("\nInstanțe TermopanIzolantTermic:");
        for (TermopanIzolantTermic izolant : izolantList) {
            System.out.println(izolant);
        }

        System.out.println("\nInstante TermopanReflectorizant:");
        for (TermopanReflectorizant reflectorizant : reflectorizantList) {
            System.out.println(reflectorizant);
        }

        Termopane t1 = new Termopane();
        Termopane t2 = new Termopane("PVC", 2, "Clara");
        Termopane t3 = new Termopane(t2);

        System.out.println("\nInstante individuale Termopane:");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        TermopanIzolantTermic iz1 = new TermopanIzolantTermic();
        TermopanIzolantTermic iz2 = new TermopanIzolantTermic("Aluminiu", 3, "Fumuriu", 1.2);
        TermopanIzolantTermic iz3 = new TermopanIzolantTermic(iz2);

        System.out.println("\nInstante individuale TermopanIzolantTermic:");
        System.out.println(iz1);
        System.out.println(iz2);
        System.out.println(iz3);

        TermopanReflectorizant rf1 = new TermopanReflectorizant();
        TermopanReflectorizant rf2 = new TermopanReflectorizant("Lemn", 2, "Fumuriu", "UV");
        TermopanReflectorizant rf3 = new TermopanReflectorizant(rf2);

        System.out.println("\nInstante individuale TermopanReflectorizant:");
        System.out.println(rf1);
        System.out.println(rf2);
        System.out.println(rf3);
    }
}
