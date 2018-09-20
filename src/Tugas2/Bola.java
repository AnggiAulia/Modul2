/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
public class Bola {
     public double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public void setJarijari(double jariJari) {
        this.jariJari = jariJari;
    }

    public void showDiameter() {
        System.out.println(" ====LUAS PERMUKAAN BOLA====");
        System.out.println("Diameter  : " + 2 * jariJari);
    }

    public void showLuasPermukaan() {
        System.out.println("Luas Permukaan  : " + (4 * Math.PI * (jariJari * jariJari)));
    }

    public void showVolume() {
        System.out.println("Volume Bola : " + (4 / 3 * Math.PI * (jariJari * jariJari * jariJari)));
    }
}
