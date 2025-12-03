import java.util.Random;
import java.util.Scanner;

public class MyFunctions {
public static void problemNo1() {   

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Name             : ");
    String studentName = scanner.nextLine();
    
    System.out.print("Semester         : ");
    String semester = scanner.nextLine();
    
    System.out.print("School Year      : ");
    String schoolYear = scanner.nextLine();
    
    System.out.print("Degree Program   : ");
    String degreeProgram = scanner.nextLine();
}
public static void problemNo2() {
    int height = 7;
    int width = 5;

    int perimeter = 2 * (height + width);
    int area = height * width;

    System.out.println("Perimeter of the rectangle = " + perimeter);
    System.out.println("Area of the rectangle = " + area);
}
public void problemNo3() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Input the Employee ID (max. 10 chars): ");
    String employeeId = scanner.nextLine();
    
    System.out.print("Input working hours: ");
    int workingHours = scanner.nextInt();
    
    System.out.print("Salary amount per hour: ");
    double hourlyRate = scanner.nextDouble();

    double salary = workingHours * hourlyRate;

    System.out.println("Employee ID = " + employeeId);
    System.out.printf("Salary = U$ %.2f%n", salary);
}
public static void problemNo4() {   
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the first integer: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input the second integer: ");
    int secondNumber = scanner.nextInt();

    System.out.print("Input the third integer: ");
    int thirdNumber = scanner.nextInt();

    int maxValue = firstNumber;

    if (secondNumber > maxValue) maxValue = secondNumber;
    if (thirdNumber > maxValue) maxValue = thirdNumber;

    System.out.println("Maximum value of the three integers: " + maxValue);
}
public static void problemNo5() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input x1: ");
    double x1 = scanner.nextDouble();

    System.out.print("Input y1: ");
    double y1 = scanner.nextDouble();

    System.out.print("Input x2: ");
    double x2 = scanner.nextDouble();

    System.out.print("Input y2: ");
    double y2 = scanner.nextDouble();

    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    System.out.printf("Distance between the said points: %.4f%n", distance);
}
public static void problemNo6() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the amount: ");
    int remainingAmount = scanner.nextInt();

    int count100 = remainingAmount / 100;
    remainingAmount %= 100;

    int count50 = remainingAmount / 50;
    remainingAmount %= 50;

    int count20 = remainingAmount / 20;
    remainingAmount %= 20;

    int count10 = remainingAmount / 10;
    remainingAmount %= 10;

    int count5 = remainingAmount / 5;
    remainingAmount %= 5;

    int count2 = remainingAmount / 2;
    remainingAmount %= 2;

    int count1 = remainingAmount;

    System.out.println("There are:");
    System.out.println(count100 + " Note(s) of 100.00");
    System.out.println(count50 + " Note(s) of 50.00");
    System.out.println(count20 + " Note(s) of 20.00");
    System.out.println(count10 + " Note(s) of 10.00");
    System.out.println(count5 + " Note(s) of 5.00");
    System.out.println(count2 + " Note(s) of 2.00");
    System.out.println(count1 + " Note(s) of 1.00");
}
public static void problemNo7() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input seconds: ");
    int totalSeconds = scanner.nextInt();

    int hours = totalSeconds / 3600;
    totalSeconds %= 3600;

    int minutes = totalSeconds / 60;
    int seconds = totalSeconds % 60;

    System.out.println("There are:");
    System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);
}
public static void problemNo8() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number between 1 to 12 to get the month name: ");
    int monthNumber = scanner.nextInt();

    String monthName;

    switch (monthNumber) {
        case 1:  monthName = "January"; break;
        case 2:  monthName = "February"; break;
        case 3:  monthName = "March"; break;
        case 4:  monthName = "April"; break;
        case 5:  monthName = "May"; break;
        case 6:  monthName = "June"; break;
        case 7:  monthName = "July"; break;
        case 8:  monthName = "August"; break;
        case 9:  monthName = "September"; break;
        case 10: monthName = "October"; break;
        case 11: monthName = "November"; break;
        case 12: monthName = "December"; break;
        default:
            monthName = "Invalid month number";
    }

    System.out.println(monthName);
}
public static void problemNo9() {
    Scanner scanner = new Scanner(System.in);

    int positiveCount = 0;
    int negativeCount = 0;

    for (int i = 1; i <= 5; i++) {
        System.out.print("Input number " + i + ": ");
        int number = scanner.nextInt();

        if (number >= 0)
            positiveCount++;
        else
            negativeCount++;
    }

    System.out.println("Number of positive numbers: " + positiveCount);
    System.out.println("Number of negative numbers: " + negativeCount);
}
public static void problemNo10() {
    Scanner scanner = new Scanner(System.in);
    final int CORRECT_PASSWORD = 1234;

    while (true) {
        System.out.print("Input the password: ");
        int enteredPassword = scanner.nextInt();

        if (enteredPassword == CORRECT_PASSWORD) {
            System.out.println("Correct password");
            break;
        } else {
            System.out.println("Incorrect password");
        }
    }
}
public static void problemNo11() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    System.out.print("Input third number: ");
    int thirdNumber = scanner.nextInt();

    int largestNumber = firstNumber;

    if (secondNumber > largestNumber) largestNumber = secondNumber;
    if (thirdNumber > largestNumber) largestNumber = thirdNumber;

    System.out.println("The largest number is: " + largestNumber);
}
public static void problemNo12() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
        System.out.println(number + " is even.");
    } else {
        System.out.println(number + " is odd.");
    }
}
public static void problemNo13() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input N: ");
    int n = scanner.nextInt();

    int sum = n * (n + 1) / 2;  // Using formula for sum of first N natural numbers

    System.out.println("Sum of first " + n + " natural numbers is: " + sum);
}
public static void problemNo14() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a non-negative integer: ");
    int number = scanner.nextInt();

    if (number < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return;
    }

    long factorial = 1;
    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }

    System.out.println("Factorial of " + number + " is: " + factorial);
}
public static void problemNo15() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number <= 1) {
        System.out.println(number + " is not a prime number.");
        return;
    }

    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}
public static void problemNo16() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int reversedNumber = 0;
    int tempNumber = number;

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        reversedNumber = reversedNumber * 10 + digit;
        tempNumber /= 10;
    }

    System.out.println("Reversed number of " + number + " is: " + reversedNumber);
}
public static void problemNo17() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int sumOfDigits = 0;
    int tempNumber = Math.abs(number); // Handle negative numbers

    while (tempNumber != 0) {
        sumOfDigits += tempNumber % 10;
        tempNumber /= 10;
    }

    System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);
}
public static void problemNo18() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int tempNumber = number;
    int sumOfCubes = 0;

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        sumOfCubes += digit * digit * digit;
        tempNumber /= 10;
    }

    if (sumOfCubes == number) {
        System.out.println(number + " is an Armstrong number.");
    } else {
        System.out.println(number + " is not an Armstrong number.");
    }
}
public static void problemNo19() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input number of terms: ");
    int terms = scanner.nextInt();

    if (terms <= 0) {
        System.out.println("Number of terms must be positive.");
        return;
    }

    int firstTerm = 0, secondTerm = 1;
    System.out.print("Fibonacci series: ");

    for (int i = 1; i <= terms; i++) {
        System.out.print(firstTerm + " ");
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }

    System.out.println();
}
public static void problemNo20() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    int a = firstNumber;
    int b = secondNumber;

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + a);
}
public static void problemNo21() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number <= 1) {
        System.out.println(number + " is not a prime number.");
        return;
    }

    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}
public static void problemNo22() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return;
    }

    long factorial = 1;
    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }

    System.out.println("Factorial of " + number + " is: " + factorial);
}
public static void problemNo23() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int originalNumber = number;
    int reversedNumber = 0;

    while (number != 0) {
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }

    if (originalNumber == reversedNumber) {
        System.out.println(originalNumber + " is a palindrome.");
    } else {
        System.out.println(originalNumber + " is not a palindrome.");
    }
}
public static void problemNo24() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    int a = firstNumber;
    int b = secondNumber;

    // Calculate GCD first
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    int gcd = a;
    int lcm = (firstNumber * secondNumber) / gcd;

    System.out.println("LCM of " + firstNumber + " and " + secondNumber + " is: " + lcm);
}
public static void problemNo25() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int count = 0;
    int tempNumber = Math.abs(number);

    if (tempNumber == 0) count = 1; // Special case for 0

    while (tempNumber != 0) {
        tempNumber /= 10;
        count++;
    }

    System.out.println("Number of digits in " + number + " is: " + count);
}
public static void problemNo26() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int sumOfDigits = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        sumOfDigits += tempNumber % 10;
        tempNumber /= 10;
    }

    System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);
}
public static void problemNo27() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int reversedNumber = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        reversedNumber = reversedNumber * 10 + digit;
        tempNumber /= 10;
    }

    if (number < 0) reversedNumber = -reversedNumber;

    System.out.println("Reversed number: " + reversedNumber);
}
public static void problemNo28() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int originalNumber = number;
    int sumOfCubes = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        sumOfCubes += digit * digit * digit;
        tempNumber /= 10;
    }

    if (originalNumber == sumOfCubes) {
        System.out.println(originalNumber + " is an Armstrong number.");
    } else {
        System.out.println(originalNumber + " is not an Armstrong number.");
    }
}
public static void problemNo29() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input number of terms: ");
    int terms = scanner.nextInt();

    if (terms <= 0) {
        System.out.println("Number of terms should be positive.");
        return;
    }

    long first = 0, second = 1;

    System.out.print("Fibonacci Series: ");
    for (int i = 1; i <= terms; i++) {
        System.out.print(first + " ");
        long next = first + second;
        first = second;
        second = next;
    }
    System.out.println();
}
public static void problemNo30() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    int a = Math.abs(firstNumber);
    int b = Math.abs(secondNumber);

    // Euclidean Algorithm
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + a);
}
public static void problemNo31() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    int a = Math.abs(firstNumber);
    int b = Math.abs(secondNumber);

    // GCD calculation
    int gcd = a, tempB = b;
    while (tempB != 0) {
        int temp = tempB;
        tempB = gcd % tempB;
        gcd = temp;
    }

    // LCM formula: (a * b) / GCD
    long lcm = (long)a * (long)b / gcd;

    System.out.println("LCM of " + firstNumber + " and " + secondNumber + " is: " + lcm);
}
public static void problemNo32() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number <= 1) {
        System.out.println(number + " is not a prime number.");
        return;
    }

    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}
public static void problemNo33() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return;
    }

    long factorial = 1;

    for (int i = 2; i <= number; i++) {
        factorial *= i;
    }

    System.out.println("Factorial of " + number + " is: " + factorial);
}
public static void problemNo34() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int originalNumber = number;
    int reversedNumber = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        reversedNumber = reversedNumber * 10 + digit;
        tempNumber /= 10;
    }

    if (originalNumber < 0) reversedNumber = -reversedNumber;

    if (originalNumber == reversedNumber) {
        System.out.println(originalNumber + " is a palindrome.");
    } else {
        System.out.println(originalNumber + " is not a palindrome.");
    }
}
public static void problemNo35() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int count = 0;
    int tempNumber = Math.abs(number);

    if (tempNumber == 0) count = 1;

    while (tempNumber != 0) {
        count++;
        tempNumber /= 10;
    }

    System.out.println("Number of digits in " + number + " is: " + count);
}
public static void problemNo36() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a positive number: ");
    int n = scanner.nextInt();

    if (n < 1) {
        System.out.println("Number must be positive.");
        return;
    }

    int sum = 0;

    for (int i = 1; i <= n; i++) {
        sum += i;
    }

    System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
}
public static void problemNo37() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int reversedNumber = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        reversedNumber = reversedNumber * 10 + digit;
        tempNumber /= 10;
    }

    if (number < 0) reversedNumber = -reversedNumber;

    System.out.println("Reversed number of " + number + " is: " + reversedNumber);
}
public static void problemNo38() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int sumOfPowers = 0;
    int tempNumber = Math.abs(number);
    int digits = String.valueOf(tempNumber).length();

    int originalNumber = tempNumber;

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        sumOfPowers += Math.pow(digit, digits);
        tempNumber /= 10;
    }

    if (sumOfPowers == Math.abs(number)) {
        System.out.println(number + " is an Armstrong number.");
    } else {
        System.out.println(number + " is not an Armstrong number.");
    }
}
public static void problemNo39() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int sum = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        sum += tempNumber % 10;
        tempNumber /= 10;
    }

    System.out.println("Sum of digits of " + number + " is: " + sum);
}
public static void problemNo40() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
        System.out.println(number + " is even.");
    } else {
        System.out.println(number + " is odd.");
    }
}
public static void problemNo41() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    System.out.print("Input third number: ");
    int thirdNumber = scanner.nextInt();

    int largest = firstNumber;

    if (secondNumber > largest) largest = secondNumber;
    if (thirdNumber > largest) largest = thirdNumber;

    System.out.println("The largest number is: " + largest);
}
public static void problemNo42() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number <= 1) {
        System.out.println(number + " is not a prime number.");
        return;
    }

    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}
public static void problemNo43() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a non-negative number: ");
    int number = scanner.nextInt();

    if (number < 0) {
        System.out.println("Number must be non-negative.");
        return;
    }

    long factorial = 1;

    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }

    System.out.println("Factorial of " + number + " is: " + factorial);
}
public static void problemNo44() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input number of terms: ");
    int terms = scanner.nextInt();

    if (terms <= 0) {
        System.out.println("Number of terms must be positive.");
        return;
    }

    long firstTerm = 0, secondTerm = 1;

    System.out.println("Fibonacci series up to " + terms + " terms:");
    
    for (int i = 1; i <= terms; i++) {
        System.out.print(firstTerm + " ");
        long nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }
    System.out.println();
}
public static void problemNo45() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int originalNumber = number;
    int reversedNumber = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        reversedNumber = reversedNumber * 10 + digit;
        tempNumber /= 10;
    }

    if (number < 0) reversedNumber = -reversedNumber;

    if (originalNumber == reversedNumber) {
        System.out.println(number + " is a palindrome.");
    } else {
        System.out.println(number + " is not a palindrome.");
    }
}
public static void problemNo46() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int sumOfDigits = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        sumOfDigits += tempNumber % 10;
        tempNumber /= 10;
    }

    System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);
}
public static void problemNo47() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int reversedNumber = 0;
    int tempNumber = Math.abs(number);

    while (tempNumber != 0) {
        int digit = tempNumber % 10;
        reversedNumber = reversedNumber * 10 + digit;
        tempNumber /= 10;
    }

    if (number < 0) reversedNumber = -reversedNumber;

    System.out.println("Reversed number: " + reversedNumber);
}
public static void problemNo48() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int tempNumber = Math.abs(number);
    int sumOfPowers = 0;
    int digitsCount = String.valueOf(tempNumber).length();

    int temp = tempNumber;
    while (temp != 0) {
        int digit = temp % 10;
        sumOfPowers += Math.pow(digit, digitsCount);
        temp /= 10;
    }

    if (number < 0) {
        System.out.println(number + " is not an Armstrong number.");
    } else if (sumOfPowers == number) {
        System.out.println(number + " is an Armstrong number.");
    } else {
        System.out.println(number + " is not an Armstrong number.");
    }
}
public static void problemNo49() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    int tempNumber = Math.abs(number);
    int digitsCount = 0;

    if (tempNumber == 0) digitsCount = 1;
    while (tempNumber != 0) {
        tempNumber /= 10;
        digitsCount++;
    }

    System.out.println("Number of digits in " + number + " is: " + digitsCount);
}
public static void problemNo50() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a positive number: ");
    int number = scanner.nextInt();

    if (number < 1) {
        System.out.println("Number must be positive.");
        return;
    }

    int sum = number * (number + 1) / 2;  // Using formula for efficiency
    System.out.println("Sum of natural numbers up to " + number + " is: " + sum);
}
public static void problemNo51() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    int a = Math.abs(firstNumber);
    int b = Math.abs(secondNumber);

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    System.out.println("GCD of " + firstNumber + " and " + secondNumber + " is: " + a);
}
public static void problemNo52() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Input second number: ");
    int secondNumber = scanner.nextInt();

    int a = Math.abs(firstNumber);
    int b = Math.abs(secondNumber);

    int gcd = a;
    int tempB = b;
    while (tempB != 0) {
        int temp = tempB;
        tempB = gcd % tempB;
        gcd = temp;
    }

    int lcm = (firstNumber * secondNumber) / gcd;

    System.out.println("LCM of " + firstNumber + " and " + secondNumber + " is: " + lcm);
}
public static void problemNo53() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = scanner.nextInt();

    if (number <= 1) {
        System.out.println(number + " is not a prime number.");
        return;
    }

    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}
public static void problemNo54() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input the number of prime numbers to print: ");
    int count = scanner.nextInt();

    int printed = 0;
    int number = 2;

    while (printed < count) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print(number + " ");
            printed++;
        }
        number++;
    }
    System.out.println();
}
public static void problemNo55() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a non-negative number: ");
    int number = scanner.nextInt();

    if (number < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return;
    }

    long factorial = 1;
    for (int i = 2; i <= number; i++) {
        factorial *= i;
    }

    System.out.println("Factorial of " + number + " is: " + factorial);
}
public static void problemNo56() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a number to reverse: ");
    int originalNumber = scanner.nextInt();

    int number = originalNumber;
    int reversedNumber = 0;

    while (number != 0) {
        int lastDigit = number % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;
        number /= 10;
    }

    System.out.println("Reversed number of " + originalNumber + " is: " + reversedNumber);
}

    }
