class Demonstrate{
    public static void main(String[] args) {
        String example = "Hello, World!";

        // charAt()
        char charAtIndex5 = example.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);

        // contains()
        boolean containsWorld = example.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // format()
        String formattedString = String.format("This is a %s example.", "format");
        System.out.println("Formatted string: " + formattedString);

        // length()
        int stringLength = example.length();
        System.out.println("Length of the string: " + stringLength);

        // split()
        String[] words = example.split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}