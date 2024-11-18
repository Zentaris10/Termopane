/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.facultate;



/**
 *
 * @author popaa
 */
public class TermopanReflectorizant extends Termopane {
    private String tipFilmReflectorizant;

    public TermopanReflectorizant() {
        super();
        this.tipFilmReflectorizant = "Necunoscut";
    }

    public TermopanReflectorizant(String materialRama, int numarStraturi, String tipSticla, String tipFilmReflectorizant) {
        super(materialRama, numarStraturi, tipSticla);
        this.tipFilmReflectorizant = tipFilmReflectorizant;
    }

    public TermopanReflectorizant(TermopanReflectorizant other) {
        super(other);
        this.tipFilmReflectorizant = other.tipFilmReflectorizant;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip film reflectorizant: " + tipFilmReflectorizant;
    }
}

