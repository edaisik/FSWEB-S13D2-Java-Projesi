public class Main {
    public static void main(String[] args) {

        System.out.println("case1: " + isPalindrome(-1221));
        System.out.println("case1: " + isPalindrome(707));
        System.out.println("case1: " + isPalindrome(11212));

        System.out.println("case1: " + isPalindrome2(-1221));
        System.out.println("case1: " + isPalindrome2(707));
        System.out.println("case1: " + isPalindrome2(11212));


        System.out.println("case1: " + isPerfectNumber(6));
        System.out.println("case1: " + isPerfectNumber(28));
        System.out.println("case1: " + isPerfectNumber(5));
        System.out.println("case1: " + isPerfectNumber(-1));

        System.out.println("case1: " + numberToWords(123));
        System.out.println("case1: " + numberToWords(1010));
        System.out.println("case1: " + numberToWords(-12));

    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];

        }
        return reversed.equals(String.valueOf(number));
    }

    // 121
    public static boolean isPalindrome2(int number) {
        number = Math.abs(number); // 121
        int originalNum = number; // originalNum = 121
        int reverseNumber = 0; // reverseNumber = 0

        // 121  12  1
        while (number > 0) {
            int digit = number % 10; // digit = 1 digit = 2 digit = 1
            reverseNumber = reverseNumber * 10 + digit; // reverseNumber =1 reverseNumber = 12 reverseNumber = 121
            number = number / 10; // number = 12 number = 1 number = 0
        }
        return originalNum == reverseNumber;

    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;

    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }
        String text = "";
        char[] numArray = String.valueOf(num).toCharArray();
        for (char digit : numArray) {
            switch (digit) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }
        }
        return text.trim();
    }
}
