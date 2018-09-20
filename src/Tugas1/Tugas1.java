
package Tugas1;

public class Tugas1 {
    
     public double penumpang;
    public double maxpenumpang;
    public double berat;

    public Tugas1(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println(" penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(double password) {
        if (password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Pasword salah");
        }
    }
    
    public void getAverage(double berat){
        double temp;
        temp = this.berat + berat;
        double rataRata = temp / penumpang;
        this.berat = rataRata;
    }

    public void cetakpenumpang() {
        System.out.println("Penumpang bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxpenumpang);
        System.out.println("Rata Rata berat penumpang = "+ berat);
        
    }
}
