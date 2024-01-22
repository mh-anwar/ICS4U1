/*
Made by sarah?
Class Employee :
The Employee class extends the Human Resources class and provides specific variables related to employee such as the employee info and their holidays.
Variables:
- private int holidaysLeft
- private int hourlyPay (hourlyRate)
GETTERS
- public int getHolidaysLeft
- public int getHourlyPay

SETTERS
- public void setHolidaysLeft
- public void setHourlyRate
*/
package HumanResources;

import java.time.LocalDate;
import java.util.Date;

import Root.Library;

public class Employee extends HumanResources {
    protected int holidaysLeft = 50;
    // Instead of the user supplying our employee's personal details, an employee is
    // retrieved from our database
    String[] data = Library.getObjectInfoFromCsv("EmployeeData.csv");


    protected Double hourlyPay = Double.parseDouble(data[7]);

    public Employee() {
        super();
        this.firstName = data[0];
        this.lastName = data[1];
        String[] dateOfBirthInfo = data[2].split("-");
        this.dateOfBirth = LocalDate.of(Integer.parseInt(dateOfBirthInfo[0]), Integer.parseInt(dateOfBirthInfo[1]),
                Integer.parseInt(dateOfBirthInfo[2]));
        this.age = (int) Integer.parseInt(data[3]);
        this.gender = data[4];
        this.phoneNumber = data[5];
        this.homeAddress = data[6];
    }

    public String toString() {
        return "Employee Name: " + firstName + " " + lastName + "\n DOB: " + dateOfBirth
                + "\n Age: " + age + "\n Gender: " + gender + "\n Email: " + email
                + "\n Phone: " + phoneNumber + "\n Home Address: " + homeAddress + "\n Holidays Left: " + holidaysLeft
                + "\n Hourly Pay: $" + hourlyPay;
    }

    // GETTERS
    public int getHolidaysLeft() {
        return holidaysLeft;
    }

    public Double getHourlyPay() {
        return hourlyPay;
    }

    // SETTERS
    public void setHolidaysLeft(int holidaysLeft) {
        this.holidaysLeft = holidaysLeft;
    }

    public void setHourlyPay(Double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    // GENERAL METHODS
}