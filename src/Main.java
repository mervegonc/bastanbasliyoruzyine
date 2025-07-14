public class Main {
    public static void main(String[] args) {
      String student="Merve";
      String student1="Engin";
      String student2="Salih";


      String[] students= new String[3];
      students[0]="Merve";
        students[1]="Engin";
        students[2]="Salih";

        for(int i=0; i< students.length; i++){
            System.out.println(students[i]);
        }

        for(String studenty:students){
            System.out.println(studenty);
        }
    }
}