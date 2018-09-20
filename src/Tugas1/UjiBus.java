
package Tugas1;

public class UjiBus {
        public static void main(String[] arg) {
        Tugas1 Bus = new Tugas1(10);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.getAverage(40);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.getAverage(60);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.getAverage(80);
        Bus.cetakpenumpang();
        }
}
