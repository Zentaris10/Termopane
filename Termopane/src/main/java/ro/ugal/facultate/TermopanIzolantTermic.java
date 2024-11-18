/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.facultate;


/**
 *
 * @author popaa
 */
public class TermopanIzolantTermic extends Termopane {
    private double coeficientIzolare;

    public TermopanIzolantTermic() {
        super();
        this.coeficientIzolare = 0.0;
    }

    public TermopanIzolantTermic(String materialRama, int numarStraturi, String tipSticla, double coeficientIzolare) {
        super(materialRama, numarStraturi, tipSticla);
        this.coeficientIzolare = coeficientIzolare;
    }

    public TermopanIzolantTermic(TermopanIzolantTermic other) {
        super(other);
        this.coeficientIzolare = other.coeficientIzolare;
    }

    @Override
    public String toString() {
        return super.toString() + ", Coeficient izolare: " + coeficientIzolare;
    }
}

