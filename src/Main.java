public class Main {
    public static void main(String[] args) {
       //for
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("For loop is over");

        //while
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;

        }
        System.out.println("While loop is over");

        //do while
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while (j<10);
        System.out.println("Do-While loop is over");


        int k=100;
        do{
            System.out.println(k);
            k++;
        }while (k<10);
        System.out.println("Do-While loop is over");
    }
}