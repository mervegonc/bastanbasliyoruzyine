public class Main {
    public static void main(String[] args) {

        BaseLoanManager [] baseLoanManagers = new BaseLoanManager[]{new AgriculturalLoanManager(), new EducatorLoanManager(), new StudentLoanManager()};

        for (BaseLoanManager loanManager : baseLoanManagers){

            System.out.println( "Calculation: "+loanManager.calculate(1000));
        }
  }


}

