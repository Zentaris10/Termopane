/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.facultate;
/**
 *
 * @author popaa
 */
public class Termopane {
    private String materialRama;
    private int numarStraturi;
    private String tipSticla;

    public Termopane() {
        this.materialRama = "Necunoscut";
        this.numarStraturi = 0;
        this.tipSticla = "Necunoscut";
    }

    public Termopane(String materialRama, int numarStraturi, String tipSticla) {
        this.materialRama = materialRama;
        this.numarStraturi = numarStraturi;
        this.tipSticla = tipSticla;
    }

    public Termopane(Termopane other) {
        this.materialRama = other.materialRama;
        this.numarStraturi = other.numarStraturi;
        this.tipSticla = other.tipSticla;
    }

    @Override
    public String toString() {
        return "Material rama: " + materialRama + ", Numar straturi: " + numarStraturi + ", Tip sticla: " + tipSticla;
    }
}

