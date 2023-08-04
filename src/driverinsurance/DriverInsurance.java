package driverinsurance;
import java.util.*;
import java.lang.*;

public class DriverInsurance{
    public static void main(String[] args) {
        char sex, ms;
        int age;
        String str;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Enter age, sex, material status");
        age = sc.nextInt();
        sex = sc.next().charAt(0);
        ms = sc.next().charAt(0);

        if ((ms == 'M') || (ms == 'U') && sex == 'M' && age > 30 || (ms == 'U' && sex == 'F' && age >25))
            System.out.println("Driver is insured");

        else
            System.out.println("Driver is not insured");
    }
}