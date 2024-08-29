//Object Class
public class Guru {
    private int id;
    private String nama, mapel, alamat;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //Constructor nama sama dengan class
    public Guru() {
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    }

    //Constructor Parameter
    public Guru(int id, String nama, String mapel, String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

     //Getter-->mendapatkan nilai-->tipe data
     public int getId() {
        return id;
     }
     public String getNama() {
        return nama;
    }
     public String getMapel() {
        return mapel;
    }
     public String getAlamat() {
        return alamat;
    }

     //method tdk menghasilkan value
     public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Mapel : " + mapel);
        System.out.println("Alamat : " +alamat);
     }

       //method yang menghasilkan value
    public String print2() {
        return "ID : " + id
        + "\nNama : " + nama
        + "\nMapel : " + mapel
        + "\nGaji : " + alamat;
    }
}