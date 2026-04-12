//LEVEL 1 – JAVA SOLUTIONS //
1. Divisible by 5
import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}
2. First is smallest of 3 numbers
import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isSmallest = (a <= b && a <= c);

        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
3. Largest among 3 numbers
import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Is the first number the largest? " + (a >= b && a >= c));
        System.out.println("Is the second number the largest? " + (b >= a && b >= c));
        System.out.println("Is the third number the largest? " + (c >= a && c >= b));
    }
}
4. Natural number sum
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 0) {
            long sumFormula = (long) n * (n + 1) / 2;

            System.out.println("The sum of " + n + " natural numbers is " + sumFormula);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
5. Voting eligibility
import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
6. Positive / Negative / Zero
import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
7. Spring Season
import java.util.Scanner;

public class SpringSeason {

    public static boolean isSpring(int m, int d) {
        if (m < 3 || m > 6) return false;
        if (m == 3 && d < 20) return false;
        if (m == 6 && d > 20) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        if (isSpring(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
8. Countdown (while loop)
import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
9. Countdown (for loop)
import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
10. Sum until 0
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        while (true) {
            double num = sc.nextDouble();
            if (num == 0) break;
            total += num;
        }

        System.out.println("Total = " + total);
    }
}
//LEVEL 2 //
1. Even / Odd numbers between 1 to N
import java.util.Scanner;

public class EvenOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
2. Employee Bonus Calculation (single employee logic)
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int years = sc.nextInt();

        double bonus;

        if (years > 5) {
            bonus = salary * 0.05;
        } else {
            bonus = salary * 0.02;
        }

        System.out.println("Bonus = " + bonus);
    }
}
3. Multiplication table (6 to 9)
import java.util.Scanner;

public class Table6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
4. FizzBuzz (for loop)
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
5. FizzBuzz (while loop)
import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int n = sc.nextInt();

        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

            i++;
        }
    }
}
6. Youngest & Tallest (Amar, Akbar, Anthony)
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        int minAge = 0, maxHeight = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAge]) minAge = i;
            if (height[i] > height[maxHeight]) maxHeight = i;
        }

        System.out.println("Youngest: " + names[minAge]);
        System.out.println("Tallest: " + names[maxHeight]);
    }
}
7. Factors of a number (array)
import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
    }
}
8. Greatest factor (besides itself)
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int greatest = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                greatest = i;
                break;
            }
        }

        System.out.println("Greatest factor = " + greatest);
    }
}
9. Power of a number
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("Result = " + result);
    }
}
10. Power using while loop
import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        int i = 0;

        while (i < power) {
            result *= base;
            i++;
        }

        System.out.println(result);
    }
}
11. Odd & Even arrays
import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) return;

        int[] odd = new int[n];
        int[] even = new int[n];

        int oi = 0, ei = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even[ei++] = i;
            else
                odd[oi++] = i;
        }

        System.out.print("Odd: ");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");

        System.out.print("\nEven: ");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");
    }
}
12. Sum of numbers until 0
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;

        while (true) {
            double n = sc.nextDouble();
            if (n <= 0) break;
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }
}
13. 2D Array → 1D Array copy
import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int[] arr = new int[r * c];

        int index = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
                arr[index++] = matrix[i][j];
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
14. Mean height of players
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 11;
        double[] h = new double[n];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            h[i] = 150 + Math.random() * 100;
            sum += h[i];
        }

        System.out.println("Mean = " + (sum / n));
    }
}
15. Multiplication table using array
import java.util.Scanner;

public class TableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = n * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
//LEVEL 3 – FULL JAVA SOLUTIONS//
1. Leap Year Program (Method based)
import java.util.Scanner;

public class LeapYear {

    public static boolean isLeap(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (isLeap(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
2. Prime Number
import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
}
3. Armstrong Number
import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = 0;

        int t = n;
        while (t > 0) {
            digits++;
            t /= 10;
        }

        t = n;
        while (t > 0) {
            int d = t % 10;
            sum += Math.pow(d, digits);
            t /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n));
    }
}
4. Harshad Number
import java.util.Scanner;

public class Harshad {

    public static boolean isHarshad(int n) {
        int sum = 0, temp = n;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return n % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isHarshad(n));
    }
}
5. BMI Program
import java.util.Scanner;

public class BMI {

    public static double calculateBMI(double weight, double heightCm) {
        double h = heightCm / 100.0;
        return weight / (h * h);
    }

    public static String status(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double w = sc.nextDouble();
        double h = sc.nextDouble();

        double bmi = calculateBMI(w, h);

        System.out.println("BMI = " + bmi);
        System.out.println("Status = " + status(bmi));
    }
}
6. Digit Count
import java.util.Scanner;

public class DigitCount {

    public static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countDigits(n));
    }
}
7. Quadratic Equation
import java.util.Scanner;

public class Quadratic {

    public static double[] roots(int a, int b, int c) {
        double d = b * b - 4 * a * c;

        if (d < 0) return new double[0];

        if (d == 0) {
            return new double[]{-b / (2.0 * a)};
        }

        double r1 = (-b + Math.sqrt(d)) / (2 * a);
        double r2 = (-b - Math.sqrt(d)) / (2 * a);

        return new double[]{r1, r2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double[] r = roots(a, b, c);

        for (double x : r) {
            System.out.println(x);
        }
    }
}
8. Random 4-digit array + min/max/avg
import java.util.Scanner;

public class RandomStats {

    public static int[] generate(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] stats(int[] arr) {
        int min = arr[0], max = arr[0];
        double sum = 0;

        for (int n : arr) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }

        return new double[]{sum / arr.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate(5);
        double[] res = stats(arr);

        for (int n : arr) System.out.print(n + " ");
        System.out.println("\nAvg=" + res[0] + " Min=" + res[1] + " Max=" + res[2]);
    }
}
9. NumberChecker Utility Class (CORE LEVEL 3)
public class NumberChecker {

    public static int[] digits(int n) {
        int[] temp = new int[10];
        int i = 0;

        while (n > 0) {
            temp[i++] = n % 10;
            n /= 10;
        }

        int[] res = new int[i];
        for (int j = 0; j < i; j++) res[j] = temp[j];

        return res;
    }

    public static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] d = digits(n);
        int sum = 0;

        for (int x : d) sum += Math.pow(x, d.length);

        return sum == n;
    }
}
10. Calendar Program (basic)
import java.util.Scanner;

public class CalendarSimple {

    public static int days(int m, int y) {
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
                return 29;
            return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;

        return 31;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Days = " + days(m, y));
    }
}
11. OTP Generator (6-digit unique check)
import java.util.HashSet;
import java.util.Random;

public class OTP {

    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        while (set.size() < 10) {
            set.add(generateOTP());
        }

        System.out.println(set);
    }
}
12. Matrix Operations (Add/Subtract/Multiply)
public class MatrixOps {

    public static int[][] add(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] + b[i][j];

        return r;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] - b[i][j];

        return r;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] r = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    r[i][j] += a[i][k] * b[k][j];

        return r;
    }
}