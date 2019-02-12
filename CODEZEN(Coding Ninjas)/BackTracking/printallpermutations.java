public class solution {

    public static void permutations(String input) {
        // Write your code here
        printpermutation(input, "");

    }

    public static void printpermutation(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char cc = input.charAt(i);
            printpermutation(input.substring(0,i)+input.substring(i+1), output+cc);
        }
        
    }
}
