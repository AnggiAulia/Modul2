
package Tugas2;

public class UjiBola {
     public static void main(String[] args) {
        double jarijari = 14;
        Bola Bola = new Bola(14);
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();
        System.out.println("\n\n");
        Bola.setJarijari(jarijari);
}
}