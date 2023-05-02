package algorithme_exempls.secu_number;

import java.util.Scanner;

public class NumberSecuritySocial {
    private String secNumber;

    public NumberSecuritySocial() {
        Scanner userEntry = new Scanner(System.in);
        System.out.println("Please enter your SecNumber: ");
        secNumber = userEntry.nextLine();
    }

    public void getSex() {
        int sex = Integer.parseInt(secNumber.substring(0,1));
        if(sex == 1) {
            System.out.println("Hello Mister");
        } else {
            System.out.println("Hi Madame");
        }
    }
    public void getYear() {
        int year = Integer.parseInt(secNumber.substring(1,3)) + 1900;
        System.out.println("You are born in         : " + year);
    }

    public  void getMonth() {
        int month = Integer.parseInt(secNumber.substring(3,5));
        String monthName = "";

        switch (month) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
        }
        System.out.println("In the month of         : " + monthName);
    }
    public void getDepartment() {
        int dept = Integer.parseInt(secNumber.substring(5,7));
        System.out.println("In the department of    : " + dept);
    }

    public void getCity() {
        int city = Integer.parseInt(secNumber.substring(7,10));
        System.out.println("In the city of          : " + city);
    }

    public void getOrderNumber() {
        int orderNumber = Integer.parseInt(secNumber.substring(10));
        System.out.println("With the order number   : " + orderNumber);
    }

}
