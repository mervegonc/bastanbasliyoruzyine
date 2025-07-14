public class Main {
    public static void main(String[] args) {

      int number = 6;
      int total=0;

      for(int i=1;i<number;i++){
          if(number % i==0){
                total+=i;
          }

      }
        if(total==number){
            System.out.println("this is perfect number: "+number);
        }else {
            System.out.println("nobody isn't perfect:"+number);
        }

        /*Perfect Number	Sum of Divisors
            6	1 + 2 + 3 = 6
            28	1 + 2 + 4 + 7 + 14 = 28
            496	1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248 = 496
            8128	1 + 2 + 4 + 8 + 16 + 32 + 64 + 127 + 254 + 508 + 1016 + 2032 + 4064 = 8128*/
    }
}
