public class reverse {
    public static void main(String[] args) {
        String str = "reverse";
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {
        System.out.println("_____________________reversing with loop_____________________this is Havva:)");
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
