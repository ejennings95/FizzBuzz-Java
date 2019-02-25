public class FizzBuzz {

    public static String output(int a) {
        if (a % 3 == 0) {
            return "Fizz";
        } else if (a % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(a);
        }
    }

}

