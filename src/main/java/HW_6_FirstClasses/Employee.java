package HW_6_FirstClasses;

import java.lang.Character;
public class Employee {

    private String lastName;
    private String firstName;
    private String jobTitle = "QA Automation";
    private double salaryPerHour;


    public String getLastName() {
        System.out.println("Last name: " +lastName);
        return lastName;
    }

    public void setLastName (String lName) {
        boolean upCaseLetterFirst = Character.isUpperCase(lName.charAt(0));
        if (upCaseLetterFirst){
            this.lastName = lName;

        } else {
            System.out.println("Last name has to start with an uppercase letter");
        }

    }

    public String getFirstName() {
        System.out.println("First name: " +firstName);
        return firstName;
    }

    public void setFirstName (String fName) {
        boolean upCaseLetterFirst = Character.isUpperCase(fName.charAt(0));
        if (upCaseLetterFirst){
            this.firstName = fName;

        } else {
            System.out.println("First name has to start with an uppercase letter");
        }

    }

    public String getJobTitle() {
        System.out.println("Job Title: " +jobTitle);
        return jobTitle;
    }

    public double getSalaryPerHour() {
        System.out.println("Salary per hour: " +salaryPerHour);
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salPerHour) {
        if (salPerHour > 0) {
            this.salaryPerHour = salPerHour;
        } else {
            System.out.println("Incorrect value of salary per hour");
        }

    }

    public void getAnIphone() {
        double howMuchHours = 1000/salaryPerHour;
        System.out.println("According to your salary per hour, it takes " + howMuchHours + " hours of " +
                "your work to earn an iphone");
    }

    public void getToWork() {
        System.out.println("The working day has started");
    }
}
