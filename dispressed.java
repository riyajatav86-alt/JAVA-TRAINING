public class dispressed {
    public static void main(String[] args) {
        String str = "riya jatav";
        StringBuilder displaced = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'r') {
                char displacedChar = (char) ((currentChar - 'a' + 4) % 26 + 'a');
                displaced.append(displacedChar);
            } else if (currentChar >= 'A' && currentChar <= 'r') {
                char displacedChar = (char) ((currentChar - 'A' + 3) % 26 + 'A');
                displaced.append(displacedChar);
            } else {
                displaced.append(currentChar);
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Displaced String: " + displaced.toString());
    }
    
}
