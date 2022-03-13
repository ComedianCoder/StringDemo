public class PrintDemo {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        float f = 33.44f;
        char c = 'd';

        //Prints the string argument and a new line
        System.out.println("Deepak");
        System.out.println("Somasundaram");

        //Prints the string argument and no new line is added
        System.out.print("Comedian");
        System.out.print("Coder");
        System.out.print("\n");

        // Precedence is from left to right. But before concatenation could happen, the expression inside brackets is calculated first.
        System.out.println("Number is " + (a + b));
        //Without any brackets, the precedence is from left to right. "Number is" is a String value. This String value is concatenated with int value of a and the resultant string is concatenated with int value of b
        //Here addition doesn't happen between a and b as there are no brackets and as concatenation took precedence.
        System.out.println("Number is " + a + b);

        //Precedence is from left to right. Int value of a and b are added. And then the result is concatenated with String value.
        System.out.println(a + b + " is the number");

        //Precedence is from left to right. Expression inside the brackets is calculated first and then the resultant value is concatenated with String.
        System.out.println((a + b) + " is the number");

    }

}
