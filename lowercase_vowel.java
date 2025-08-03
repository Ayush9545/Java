import java.util.*;

public class lowercase_vowel {

    // public static String lower(String n) {
    //     StringBuilder str = new StringBuilder();
    //     Integer count = 0;
    //     for (int i = 0; i < n.length(); i++) {

    //         if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o'
    //                 || n.charAt(i) == 'u') {
    //             count++;
    //         }
    //     }
    //     str.append(count);
    //     return str.toString();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String nam = sc.nextLine();
        System.out.println(lower(nam));
        // String n = "ayush";
        // System.out.println(lower(n));
    }

    public static String lower(String n){
        Integer c = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o'
                           || n.charAt(i) == 'u') {
                c++;
            }

        }
        str.append(c);
        return str.toString();
    }
}

