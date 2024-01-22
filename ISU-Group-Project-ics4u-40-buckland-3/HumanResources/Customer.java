/*
Made by sarah?
Class Customer :
The Customer class extends the Human Resources class and provides specific variables related to customers such as the client info and loyal points.

Variables:
- private String username
- private String password
- private int loyaltyPoints
- private String preferredPaymentMethod
- private String preferredShippingAddress
- public boolean isMember

GETTERS
- public int getLoyaltyPoints

SETTERS
- public void setUsername
- public void setPassword

METHODS
- public void increaseLoyaltyPoints
- public void decreaseLoyaltyPoints
- public void validateUser
- public void getPurchaseInfo
*/
package HumanResources;

import java.time.LocalDate;
import java.util.Date;

import Root.Library;

public class Customer extends HumanResources {
    protected String username;
    protected String password;
    protected int loyaltyPoints;
    protected String preferredPaymentMethod = "debit";
    protected String preferredShippingAddress;
    protected boolean isMember;
    String[] data = Library.getObjectInfoFromCsv("CustomerData.csv");

    public Customer() {
        // Initialize class in here
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

        this.username = this.firstName;
        this.password = this.lastName;
        this.preferredShippingAddress = this.homeAddress;
    }

    public String toString() {
        return "Customer Name: " + firstName + " " + lastName + "\n Loyalty Points: " + loyaltyPoints
                + "\n Gender: " + gender + "\n Email: " + email
                + "\n Preferred Payment Method: " + preferredPaymentMethod
                + "\n Is Member: " + isMember;
    }

    // GETTERS
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // SETTERS
    public void setUsername(String newUsername) {
        username = newUsername;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    // GENERAL METHODS
    public void increaseLoyaltyPoints() {
        this.loyaltyPoints++;
    }

    public void decreaseLoyaltyPoints() {
        if (this.loyaltyPoints > 0) {
            this.loyaltyPoints--;
        }
    }

    public boolean validateUser(String username, String password) {
        if (this.username == username && this.password == password) {
            return true;
        }
        return false;
    }

    public String getPurchaseInfo() {
        return preferredPaymentMethod + "|" + preferredShippingAddress;
    }
}