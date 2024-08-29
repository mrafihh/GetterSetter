//Object Class
public class Employee {
    private String nama;
    private double gaji;

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    /*constructor nama sama dengan nama class */
    public Employee(){
        gaji = 0.00;
        nama = "";
    }
    
    //Constructor parameter
    public Employee (String nama , double gaji) {
        this.gaji= gaji;
        this.nama = nama;
    }


    //method
    public void print() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ini Data Dari Karyawan");
        System.out.println("Gaji : "+ gaji);
        System.out.println("Nama : "+ nama);
    }

    //Getter-->mendapatkan nilai-->tipe data
    public String getIdString() {
        return nama;
    }
    public double getId() {
        return gaji;
    }

    //Setter-->mengubah nilai-->void
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setIpk(double ipk) {
        this.gaji = gaji;
    }
    //method tdk menghasilkan value
    public void print1() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
    }
    //method yang menghasilkan value
    public String print2() {
        return "\nNama : " + nama
        + "\nGaji : " + gaji;
    }
}