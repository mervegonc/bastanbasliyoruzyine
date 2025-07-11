public class Main {
    public static void main(String[] args) {
        int number = 50;
        int number0 = 55;
        int number1 = 60;

        // Başlangıçta ilk sayıyı en büyük kabul ediyoruz
        int theBiggest = number;

        // Diğer sayıları tek tek kontrol ediyoruz
        if(number0 > theBiggest) {
            theBiggest = number0;
        }
        if(number1 > theBiggest) {
            theBiggest = number1;
        }

        // Sonucu bir kez yazdırıyoruz
        System.out.println("En büyük sayı: " + theBiggest);
    }
}