public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //classes are reference type

        int number = 10;
        int number1 = 20;
        number1 =number;
        number =30;
        System.out.println(number1);


        //primitive    STACK       = 	int, double, char, boolean, byte, short, long, float
        //reference    STCAK/HEAP  =    String, Array, Object, Class, List, Map, Scanner vs.

        int [] numbers1 = new int[]{1,2,3};
        int [] numbers2 = new int[]{4,5,6};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);

    }


}

