public class Test3_Gulsah {
    public static void main(String[] args) {

        // lets remember for loop, sum of even numbers
        int sum= 0;
        for (int i = 0; i <= 10; i+=2) {
            sum+= i;
        }
        System.out.println(sum);
       // System.exit(0);

        System.out.println("_____________________reversing with loop_____________________this is Havva:)");
        String name = "reverse";
        String reversed = "";
        for (int i = name.length()-1; i >= 0; i--) {
            reversed+=name.charAt(i);
        }
        System.out.println(reversed);
    }

}
