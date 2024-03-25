package HW_6_FirstClasses;

public class Credit {
    private double creditSum;
    private double creditPercent;
    private double creditTermMonths;
    private double monthlyPayment;

    public void setCreditSum(double cSum) {
        this.creditSum = cSum;
    }
    public void setCreditPercent(double cPercent) {
        this.creditPercent = cPercent;
    }
    public void setCreditTermMonths (int cTerm) {
        this.creditTermMonths = cTerm;
    }
    public void setMonthlyPayment (double mPay) {
        this.monthlyPayment = mPay;
    }
    public double getCreditSum() {
        return creditSum;
    }
    public double getCreditPercent() {
        return creditPercent;
    }
    public double getCreditTermMonths() {
        return creditTermMonths;
    }
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double finalCreditCost() {
        int i = 0;
        double sumIncrease = 0;
        double finalCreditSum = 0;
        double startingCreditSum = creditSum;

        while (i < creditTermMonths) {
            startingCreditSum -= monthlyPayment;
            sumIncrease += (startingCreditSum * (creditPercent / 100));
            i++;
        }

        finalCreditSum = creditSum + sumIncrease;
        System.out.println("Final credit cost: " +finalCreditSum);
        return finalCreditSum;
    }

    public double monthToPay() {
        double i = 0;
        double monthToPay;
        double monthToPayIncrease;
        double sumIncrease = 0;
        double moneyPayed = 0;
        double creditRemainder = creditSum;

        while (true) {
            creditRemainder -= monthlyPayment;
            moneyPayed += monthlyPayment;
            sumIncrease += (creditRemainder * (creditPercent / 100));
            i++;
            if (moneyPayed == creditSum) {
                break;
            }
        }

        monthToPayIncrease = Math.ceil(sumIncrease/monthlyPayment);
        monthToPay = i + monthToPayIncrease;


        System.out.println("Sum increase: " +sumIncrease);
        System.out.println("Month to pay: " +monthToPay);
        return monthToPay;



    }

}
