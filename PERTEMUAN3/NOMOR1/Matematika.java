package PBO3.PERTEMUAN3.NOMOR1;

public class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak valid.");
            return Double.NaN;
        }
    }
}
