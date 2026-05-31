class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // if (s.length() == 0 || s.length() == 1) {
        //     return false;
        // }

        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        }

        if (s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '{' || s.charAt(s.length() - 1) == '[') {
            return false;
        }

        if (s.length() % 2 == 1) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ')') {
                if (stack.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            }
            if (c == '}') {
                if (stack.pop() == '{') {
                    continue;
                } else {
                    return false;
                }
            }
            if (c == ']') {
                if (stack.pop() == '[') {
                    continue;
                } else {
                    return false;
                }
            }
            stack.push(c);
        }
        return stack.size() == 0;
    }
}
