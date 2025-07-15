public class Main {
    public static void main(String[] args) {

        LoanUI loanUI = new LoanUI();
        loanUI.calculate(new EducatorLoanManager());
        loanUI.calculate(new MilitaryLoanManager());
    }


}

