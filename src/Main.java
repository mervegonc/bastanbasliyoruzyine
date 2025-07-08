import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);


double a;
double b;
double c;


        System.out.println("Length of Side A: ");
        a =scanner.nextDouble();

        if(a<=0){
            System.out.println("The sides must to be positive numbers!");
        }
        System.out.println("Length of Side B: ");
        b =scanner.nextDouble();

if(b<=0){
    System.out.println("The sides must to be positive numbers!");
}

       c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("Hypotenuse:"+c);
scanner.close();
    }
}
