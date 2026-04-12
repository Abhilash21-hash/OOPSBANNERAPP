
//level 1 of java programms//
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
//Level 2 Practice Programs (question-wise in Java)://
//1. Basic Calculator//
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
        + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}
// 2. Area of Triangle (sq cm & sq inches)//
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInch +
        " and sq cm is " + areaCm);
    }
}
//3. Side of Square from Perimeter//
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
        " whose perimeter is " + perimeter);
    }
}
//4. Distance Conversion (feet → yards & miles)//
import java.util.Scanner;

public class DistanceConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards +
        " while the distance in miles is " + miles);
    }
}
//5. Total Purchase Price//
import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        double total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total +
        " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
//6. Quotient and Remainder//
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient +
        " and Reminder is " + remainder +
        " of two number " + number1 + " and " + number2);
    }
}
//7. IntOperation Program//
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("The results of Int Operations are " +
        result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
//8. DoubleOperation Program//
import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are " +
        result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
//Level 3 Practice Programs
//1. Celsius to Fahrenheit//
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}
//2. Fahrenheit to Celsius//
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit = input.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}
//3. Total Income (Salary + Bonus)//
import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        double income = salary + bonus;

        System.out.println("The salary is INR " + salary +
        " and bonus is INR " + bonus +
        ". Hence Total Income is INR " + income);
    }
}
//4. Travel Details Program//
import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();

        double timeFromToVia = input.nextDouble();
        double timeViaToFinalCity = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
        " from " + fromCity + " to " + toCity +
        " via " + viaCity + " is " + totalDistance +
        " km and the Total Time taken is " + totalTime + " minutes");
    }
}
//5. Swap Two Numbers//
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
//6. Athlete Rounds in Triangular Park//
import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
//7. Chocolates Distribution//
import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        int each = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + each +
        " and the number of remaining chocolates are " + remaining);
    }
}
//8. Simple Interest//
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        double SI = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + SI +
        " for Principal " + principal +
        ", Rate of Interest " + rate +
        " and Time " + time);
    }
}
//9. Pounds to Kilograms//
import java.util.Scanner;

public class WeightConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pounds = input.nextDouble();
        double kg = pounds / 2.2;

        System.out.println("The weight of the person in pounds is " + pounds +
        " and in kg is " + kg);
    }
}
//10. Maximum Handshakes//
import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}