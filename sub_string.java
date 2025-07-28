public class sub_string {

    public static String char_between_String(String a, int start, int end) {
        String b = "";
        for (int i = start; i < end; i++) {
            b += a.charAt(i);
        }
        return b;
    }

    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println(a.substring(0, 5));// this is BUILDIN function ".substring"
        System.out.println(char_between_String(a, 0, 7));
    }
}
