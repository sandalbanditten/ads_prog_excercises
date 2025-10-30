// Version: 20200917
// Handin done by:
//   202508292 Ida Tragstrup
//   202505728 Tobias Clasen
//   202509301 Rasmus Poulsen
// Contributions:
//   Rasmus Poulsen - Has written the code

import java.util.*;
public class ReversePolishCalculator {
    private ArrayList<Integer> stack = new ArrayList<>();

    // Add any private fields you might need here
    public void push(int n) {
        stack.add(n);
    }

    public void plus() {
        int i = pop();
        int j = pop();
        push(i+j);
    }

    public void minus() {
        int i = pop();
        int j = pop();
        push(j-i);
    }

    public void times() {
        int i = pop();
        int j = pop();
        push(i*j);
    }

    public int read() {
        return stack.getLast();
    }

    private int pop(){
        int i = stack.getLast();
        stack.removeLast();
        return i;
    }
}
