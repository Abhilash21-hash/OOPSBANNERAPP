
//1. Age of Harry//
public class AgeOfHarry {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}
// 2. Average Marks in PCM//
public class AveragePCM {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
// 3. Convert 10.8 km to miles//
public class KmToMiles {
    public static void main(String[] args) {
        double km = 10.8;
        double miles = km / 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
// 4. Profit and Profit Percentage//
public class ProfitLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercent = (profit / (double) costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice + 
        " and Selling Price is INR " + sellingPrice +
        "\nThe Profit is INR " + profit + 
        " and the Profit Percentage is " + profitPercent);
    }
}
// 5. Divide Pens Among Students//
public class PensDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent +
        " and the remaining pen not distributed is " + remainingPens);
    }
}
// 6. Discount on Course Fee//
public class DiscountCalculation {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
        " and final discounted fee is INR " + finalFee);
    }
}
//7. Volume of Earth//
public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " 
        + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
// 8. Km to Miles (User Input)//
import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + 
        " mile for the given " + km + " km");
    }
}
// 9. Discount with User Input//
import java.util.Scanner;

public class DiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
        " and final discounted fee is INR " + finalFee);
    }
}
//10. Height Conversion (cm to feet & inches)//
import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cm = input.nextDouble();

        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Your Height in cm is " + cm +
        " while in feet is " + feet +
        " and inches is " + remainingInches);
    }
}