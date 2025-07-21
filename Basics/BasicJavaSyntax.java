package Basics;

public class BasicJavaSyntax {

    public static void main(String[] args) {

        System.out.println("--- Variables and Data Types ---");

        // Variables and Data Types
        int age = 30; // int: integer type, stores whole numbers
        double price = 99.99; // double: floating-point type, stores decimal numbers
        boolean isActive = true; // boolean: stores true or false
        char initial = 'J'; // char: stores a single character
        String name = "Alice"; // String: class, stores sequence of characters
        char[] nameButInChars = {'A', 'a', 'l', 'i', 'c', 'e'};


        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is Active: " + isActive);
        System.out.println("Initial: " + initial);
        System.out.println("Name: " + name);

        System.out.println("\n--- Type Casting ---");
        // Type Casting
        // Implicit (Widening) Casting: Smaller type to larger type (automatic)
        int myInt = 10;
        double myDouble = myInt; // int to double
        System.out.println("Implicit Cast (int to double): " + myDouble);

        // Explicit (Narrowing) Casting: Larger type to smaller type (manual, may lose data)
        double anotherDouble = 10.55; //-> 10 -> 10.00
        int anotherInt = (int) anotherDouble; // double to int
        System.out.println("Explicit Cast (double to int): " + anotherInt);

        System.out.println("\n--- Operators ---");
        // Operators
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // Relational Operators
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Assignment Operators
        int c = 20;
        c -= 5; // c = c - 5
        System.out.println("c after c += 5: " + c);

        System.out.println("\n--- Expression Statements and Blocks ---");
        // Expression Statements and Blocks
        int sum = 5 + 3; // This is an expression statement
        System.out.println("Sum: " + sum); // This is also an expression statement

        // A block of code (enclosed in curly braces)
        {
            String message = "This is inside a block.";
            System.out.println(message);
            // Variables declared inside a block are typically block-scoped
        }
        // System.out.println(message); // This would cause a compile-time error

        System.out.println("\n--- Conditionals (if-else if-else) ---");
        // Conditionals (if-else if-else)
        int score = 75;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        System.out.println("\n--- Switch Cases ---");
        // Switch Cases
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                System.out.println("Monday");
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is: " + dayName);

        System.out.println("\n--- Loops ---");
        // Loops

        // For loop
        System.out.println("For loop (0 to 4):");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While loop
        System.out.println("While loop (0 to 2):");
        int j = 0;
        while (j < 3) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // Do-While loop
        System.out.println("Do-While loop (at least once):");
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 1); // Executes at least once even if condition is false
        System.out.println();

        System.out.println("\n--- Functions (Methods) ---");
        // Calling functions (methods)
        int result = addNumbers(5, 7); // Calling a function with parameters
        System.out.println("Sum of 5 and 7: " + result);

        greetUser("Charlie"); // Calling a void function

        double circleArea = calculateCircleArea(5.0);
        System.out.println("Area of circle with radius 5.0: " + circleArea);
    }

    // Function with return type and parameters
    // Return Type: int (the type of value this function will return)
    // Parameters: int num1, int num2 (values passed into the function)
    public static int addNumbers(int num1, int num2) {
        return num1 + num2; // Returns the sum of num1 and num2
    }

    // Function with no return type (void) and one parameter
    // Return Type: void (this function does not return any value)
    // Parameter: String userName
    public static void greetUser(String userName) {
        System.out.println("Hello, " + userName + "!");
    }

    // Function demonstrating a double return type and a double parameter
    public static double calculateCircleArea(double radius) {
        // Math.PI is a constant for the value of Pi
        return Math.PI * radius * radius;
    }
}
