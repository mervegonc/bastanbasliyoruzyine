public class Main {
    public static void main(String[] args) {
       char grade ='Ş';

       switch (grade){
           case 'A':
               System.out.println("Perfect, You passed");
               break;
           case 'B':
                   System.out.println("Very Good, You passed");
                   break;
           case 'C':
               System.out.println("Good, You passed");
               break;
           case 'D':
               System.out.println("Not bad, You passed");
               break;
           case 'E':
               System.out.println("You should work harder, passed");
               break;
           case 'F':
               System.out.println("Bad, You  didn't passed");
               break;
           default:
               System.out.println("You entered invalid grade!");
       }
    }
}