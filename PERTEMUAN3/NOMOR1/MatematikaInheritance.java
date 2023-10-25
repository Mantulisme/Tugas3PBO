package PBO3.PERTEMUAN3.NOMOR1;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 matematika2 = new Matematika2();

        // Memanggil metode dari Matematika
        int hasilPertambahan = matematika2.pertambahan(20, 10);
        int hasilPengurangan = matematika2.pengurangan(10, 5);
        int hasilPerkalian = matematika2.perkalian(10, 3);
        double hasilPembagian = matematika2.pembagian(21, 2);

        // Memanggil metode dari Matematika2
        int hasilModulus = matematika2.modulus(21, 2);

        // Menampilkan hasil perhitungan
        System.out.println("Pertambahan: 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian: 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);
        System.out.println("Modulus: 21 % 2 = " + hasilModulus);
    }
}
