/* Duplicate parentheses */
/* Given a balanced expression, find if it contain duplicate parentheses or not.A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses */
/* 
 * Return true if it conatins duplicate else return false.
 * example:- (((a+(b)))+(c+d))- true
 *        :- ((a+b)+(c+d))- false
 * O(n)
 */

 import java.util.Stack;

 public class DuplicateParentheses {
 public static boolean isDuplicate(String str) {
     Stack<Character> s = new Stack<>();
     for (int i = 0; i < str.length(); i++) {
       char ch = str.charAt(i);
       //opening, closing, operands
 
       //closing
       if (ch == ')') {
         int count = 0;
         while (s.peek() != '(') {
           s.pop();
           count++;
         }
         if (count < 1) {
           return true;//duplicate
         } else {
           s.pop();//opening pair
         }
       } else {
         //opening
         s.push(ch);
       }
     }
     return false;
   }
   public static void main(String[] args) {
     String str1 = "((a+b))";
     String str2 = "(a-b)";
     System.out.println(isDuplicate(str1));/*  */
     System.out.println(isDuplicate(str2));/*  */
   }
 }
 