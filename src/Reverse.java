public class Reverse {

    public static void main(String[] args) {
        String str = "Niteesh";
        char[] charArray = str.toCharArray(); // Convert to char array
        int i = 0;
        int j = charArray.length - 1;

        // Reverse the character array
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        // Convert back to string
        String reversedStr = new String(charArray);
        System.out.println("Reversed string: " + reversedStr);
    }
}
