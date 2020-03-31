public class FizzBuzzTranslate {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public static String translate(int number) {
       if (isDivisibleByThreeAndFive(number)) {
           return FIZZ_BUZZ;
       }
        if (isDivisibleByFive(number)) {
            return BUZZ;
        }
        if (isDivisibleByThree(number)) {
            return FIZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isDivisibleByThreeAndFive(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
