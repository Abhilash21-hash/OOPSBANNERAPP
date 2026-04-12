//Level 1 Practice Programs (question-wise in Java)://
//1. Check if number is divisible by 5//

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        boolean result = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}
//2. Check if first number is smallest//
import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        boolean isSmallest = (n1 < n2 && n1 < n3);

        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
//3. Check which number is largest//
import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.println("Is the first number the largest? " + (n1 > n2 && n1 > n3));
        System.out.println("Is the second number the largest? " + (n2 > n1 && n2 > n3));
        System.out.println("Is the third number the largest? " + (n3 > n1 && n3 > n2));
    }
}
//4. Sum of n Natural Numbers//
import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
//5. Voting Eligibility//
import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
//6. Positive, Negative or Zero//
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
//7. Spring Season Check//
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int day = input.nextInt();

        if ((month == 3 && day >= 20) ||
            (month == 4 || month == 5) ||
            (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
//8. Countdown using while loop//
import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
//9. Countdown using for loop//
import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
//10. Sum until user enters 0//
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double num = input.nextDouble();

        while (num != 0) {
            total += num;
            num = input.nextDouble();
        }

        System.out.println("Total = " + total);
    }
}
//11. Sum until 0 or negative (break)//
import java.util.Scanner;

public class SumBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }

            total += num;
        }

        System.out.println("Total = " + total);
    }
}
//12. Sum of n Natural Numbers (while loop)//
import java.util.Scanner;

public class SumCompareWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int sumLoop = 0;
            int i = 1;

            while (i <= n) {
                sumLoop += i;
                i++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
        }
    }
}
//13. Sum using for loop//
import java.util.Scanner;

public class SumCompareFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int sumLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Loop Sum = " + sumLoop);
            System.out.println("Formula Sum = " + sumFormula);
        }
    }
}
//14. Factorial using while loop//
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int fact = 1;
            int i = 1;

            while (i <= n) {
                fact *= i;
                i++;
            }

            System.out.println("Factorial = " + fact);
        }
    }
}
//15. Factorial using for loop//
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n > 0) {
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial = " + fact);
        }
    }
}