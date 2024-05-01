package polyform;

import java.util.*;

public class MainKue {
    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);
        Kue[] kue = new Kue[20];
        kue[0] = new KuePesanan("Kelembutan Srikaya", 5000.0, 1);
        kue[1] = new KuePesanan("Seruling Coklat Manis", 10000.0, 2);
        kue[2] = new KuePesanan("Anggunnya Kek Pisang", 16000.0, 5);
        kue[3] = new KuePesanan("Lumeran Red Velvet", 8000.0, 6);
        kue[4] = new KuePesanan("Nostalgia Nastar", 10000.0, 10);
        kue[5] = new KuePesanan("Sinar Matahari Lemon Bar", 19000.0, 3);
        kue[6] = new KuePesanan("Harmony Choco Chip", 20000.0, 5);
        kue[7] = new KuePesanan("Symphony Berry Bliss", 12000.0, 1);
        kue[8] = new KuePesanan("Cinta Karamel Puff", 22000.0, 8);
        kue[9] = new KuePesanan("Delima Cream Cheese Bliss", 11000.0, 10);
        kue[10] = new KueJadi("Lapis legit", 8000.0, 5);
        kue[11] = new KueJadi("Bolu Moka Mekar", 12000.0, 12);
        kue[12] = new KueJadi("Kue Lapis Surabaya", 25000.0, 8);
        kue[13] = new KueJadi("Brownies Klasik", 40000.0, 4);
        kue[14] = new KueJadi("Donat Gula-Gula", 80000.0, 1);
        kue[15] = new KueJadi("Tart Buah Segar", 11000.0, 9);
        kue[16] = new KueJadi("Chiffon Pandan Wangi", 44000.0, 15);
        kue[17] = new KueJadi("Rainbow Cupcake", 33000.0, 4);
        kue[18] = new KueJadi("Black Forest Slice", 21000.0, 13);
        kue[19] = new KueJadi("Biskuit Cokelat Crispy", 67000.0, 2);
        do {
            System.out.println("Menu:\n" +
                    "1. Tampilkan semua kue dan jenis kuenya\n" +
                    "2. Hitung total harga yang didapat dari semua jenis kue\n" +
                    "3. Hitung total harga dan total berat dari KuePesanan\n" +
                    "4. Hitung total harga dan total jumlah dari KueJadi\n" +
                    "5. Tampilkan informasi kue dengan harga terbesar\n" +
                    "0. Keluar");
            System.out.print("\nMasukkan pilihan anda: ");
            pilihan = input.nextInt();
            System.out.println();
            if (pilihan == 1) {
                System.out.println("Daftar Kue:");
                for (Kue jenisKue : kue) {
                    String jenis = (jenisKue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
                    System.out.println(jenisKue.toString() + "\nJenis\t\t: " + jenis + "\n");
                }
                System.out.println();
            } else if (pilihan == 2) {
                double totalHarga = 0;
                for (Kue jenisKue : kue) {
                    totalHarga += jenisKue.getHarga();
                }
                System.out.println("Total harga semua kue: Rp" + totalHarga);
                System.out.println();
            } else if (pilihan == 3) {
                double totalhargaPesanan = 0;
                double beratPesanan = 0;
                double hitungHarga = 0;
                for (Kue jenisKue : kue) {
                    if (jenisKue instanceof KuePesanan) {
                        totalhargaPesanan += jenisKue.getHarga();
                        beratPesanan += ((KuePesanan) jenisKue).getBerat();
                        hitungHarga += jenisKue.hitungharga();
                    }
                }
                System.out.println("Total harga kue pesanan: Rp" + totalhargaPesanan);
                System.out.println("Total berat kue pesanan: " + beratPesanan + " kg");
                System.out.println("Total harga keseluruhan: Rp" + hitungHarga);
                System.out.println();
            } else if (pilihan == 4) {
                double totalhargaJadi = 0;
                double jumlah = 0;
                double totalHarga = 0;
                for (Kue jenisKue : kue) {
                    if (jenisKue instanceof KueJadi) {
                        totalhargaJadi += jenisKue.getHarga();
                        jumlah += ((KueJadi) jenisKue).getJumlah();
                        totalHarga += jenisKue.hitungharga();
                    }
                }
                System.out.println("Total harga kue jadi\t: Rp" + totalhargaJadi);
                System.out.println("Jumlah kue pesanan\t: " + jumlah);
                System.out.println("Total harga keseluruhan\t: Rp" + totalHarga);
                System.out.println();
            } else if (pilihan == 5) {
                Kue kueTermahal = kue[0];
                for (Kue jenisKue : kue) {
                    if (kueTermahal.hitungharga() < jenisKue.hitungharga()) {
                        kueTermahal = jenisKue;
                    }
                }
                System.out.println("Kue Termahal adalah:\n" + kueTermahal.toString() + "\nTotal Harga\t: "
                        + kueTermahal.hitungharga()
                        + "\nJenis kue\t: " + ((kueTermahal instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi"));
            }
            System.out.println();
            if (pilihan > 5) {
                System.out.println("Tidak tersedia. Masukkan pilihan dengan benar!");
                System.out.println();
            }
        } while (pilihan != 0);
        input.close();
    }
}
