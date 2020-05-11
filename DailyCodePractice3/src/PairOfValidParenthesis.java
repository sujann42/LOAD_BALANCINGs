import java.util.Stack;

public class PairOfValidParenthesis {

    public static void main(String[] args) {
        String s = "(*)";
        checkValidString(s);
    }
    public static boolean checkValidString(String s) {
        if(s.isEmpty()){
            return true;
        }
        if(s.startsWith(")") || s.startsWith("*")){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(stack.isEmpty()){
                if(s.startsWith(")")){
                    return false;
                }else {
                    stack.push(s.charAt(i));
                }
            }else {

            }
        }

    return true;
    }

}
