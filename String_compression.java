public class String_compression {

    public static String con(String n) {
        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < n.length(); i++) {
            Integer count = 1;
            while (i < n.length() - 1 && n.charAt(i) == n.charAt(i + 1)) {
                count++;
                i++;
            }
            str.append(n.charAt(i));
            if (count > 1) {
                str.append(count);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String a = "aaabbcccd";
        System.out.println(con(a));
    }
}
