package polyform;

public abstract class Kue {
    protected String nama;
    protected double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungharga();

    public String toString() {
        return "Nama Kue\t: " + nama + "\nHarga Kue\t: Rp" + harga;
    }
}
