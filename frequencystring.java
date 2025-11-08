public class frequencystring {
    public static void main(String[] args) {
        
        String str = "hello world";
        int[] freq = new int[256]; // ASCII character set size

        // Calculate frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print frequency of each character
        System.out.println("Character Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
    
}
