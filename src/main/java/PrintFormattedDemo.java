public class PrintFormattedDemo {

    public static void main(String[] args) {

        //printf --> Takes two arguments 1. String format 2 Object... varargs
        System.out.printf(""); // Prints nothing
        System.out.printf("\n"); // Prints a new line
        System.out.printf("Comedy"); // Prints Comedy without a new line
        System.out.printf("Coder"); // Prints Coder without a new line

        /*
        Format Specifier
        %[argument_index$][flags][width][.precision]conversion
        argument index : 1$ 2$ 3$ 4$ 5$ and so on
        flag '-' '+' '0' '' '('
        conversion :
        char c
        int, byte and short d o x
        float f e g
        String s
        * */

        int first_num = 100;
        int second_num = 4;
        float float_var = 4.4f;
        char character = 'd';

        System.out.printf("%c %c \n",character,character); // Prints two characters d d
        System.out.printf("%d %d %d", first_num,second_num,first_num); // Prints num as expected 100 4 100
        //System.out.printf("%d %f", float_var,first_num); // Throws IllegalFormatException as first argument expected is whole number but the argument actually supplied is floating number.

        //Without argument index the order in which arguments are passed are strictly checked as shown above.
        // If we need to pass arguments in different order its better to use argument index

        System.out.printf("%2$d %1$f %3$d", float_var,first_num,second_num);
        // %2$d --> Refer 2nd argument
        // %1$f --> Refer 1st argument
        // %3$d --> Refer 3rd argument

        // Also with the argument indexes we can print the same argument multiple times
        System.out.printf("%1$f %1$f %2$d %1$f %1$f", float_var,second_num);
        System.out.printf("\n");

        // Width

        int third_num = 3;

        System.out.printf("Third number is " + "%d",third_num);
        System.out.printf("\n");

        //Below expression sets width as 5. Here the output of third_num will be printed at position 5.
        System.out.printf("Third number is " + "%5d", third_num); // Output: Third number is     3

        System.out.printf("\n");

        //For a two digit number with width as 5, the positions occupied by the number are 4 and 5.
        int two_digit_number = 55;
        System.out.printf("Two digit number is "+"%5d",two_digit_number);

        System.out.printf("\n");

        // Flag

        //Below expression sets width as 5. So the value of third_num wll be printed at position 5.
        //But there is also a flag '0' preceding before 5. Which means 0 will be printed at position 1 2 3 and 4.
        System.out.printf("Third number is " + "%05d", third_num); // Output: Third number is 00003

        System.out.printf("\n");

        int fourth_num = 4;

        // Brackets is the flag here. Negative numbers will be displayed within brackets. Positive numbers will be displayed without brackets.
        System.out.printf("Fourth number is " + "%(d",fourth_num); // Output
        System.out.printf("\n");


        // Precision
        float another_float = 23.46f;

        // Prints the value of another_float with default precision
        System.out.printf("%f",another_float); // Output is 23.459999

        System.out.printf("\n");

        // Expected with as per expression is 1. But the actual width of "another_float" is 5. 23.46
        //As the actual width is more than the expected width, default precision itself is followed
        System.out.printf("%1f",another_float); // Output is 23.459999
        System.out.printf("\n");

        // Expected width is 10. As the default precision gives a 9 digit number. Another space will be added at the output before the resultant value.
        System.out.printf("%10f",another_float); // Output is  23.459999
        System.out.printf("\n");

        // Expected width is 5. With decimal precision of .2 included to the total width.
        System.out.printf("%5.2f",another_float); // Output is 23.46
        System.out.printf("\n");

        // Expected width is 6. With decimal precision of .2 included to the total width.
        System.out.printf("%6.2f",another_float); // Output is  23.46. Note that there is a space before 2 to cover the expected width 6
        System.out.printf("\n");

        // Expected width is 6. With decimal precision of .1 included to the total widht
        System.out.printf("%6.1f",another_float); // Output is   23.5. Note that there are two spaces before 2 to cover the expected width 6. Here the decimal precision is 1.
        System.out.printf("\n");

        String whatString = "ComedianMrBean";

        System.out.printf(whatString);
        System.out.printf("\n");

        System.out.printf("%s",whatString);
        System.out.printf("\n");

        //Expected width is 2. As the length of the whatString is more than 2, the width parameter is ignored and the value of whatString is printed as such.
        System.out.printf("%2s", whatString);
        System.out.printf("\n");

        //Expected width is 20. As the length of the whatString is lesser than 20, at the beginning spaces are added to cover the expected width of 20.
        System.out.printf("%20s", whatString);
        System.out.printf("\n");

        //Negative flag - included here
        //Expected width is 20. As the length of the whatString is lesser than 20 and there is a negative flag, at the end spaces are added to cover the expected width of 20.
        System.out.printf("%-20s", whatString);
        System.out.printf("\n");

        //Here %s points to the String argument "Comedians" and %n points to new line
        System.out.printf("Hello %s! %n", "Comedians");




    }

}
