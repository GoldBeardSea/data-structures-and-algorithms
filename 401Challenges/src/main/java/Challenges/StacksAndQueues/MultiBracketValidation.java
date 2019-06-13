package Challenges.StacksAndQueues;

public class MultiBracketValidation {


    public static boolean multiBracketValidator(String string) {
        if (string.equals("")){
            System.out.println("Balanced but Empty");
            return true;
        }
        Stack<Character> openBracketStack = new Stack<>();
        char current, previous;
        for (int i = 0; i < string.length(); i++) {
            current = string.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                openBracketStack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (openBracketStack.isEmpty()) {
                    return false;
                } else {
                    previous = openBracketStack.peek();
                    if ((current == ')' && previous == '(') ||
                            (current == ']' && previous == '[')
                            || (current == '}' && previous == '{')) {
                        openBracketStack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (!openBracketStack.isEmpty()) {
            return false;
        }
        return true;
    }
}
