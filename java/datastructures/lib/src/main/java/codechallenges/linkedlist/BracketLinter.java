package codechallenges.linkedlist;

import datastructures.linkedlist.Stack;

public class BracketLinter {
    public static boolean bracketLinter(String s) {
      Stack<String> stack = new Stack<>();

      for (char c : s.toCharArray()) {
        if (c == '{' || c == '[' || c == '(') {
          stack.push(String.valueOf(c));
        }

        if (c == '}' && !stack.isEmpty() && stack.peek().equals("{")) {
          stack.pop();
          if (!stack.isEmpty() && !stack.peek().equals("{")) {
            return false;
          }
        } else if (c == ']' && !stack.isEmpty() && stack.peek().equals("[")) {
          stack.pop();
          if (!stack.isEmpty() && !stack.peek().equals("[")) {
            return false;
          }
        } else if (c == ')' && !stack.isEmpty() && stack.peek().equals("(")) {
          stack.pop();
          if (!stack.isEmpty() && !stack.peek().equals("(")) {
            return false;
          }
        }
      }

      return stack.isEmpty();
    }
  }








