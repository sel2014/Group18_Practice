public class RemoveDuplicates {

    public static void main(String[] args) {

        String name = "Muuhhhhttaaaar";
        System.out.println(removeDuplicates(name));
    }

    public static String removeDuplicates(String str){

        String nonDuplicates = "";

        char[] chars = str.toCharArray();

        for (char eachChar : chars) {
            if (!nonDuplicates.contains(""+eachChar)){
                nonDuplicates+=eachChar;
            }
        }
        return nonDuplicates;

    }

}
/*
Create a method that can remove duplicates from
any given String.
input = "Muuhhhhttaaaar"
output = "Muhtar"

 */
