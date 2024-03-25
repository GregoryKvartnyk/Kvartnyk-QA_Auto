import HW_6_FirstClasses.Credit;

public class Main {
    public static void main(String[] args) {

        Credit credit = new Credit();

        credit.setCreditSum(100);
        credit.setCreditPercent(1);
        credit.setCreditTermMonths(10);
        credit.setMonthlyPayment(10);

        credit.monthToPay();





    }
}
