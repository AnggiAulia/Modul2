
package Latihan3;

public class EncapSiswa {
    private String name;
    private String address;
    private int absen;
    
    public int getAbsen(){
        return absen;
    }
    public String getAddress(){
    return address;
    }
    public String getName(){
    return name;
    }
    public void setAbsen( int newAbsen ){
        absen = newAbsen;
    }
    public void setName( String newName ){
        name = newName;
    }
    public void setAddress( String newAddress ){
        address = newAddress;
}
}