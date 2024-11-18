/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.facultate;

/**
 *
 * @author popaa
 */
public class Facultate {
    public static void main(String[] args) {
        Termopane t1 = new Termopane();
        Termopane t2 = new Termopane("PVC", 2, "Clara");
        Termopane t3 = new Termopane(t2);

        System.out.println("Instanțe Termopane:");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        TermopanIzolantTermic iz1 = new TermopanIzolantTermic();
        TermopanIzolantTermic iz2 = new TermopanIzolantTermic("Aluminiu", 3, "Fumuriu", 1.2);
        TermopanIzolantTermic iz3 = new TermopanIzolantTermic(iz2);

        System.out.println("\nInstante TermopanIzolantTermic:");
        System.out.println(iz1);
        System.out.println(iz2);
        System.out.println(iz3);

        TermopanReflectorizant rf1 = new TermopanReflectorizant();
        TermopanReflectorizant rf2 = new TermopanReflectorizant("Lemn", 2, "Fumuriu", "UV");
        TermopanReflectorizant rf3 = new TermopanReflectorizant(rf2);

        System.out.println("\nInstanțe TermopanReflectorizant:");
        System.out.println(rf1);
        System.out.println(rf2);
        System.out.println(rf3);
    }
}


