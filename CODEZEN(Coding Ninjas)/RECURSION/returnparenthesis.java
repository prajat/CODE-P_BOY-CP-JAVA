import java.util.*;
/**
 * returnparenthesis
 */
public class returnparenthesis {
    public static void main(String[] args) {
       findParenthesis(3);
    }

    public static void findParenthesis(int n) {

        ArrayList<String> list = new ArrayList<>();
        findParenthesis(n, 0, 0, list, "");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        String[] arr = new String[list.size()];
        list.toArray(arr);
        System.out.println(arr[0]);
        
    }

    public static void findParenthesis(int n, int open, int close, ArrayList<String> list,String output) {
        

        if (close == n) {
            list.add(output);
            return;
            
        }

        if (open > close) {
           
            
            findParenthesis(n, open, close + 1, list, output + ")");
        }
        if (open < n) {
            
            findParenthesis(n, open + 1, close, list,output+"(");
        }
        
        
    }
    
    
}