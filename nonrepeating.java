?
public class nonrepeating {
    public static void main(String[] args) {
        String str = "riya";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
    
    
}
