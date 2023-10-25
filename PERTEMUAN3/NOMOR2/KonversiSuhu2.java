package PBO3.PERTEMUAN3.NOMOR2;

public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celciusToReamur(celcius);
    }
}

