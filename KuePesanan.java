package polyform;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;

    }

    public double getBerat() {
        return berat;
    }

    public double hitungharga() {
        return getHarga() * berat;
    }

    public String toString() {
        return super.toString() + "\nBerat\t\t: " + berat + " kg";
    }
}
