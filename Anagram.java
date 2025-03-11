import java.util.Arrays;
import java.util.Scanner;

class Anagram {
    public static void main(String[] args) {
    	
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);
        System.out.println(result);
    }
    
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }
}


