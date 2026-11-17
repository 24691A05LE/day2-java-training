public class operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // 1. ARITHMETIC OPERATORS
        System.out.println("----- Arithmetic Operators -----");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


 // 2. UNARY OPERATORS
        System.out.println("\n----- Unary Operators -----");

        int x = 5;

        System.out.println("Unary Plus: " + (+x));
        System.out.println("Unary Minus: " + (-x));
        System.out.println("Pre Increment: " + (++x));
        System.out.println("Post Increment: " + (x++));
        System.out.println("After Increment: " + x);
        System.out.println("Pre Decrement: " + (--x));
        System.out.println("Post Decrement: " + (x--));
        System.out.println("After Decrement: " + x);

        // 3. RELATIONAL OPERATORS
        System.out.println("\n----- Relational Operators -----");

        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("Greater or Equal: " + (a >= b));
        System.out.println("Less or Equal: " + (a <= b));


        // 4. LOGICAL OPERATORS
        System.out.println("\n----- Logical Operators -----");

        boolean p = true;
        boolean q = false;

        System.out.println("AND: " + (p && q));
        System.out.println("OR: " + (p || q));
        System.out.println("NOT: " + (!p));


        // 5. ASSIGNMENT OPERATORS
        System.out.println("\n----- Assignment Operators -----");

        int n = 10;

        System.out.println("Initial: " + n);

        n += 5;
        System.out.println("Add Assignment: " + n);

        n -= 3;
        System.out.println("Subtract Assignment: " + n);

        n *= 2;
        System.out.println("Multiply Assignment: " + n);

        n /= 4;
        System.out.println("Divide Assignment: " + n);

        n %= 3;
        System.out.println("Modulus Assignment: " + n);


        // 6. BITWISE OPERATORS
        System.out.println("\n----- Bitwise Operators -----");

        int m = 5;
        int k = 3;

        System.out.println("Bitwise AND: " + (m & k));
        System.out.println("Bitwise OR: " + (m | k));
        System.out.println("Bitwise XOR: " + (m ^ k));
        System.out.println("Bitwise NOT: " + (~m));


        // 7. SHIFT OPERATORS
        System.out.println("\n----- Shift Operators -----");

        int num = 8;

        System.out.println("Left Shift: " + (num << 1));
        System.out.println("Right Shift: " + (num >> 1));
        System.out.println("Unsigned Right Shift: " + (num >>> 1));


        // 8. TERNARY OPERATOR
        System.out.println("\n----- Ternary Operator -----");

        int age = 20;

        String result = (age >= 18) ? "Eligible" : "Not Eligible";

        System.out.println("Result: " + result);

    }
}

