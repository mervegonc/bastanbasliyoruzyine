public class Main {
    public static void main(String[] args) {

        String message = "Today The weather is good";
        String newMessage = cities();
        System.out.println(newMessage);
        int number =addition(5,7);
        System.out.println(number);
    }


    public static void  add () {
        System.out.println("Added");
    }
    public static void delete (){
        System.out.println("Delete");
    }
    public static void update () {
        System.out.println("Updated");
    }

    public static int addition (int number, int number1){

        return  number + number1;

    }

    public static String cities (){
        return "Ankara";
    }
}
