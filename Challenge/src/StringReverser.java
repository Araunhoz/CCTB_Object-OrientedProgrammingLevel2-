public class StringReverser {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
