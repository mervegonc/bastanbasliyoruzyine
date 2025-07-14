public class Main {
    public static void main(String[] args) {

        //we are looking for number in the array
       int [] numbers = new int []{1,2,5,7,9,0};
       int lookFor=78;
       boolean exists=false;

       for(int number:numbers){
           if(number ==lookFor){
               exists = true;
               break;
           }
       }
       if(exists){
           System.out.println("The nmber is exists");
       }else {
           System.out.println("The number doesn't exists");
       }
    }
}
