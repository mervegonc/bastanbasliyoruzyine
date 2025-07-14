public class Main {
    public static void main(String[] args) {
        int total = addition2(5,6,4,8,9,45,3,5);
        System.out.println(total);
    }


    public static int addition2 (int... numbers){
        int total =0;
        for (int number:numbers){
            total +=number;
        }
        return total;
    }
}
