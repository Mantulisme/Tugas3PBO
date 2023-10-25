package PBO3.PERTEMUAN3.NOMOR2;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu konversi = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        double suhuCelcius = 25.0;
        double suhuFahrenheit = konversi.celciusToFahrenheit(suhuCelcius);
        double suhuReamur = konversi.celciusToReamur(suhuCelcius);
        double suhuReamur2 = konversi2.fahrenheitToReamur(suhuFahrenheit);

        System.out.println("Suhu dalam Celcius: " + suhuCelcius);
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Suhu dalam Reamur (dari Celcius): " + suhuReamur);
        System.out.println("Suhu dalam Reamur (dari Fahrenheit): " + suhuReamur2);
    }
}
