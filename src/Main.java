public class Main {
    public static void main(String[] args) {

        //BFF numbers 220-284

        int number = 220;
        int number1 = 284;
        int total = 0;
        int total1 = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }

        }

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }


        if (number == total1 && number1 == total) {
            System.out.println("These two number are BFF's");
        } else {
            System.out.println("These two are strangers to each other ");
        }
    }
}
