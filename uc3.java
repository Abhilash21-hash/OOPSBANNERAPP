// wwek 3 assignment//
Level 1 Practice Programs (Arrays – Java, question-wise):

1. Voting Eligibility for 10 Students
import java.util.Scanner;

public class VotingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
}
2. Positive/Negative/Zero + Even/Odd + Compare First & Last
import java.util.Scanner;

public class NumberCheckArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0)
                    System.out.println(arr[i] + " is positive even");
                else
                    System.out.println(arr[i] + " is positive odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println("zero");
            }
        }

        if (arr[0] == arr[4])
            System.out.println("First and last are equal");
        else if (arr[0] > arr[4])
            System.out.println("First is greater");
        else
            System.out.println("Last is greater");
    }
}
3. Multiplication Table using Array
import java.util.Scanner;

public class TableArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
4. Store Numbers until 0/Negative & Find Sum
import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double num = input.nextDouble();

            if (num <= 0 || index == 10)
                break;

            arr[index++] = num;
        }

        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.println(arr[i]);
        }

        System.out.println("Total = " + total);
    }
}
5. Multiplication Table (6 to 9) using Array
import java.util.Scanner;

public class Table6to9Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] result = new int[4];

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            result[index++] = number * i;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index++]);
        }
    }
}
6. Mean Height of Football Team
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("Mean height = " + mean);
    }
}
7. Store Odd & Even Numbers in Arrays
import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[] odd = new int[number/2 + 1];
        int[] even = new int[number/2 + 1];

        int o = 0, e = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                even[e++] = i;
            else
                odd[o++] = i;
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < o; i++)
            System.out.print(odd[i] + " ");

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < e; i++)
            System.out.print(even[i] + " ");
    }
}
8. Factors Stored in Array (Dynamic Resize)
import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int max = 10;
        int[] factors = new int[max];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                if (index == max) {
                    max *= 2;
                    int[] temp = new int[max];

                    for (int j = 0; j < factors.length; j++)
                        temp[j] = factors[j];

                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        for (int i = 0; i < index; i++)
            System.out.println(factors[i]);
    }
}
9. 2D Array to 1D Array
import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] arr = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
10. FizzBuzz using Array
import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n <= 0) return;

        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result[i-1] = "FizzBuzz";
            else if (i % 3 == 0)
                result[i-1] = "Fizz";
            else if (i % 5 == 0)
                result[i-1] = "Buzz";
            else
                result[i-1] = String.valueOf(i);
        }
Level 2 Practice Programs (Arrays – Java, question-wise):

1. Employee Bonus (10 Employees)
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            salary[i] = input.nextDouble();
            years[i] = input.nextDouble();

            if (salary[i] < 0 || years[i] < 0) {
                i--;
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }
}
2. Youngest & Tallest (Using Arrays)
import java.util.Scanner;

public class FriendsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minIndex])
                minIndex = i;
            if (height[i] > height[maxIndex])
                maxIndex = i;
        }

        System.out.println("Youngest: " + names[minIndex]);
        System.out.println("Tallest: " + names[maxIndex]);
    }
}
3. Largest & Second Largest Digit
import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] digits = new int[10];
        int index = 0;

        while (number != 0 && index < 10) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}
4. Dynamic Resize for Digits Array
import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int max = 10;
        int[] digits = new int[max];
        int index = 0;

        while (number != 0) {
            if (index == max) {
                max += 10;
                int[] temp = new int[max];

                for (int i = 0; i < digits.length; i++)
                    temp[i] = digits[i];

                digits = temp;
            }

            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }
}
5. Reverse Number using Array
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int temp = number;
        int count = 0;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.println("Reversed:");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
6. BMI for Multiple Persons (Arrays)
import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            weight[i] = input.nextDouble();
            height[i] = input.nextDouble() / 100;

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(weight[i] + " " + height[i] + " " + bmi[i] + " " + status[i]);
        }
    }
}
7. BMI using 2D Array
import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double[][] data = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            data[i][0] = input.nextDouble(); // weight
            data[i][1] = input.nextDouble() / 100; // height

            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            if (data[i][2] < 18.5)
                status[i] = "Underweight";
            else if (data[i][2] < 25)
                status[i] = "Normal";
            else if (data[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
        }
    }
}
8. Marks, Percentage & Grade (Arrays)
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double[] phy = new double[n];
        double[] chem = new double[n];
        double[] math = new double[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            phy[i] = input.nextDouble();
            chem[i] = input.nextDouble();
            math[i] = input.nextDouble();

            percent[i] = (phy[i] + chem[i] + math[i]) / 3;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }
    }
}
9. Marks using 2D Array
import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double[][] marks = new double[n][3];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextDouble();
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percent[i] >= 90) grade[i] = "A";
            else if (percent[i] >= 75) grade[i] = "B";
            else if (percent[i] >= 60) grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }
    }
}
10. Frequency of Digits
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] freq = new int[10];

        while (number != 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " occurs " + freq[i] + " times");
        }
    }
}
Level 3 Practice Program (Java – step-by-step as per hint):

Frequency of Digits using Array
import java.util.Scanner;

public class DigitFrequencyDetailed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input
        int number = input.nextInt();
        int temp = number;

        // Step 2: Count digits
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Step 3: Store digits in array
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        // Step 4: Frequency array
        int[] freq = new int[10];

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Step 5: Display result
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}