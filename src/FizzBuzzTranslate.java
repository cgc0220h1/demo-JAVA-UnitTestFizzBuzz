public class FizzBuzzTranslate {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public static String translate(int number) {
        if (isDivisibleByThreeAndFive(number)) {
            return FIZZ_BUZZ;
        }
        if (isDivisibleByFive(number)
                || isContainedFive(number)) {
            return BUZZ;
        }
        if (isDivisibleByThree(number)
                || isContainedThree(number)) {
            return FIZZ;
        }
        if (isLowerThan100(number)) {
            return readNumber(number);
        }
        return String.valueOf(number);
    }

    private static boolean isLowerThan100(int number) {
        return number < 100;
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

    private static boolean isContainedThree(int number) {
        String str = String.valueOf(number);
        char[] chars = str.toCharArray();
        for (char character : chars) {
            if (character == '3') {
                return true;
            }
        }
        return false;
    }

    private static boolean isContainedFive(int number) {
        String str = String.valueOf(number);
        char[] chars = str.toCharArray();
        for (char character : chars) {
            if (character == '5') {
                return true;
            }
        }
        return false;
    }

    private static String readNumber(int number) {
        String str = String.valueOf(number);
        char[] chars = str.toCharArray();
        String strResult = "";
        int index = 0, whiteSpace = index + 1;
        for (; index < chars.length; index++, whiteSpace++) {
            switch (chars[index]) {
                case '1':
                    strResult += "mot";
                    break;
                case '2':
                    strResult += "hai";
                    break;
                case '4':
                    strResult += "bon";
                    break;
                case '6':
                    strResult += "sau";
                    break;
                case '7':
                    strResult += "bay";
                    break;
                case '8':
                    strResult += "tam";
                    break;
                case '9':
                    strResult += "chin";
                    break;
            }
            if (whiteSpace < chars.length) {
                strResult += " ";
            }
        }
        return strResult;
    }
}
