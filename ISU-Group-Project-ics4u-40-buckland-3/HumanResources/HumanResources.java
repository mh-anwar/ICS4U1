/*
Made by sarah?
Class Human  :
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
import java.util.ArrayList;
import java.util.Date;

abstract class HumanResources {

    public String firstName;
    public String lastName;
    protected LocalDate dateOfBirth;
    protected int age;
    protected String gender;
    protected String email;
    protected String phoneNumber;
    protected String homeAddress;

    // String firstName, String lastName, Date dateOfBirth,
    // int age, String gender, String email, String phoneNumber,
    // String homeAddress
    public HumanResources() {
        // Initialize class in here
        // this.firstName = firstName;
        // this.lastName = lastName;
        // this.dateOfBirth = dateOfBirth;
        // this.age = age;
        // this.gender = gender;
        // this.email = email;
        // this.phoneNumber = phoneNumber;
        // this.homeAddress = homeAddress;
    }

    abstract public String toString();

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void increaseAge() {
        this.age += 1;
    }
}