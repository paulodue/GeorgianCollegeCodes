public class Question9 {

        String string1 = "gun";
        Integer int1 = 11;


        public void checkingContentOfString1 () {
            boolean checkingString1 = string1.contentEquals("gun");

            if (checkingString1) {
                System.out.println("999");
            } else {
                System.out.println("The string is not equals gun");
            }
        }

        public Integer showingNumberOfCharacters () {
            return string1.length();
        }

        public void intOccurrence() {
            String s1 = "Im testing string length";
            int ingPlace = s1.indexOf("ing");
            if (ingPlace >= 0) {
                System.out.println("Index of first 'ing': " + ingPlace);
            } else System.out.println("'ing' not found in string.");
        }

        public String stringToLowerCase () {
            return string1.toLowerCase();
        }

        public void intEvenOrOdd () {

            if (int1 % 2 == 0) {
                System.out.println("The number " + int1 + " is Even");
            } else
                System.out.println("The number " + int1 + " is Odd");
        }

        public void checkingLengthWithIntVariable () {
            int checkingInt1Length = String.valueOf(int1).length();
            if (string1.length() == checkingInt1Length) {
                System.out.println("The String variable and Integer Variable have the same length");
            } else System.out.println("Both variables don't hava the same length :(");

        }
}
