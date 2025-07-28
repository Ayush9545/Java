public class palindrom {

    public static boolean check(String name) {
        for (int i = 1; i < name.length() / 2; i++) {
            int n = name.length();
            if (name.charAt(i) == name.charAt(n - 1 - i)) { // by using this there is very big flaw see the thing is if
                                                            // we are having same initial and last char same then it
                                                            // return TRUE even if IT IS NOT PALIDRON
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "racecar";
        System.out.println(check(name));
    }
}
