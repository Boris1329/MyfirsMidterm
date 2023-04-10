package math.problems;

public class Factorial {

        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        public int factorial (int number){
            int n = 1;
            int fact = 1;

            for (n=1; n<number;n++){

                fact = fact *n;

            }
            return fact;
        }

        public static void main(String[] args) {

            Factorial factorial = new Factorial();
            factorial.factorial(7);


        }

}



