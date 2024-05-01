package polyform;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    public double hitungharga() {
        return getHarga() * getJumlah() * 2;
    }

    public String toString() {
        return super.toString() + "\nJumlah\t\t: " + jumlah;
    }

}
