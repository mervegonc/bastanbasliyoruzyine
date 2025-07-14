public class Main {
    public static void main(String[] args) {
        callANumber();
    }

    public static void callANumber() {
        //we are looking for number in the array
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int lookFor = 7;
        boolean exists = false;

        for (int number : numbers) {
            if (number == lookFor) {
                exists = true;
                break;
            }
        }
        if (exists) {
            giveMessage("The number is exists: "+lookFor);
        } else {
            giveMessage("The number isn't exists: "+lookFor);
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }
}
